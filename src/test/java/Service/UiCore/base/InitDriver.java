package base;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

public class InitDriver {
	// import static org.testng.Assert.*; JDK-1.8的新功能，导入testng所有的静态方法

	private static Logger logger = Logger.getLogger(InitDriver.class);
	
	// 全部变量，对象的属性
	public static WebDriver driver = null;

	@BeforeSuite
	@Parameters(value = { "browserType", "driverPath", "sleniumVersion" })
	public void beforeSuite(String browserType, String driverPath, String sleniumVersion) {
		// 将browserType字符串转化成小写
		String browserTypeLowerCase = browserType.toLowerCase();
		// 如果是ie浏览器
		if (("ie").equals(browserTypeLowerCase)) {
			// 1:驱动文件找不到的异常
			System.setProperty("webdriver.ie.driver", driverPath);
			// 创建一个设置对象，用来设置创建ie驱动时的各种设置
			DesiredCapabilities capabilities = new DesiredCapabilities();
			// 2.取消ie的安全设置
			capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
			// 3.忽略浏览器的页面缩放设置
			capabilities.setCapability(InternetExplorerDriver.IGNORE_ZOOM_SETTING, true);
			// 4.设置一个初始化页面，防止windows对象丢失
			capabilities.setCapability(InternetExplorerDriver.INITIAL_BROWSER_URL, "http://www.baidu.com");
			// 5.允许浏览器运行js脚本
			capabilities.setJavascriptEnabled(true);
			driver = new InternetExplorerDriver(capabilities);
			logger.info("创建ie游览器驱动完毕");

		} else if (("chrome").equals(browserTypeLowerCase)) {
			DesiredCapabilities capabilities = new DesiredCapabilities();
			// 设置谷歌驱动设置
			System.setProperty("webdriver.chrome.driver", driverPath);
			// 5.允许浏览器运行js脚本
			driver = new ChromeDriver(capabilities);
			logger.info("创建谷歌驱动完毕");

		} else if (("firefox").equals(browserTypeLowerCase)) {
			DesiredCapabilities capabilities = new DesiredCapabilities();
			capabilities.setJavascriptEnabled(true);
			// 设置火狐驱动准备
			System.setProperty("webdriver.firefox.bin", "D:\\firefox\\firefox.exe");
			// 判断selenium的版本是否需要驱动
			if (("3.x").equals(sleniumVersion)) {
				System.setProperty("webdriver.gecko.driver", driverPath);
			}
			// 创建一个火狐的driver
			driver = new FirefoxDriver(capabilities);
			logger.info("创建火狐驱动完毕");
		}
	}

	/**
	 * 测试完毕，关闭浏览器
	 * 
	 * @throws InterruptedException
	 */
	@AfterSuite
	public void afterClass() throws InterruptedException {
		logger.info("测试完毕，关闭浏览器");
		driver.quit();
	}

}
