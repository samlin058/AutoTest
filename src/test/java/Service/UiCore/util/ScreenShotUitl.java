package util;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import base.InitDriver;

public class ScreenShotUitl {
    
	private static Logger logger = Logger.getLogger(ScreenShotUitl.class);
    
	/**
	 * 截图操作
	 * @param    screenShotDir   截图目录
	 * @return   File            截图文件
	 *
	 * @author       luandao
	 * @Date         2020年9月30日 
	 *
	 */
	public static File takeScreenshot(String screenShotDir) {
		
		WebDriver driver = InitDriver.driver;
		File sourceFile = null;
		
		// 文件名
		Date now = new Date();
		String fileName = now.getTime() + ".jpg";
		LocalDate localDate1 = LocalDate.now();
		String data = localDate1.toString();
		
		// 目标文件
		File destFile = new File(screenShotDir + File.separator + data + File.separator + fileName);
		
		//判断用哪个实例截图
		if (driver instanceof InternetExplorerDriver) {
			InternetExplorerDriver ieDriver = (InternetExplorerDriver) driver;
			logger.info("ie开始进行截图");
			sourceFile = ieDriver.getScreenshotAs(OutputType.FILE);
		} else if (driver instanceof FirefoxDriver) {
			FirefoxDriver firefoxDriver = (FirefoxDriver) driver;
			logger.info("firefox开始进行截图");
			sourceFile = firefoxDriver.getScreenshotAs(OutputType.FILE);
		} else if (driver instanceof ChromeDriver) {
			ChromeDriver chromeDriver = (ChromeDriver) driver;
			logger.info("chrome开始进行截图");
			sourceFile = chromeDriver.getScreenshotAs(OutputType.FILE);
		}
		
		try {
			logger.info("拷贝截图文件至surefire目标下");
			// 拷贝到screenShotDir
			FileUtils.copyFile(sourceFile, destFile);
		} catch (IOException e) {
			logger.error("截图失败，没有对应的驱动");
			e.printStackTrace();
		}
		return destFile;
	}

}
