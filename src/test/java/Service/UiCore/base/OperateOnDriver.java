package base;

import org.apache.log4j.Logger;

import util.PropertiesUtil;

public class OperateOnDriver extends InitDriver {

	private static Logger logger = Logger.getLogger(OperateOnDriver.class);

	/**
	 * 浏览器窗口最大化&到某个页面去
	 * 
	 * @param urlKey  (properties配置)
	 */
	public static void maxAndTo(String urlKey) {
		maximize();
		to(urlKey);
	}

	/**
	 * 到某个页面去
	 * 
	 * @param urlKey(properties配置)
	 */
	public static void to(String urlKey) {
		String url = PropertiesUtil.urlProperties.getProperty(urlKey);
		logger.info("打开测试页面地址：" + url);
		driver.get(url);
	}

	/**
	 * debug用
	 * 
	 * @author luandao
	 * @Date 2020年9月5日
	 *
	 */
	public static void debugTo(String url) {
		maximize();
		logger.info("打开测试页面地址：" + url);
		driver.get(url);
	}

	/**
	 * 浏览器窗口最大化
	 */
	public static void maximize() {
		logger.info("浏览器窗口最大化");
		driver.manage().window().maximize();
	}

	/**
	 * 前进到下一个页面
	 */
	public static void forward() {
		logger.info("前往下一个页面");
		driver.navigate().forward();
	}

	/**
	 * 后退到上一个页面
	 */
	public static void back() {
		logger.info("返回上一个页面");
		driver.navigate().back();
	}

	/**
	 * 刷新当前页面
	 */
	public static void refresh() {
		logger.info("刷新页面");
		driver.navigate().refresh();
	}
}
