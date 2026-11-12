package Service.UiCore.util;

import Service.UiCore.base.InitDriver;
import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.util.Date;

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
		
		if (driver instanceof TakesScreenshot) {
			logger.info("开始进行截图");
			sourceFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		} else {
			logger.error("当前驱动不支持截图");
			return destFile;
		}
		
		try {
			logger.info("拷贝截图文件至surefire目标下");
			FileUtils.copyFile(sourceFile, destFile);
		} catch (IOException e) {
			logger.error("截图失败，没有对应的驱动");
			e.printStackTrace();
		}
		return destFile;
	}

}
