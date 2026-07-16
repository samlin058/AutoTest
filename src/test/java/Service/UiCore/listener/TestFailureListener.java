package listener;

import java.io.File;

import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.TestListenerAdapter;

import util.DateUtil;
import util.ScreenShotUitl;

public class TestFailureListener extends TestListenerAdapter {

	@Override
	public void onTestFailure(ITestResult tr) {
		// TODO Auto-generated method stub
		super.onTestFailure(tr);
		// 1、通过test的上下文得到surefire-reports这个根目录
		String outputDir = tr.getTestContext().getOutputDirectory();
		// 截取出surefire-reports根目录
		String surefireDir = outputDir.substring(0, outputDir.lastIndexOf("\\"));
		// 2、从上下文拿到test的name
		String testName = tr.getTestContext().getCurrentXmlTest().getName();
		// 目录组装
		String dateStr = DateUtil.getTodayYMDString();
		String screenShotDir = surefireDir + File.separator + "screenshot" + File.separator + dateStr + testName;
		// 截图并返回图片file
		File screenshotFile = ScreenShotUitl.takeScreenshot(screenShotDir);
		// 本地图片的绝对路径
		String absolutePath = screenshotFile.getAbsolutePath();
		// 组装url
		String oldStr = absolutePath.substring(0, absolutePath.indexOf("screenshot"));
		String newStr = "http://localhost:8887/";
		String urlTemp = absolutePath.replace(oldStr, newStr);
		String imgUrl = urlTemp.replace("\\", "/");
		// 将url放入日志中
		Reporter.log("<img src ='" + imgUrl + "' hight='100' width='100'><a href ='" + imgUrl + "' target='_blank'>点击查看大图</a></img>");
	}

}
