package Service.UiCore.base;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import java.io.File;
import java.util.Arrays;
import java.util.Comparator;

public class InitDriver {

	private static Logger logger = Logger.getLogger(InitDriver.class);

	/** 低于此体积的 chromedriver 多半是旧版（如 85），与当前 Chrome 不兼容 */
	private static final long MIN_USABLE_CHROMEDRIVER_BYTES = 15_000_000L;

	public static WebDriver driver = null;

	@BeforeSuite
	@Parameters(value = { "browserType", "driverPath", "sleniumVersion"})
	public void beforeSuite(String browserType, String driverPath, String sleniumVersion) {
		String browserTypeLowerCase = browserType.toLowerCase();
		if (("ie").equals(browserTypeLowerCase)) {
			System.setProperty("webdriver.ie.driver", driverPath);
			InternetExplorerOptions options = new InternetExplorerOptions();
			options.introduceFlakinessByIgnoringSecurityDomains();
			options.ignoreZoomSettings();
			options.withInitialBrowserUrl("http://www.baidu.com");
			driver = new InternetExplorerDriver(options);
			logger.info("创建ie游览器驱动完毕");

		} else if (("chrome").equals(browserTypeLowerCase)) {
			ChromeOptions options = new ChromeOptions();
			String resolved = resolveChromeDriverPath(driverPath);
			if (resolved != null) {
				System.setProperty("webdriver.chrome.driver", resolved);
				ChromeDriverService service = new ChromeDriverService.Builder()
						.usingDriverExecutable(new File(resolved))
						.build();
				driver = new ChromeDriver(service, options);
				logger.info("创建谷歌驱动完毕，使用: " + resolved);
			} else {
				// 无本地可用驱动时才走 Selenium Manager（可能因网络卡住）
				System.clearProperty("webdriver.chrome.driver");
				logger.info("使用 Selenium Manager 自动匹配 ChromeDriver（与本机 Chrome 版本对齐）");
				driver = new ChromeDriver(options);
				logger.info("创建谷歌驱动完毕");
			}

		} else if (("firefox").equals(browserTypeLowerCase)) {
			FirefoxOptions options = new FirefoxOptions();
			File firefoxBin = new File("D:\\firefox\\firefox.exe");
			if (firefoxBin.isFile()) {
				options.setBinary(firefoxBin.getAbsolutePath());
			}
			if (("3.x").equals(sleniumVersion) || isManualDriverPath(driverPath)) {
				System.setProperty("webdriver.gecko.driver", driverPath);
			}
			driver = new FirefoxDriver(options);
			logger.info("创建火狐驱动完毕");
		}
	}

	/**
	 * 解析 ChromeDriver 路径，优先本地以免 Selenium Manager 联网卡住。
	 * 顺序：WD_CHROME_DRIVER → TestNG driverPath（且非过旧）→ ~/.cache/selenium 缓存 → null(走 SM)
	 */
	private static String resolveChromeDriverPath(String driverPath) {
		String envDriver = System.getenv("WD_CHROME_DRIVER");
		if (isUsableChromeDriverFile(envDriver)) {
			logger.info("使用环境变量 WD_CHROME_DRIVER: " + envDriver);
			return envDriver.trim();
		}

		if (isManualDriverPath(driverPath)) {
			File configured = new File(driverPath.trim());
			if (isLikelyObsoleteChromeDriver(configured)) {
				logger.warn("TestNG driverPath 疑似过旧（体积过小），跳过: " + configured.getAbsolutePath());
			} else {
				logger.info("使用 TestNG driverPath: " + configured.getAbsolutePath());
				return configured.getAbsolutePath();
			}
		}

		String cached = findCachedChromeDriver();
		if (cached != null) {
			logger.info("使用 Selenium 本地缓存 ChromeDriver: " + cached);
			return cached;
		}
		return null;
	}

	/**
	 * driverPath 为 auto / 空 / 非文件时走 Selenium Manager；否则使用本地驱动。
	 */
	private static boolean isManualDriverPath(String driverPath) {
		if (driverPath == null) {
			return false;
		}
		String path = driverPath.trim();
		if (path.isEmpty() || "auto".equalsIgnoreCase(path)) {
			return false;
		}
		return new File(path).isFile();
	}

	private static boolean isUsableChromeDriverFile(String path) {
		if (path == null || path.trim().isEmpty()) {
			return false;
		}
		File file = new File(path.trim());
		return file.isFile() && !isLikelyObsoleteChromeDriver(file);
	}

	private static boolean isLikelyObsoleteChromeDriver(File file) {
		return file.length() < MIN_USABLE_CHROMEDRIVER_BYTES;
	}

	/**
	 * 查找 ~/.cache/selenium/chromedriver 下最新的本地缓存驱动，避免联网下载卡住。
	 */
	private static String findCachedChromeDriver() {
		File cacheRoot = new File(System.getProperty("user.home"), ".cache/selenium/chromedriver");
		if (!cacheRoot.isDirectory()) {
			return null;
		}
		File[] platformDirs = cacheRoot.listFiles(File::isDirectory);
		if (platformDirs == null) {
			return null;
		}
		File best = null;
		for (File platformDir : platformDirs) {
			File[] versionDirs = platformDir.listFiles(File::isDirectory);
			if (versionDirs == null || versionDirs.length == 0) {
				continue;
			}
			Arrays.sort(versionDirs, Comparator.comparing(File::getName).reversed());
			for (File versionDir : versionDirs) {
				File driverFile = new File(versionDir, "chromedriver.exe");
				if (!driverFile.isFile()) {
					driverFile = new File(versionDir, "chromedriver");
				}
				if (driverFile.isFile() && !isLikelyObsoleteChromeDriver(driverFile)) {
					if (best == null || versionDir.getName().compareTo(best.getParentFile().getName()) > 0) {
						best = driverFile;
					}
					break;
				}
			}
		}
		return best == null ? null : best.getAbsolutePath();
	}

	/**
	 * 测试完毕，关闭浏览器
	 *
	 * @throws InterruptedException
	 */
	@AfterSuite
	public void afterClass() throws InterruptedException {
		logger.info("测试完毕，关闭浏览器");
		if (driver != null) {
			driver.quit();
		}
	}

}
