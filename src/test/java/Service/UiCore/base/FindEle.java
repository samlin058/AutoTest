package Service.UiCore.base;

import Service.UiCore.pojo.Locator;
import Service.UiCore.util.UILibraryUtil;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.time.Duration;
import java.util.HashMap;
import java.util.List;

public class FindEle extends InitDriver {

	/**
	 * 一个页面元素可以点击的必要条件 
	 * 1:页面上要有这个元素--》dom树存在该标签
	 * 2:元素一定是要显示出来的
	 * 3:元素一定要是激活状态，disable
	 * 
	 */

	private static Logger logger = Logger.getLogger(FindEle.class);

	/**
	 * 根据2个关键字定位页面元素
	 * 
	 * @param pageKeyword    页面关键字
	 * @param eleKeyword     元素关键字
	 * 
	 * @return    页面元素
	 */
	public WebElement getElement(String pageKeyword, String eleKeyword) {
		// 所有页面的页面描述
		HashMap<String, Locator> page = UILibraryUtil.pagesMap.get(pageKeyword);
		// 当前要找的元素的定位信息
		Locator locator = page.get(eleKeyword);
		// 获取页面元素
		String byStr = locator.getBy();
		String value = locator.getValue();
		// 输出日志
		logger.info("以" + byStr + "方式" + "开始查找【" + pageKeyword + "】的【" + eleKeyword + "】元素");
		// 智能等待30s
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		// 我们的期望条件
		WebElement element = wait.until(new ExpectedCondition<WebElement>() {

			public WebElement apply(WebDriver driver) {
				Class<By> clazz = By.class;
				try {
					// 获得方法：by中的某个静态方法如id方法、name方法
					Method method = clazz.getMethod(byStr, String.class);
					// invoke得到的对象强转成一个By对象
					By by = (By) method.invoke(null, value);
					return driver.findElement(by);
				} catch (Exception e) {
					logger.info("找不到对应方法，请检查你的xml配置");
					e.printStackTrace();
				}
				return null;
			}
		});
		return element;
	}

	/**
	 * 根据2个关键字查找元素列表
	 * @param pageKeyword        页面关键字
	 * @param eleKeyword         元素关键字
	 * @return List<WebElement>  元素对象集合 
	 *
	 * @author       luandao
	 * @Date         2020年9月28日 
	 *
	 */
	public List<WebElement> getElements(String pageKeyword, String eleKeyword) {
		// 所有页面的页面描述
		HashMap<String, Locator> page = UILibraryUtil.pagesMap.get(pageKeyword);
		// 当前要找的元素的定位信息
		Locator locator = page.get(eleKeyword);
		// 获取页面元素
		String byStr = locator.getBy();
		String value = locator.getValue();
		logger.info("以" + byStr + "方式" + "开始查找" + eleKeyword + "元素列表");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		// 我们的期望条件
		List<WebElement> elements = wait.until(new ExpectedCondition<List<WebElement>>() {
			public List<WebElement> apply(WebDriver driver) {
				Class<By> clazz = By.class;
				try {
					// 获得方法：by中的某个静态方法如id方法、name方法
					Method method = clazz.getMethod(byStr, String.class);
					// invoke得到的对象强转成一个By对象
					By by = (By) method.invoke(null, value);
					return driver.findElements(by);
				} catch (NoSuchMethodException e) {
					logger.info("找不到对应方法，请检查你的xml配置");
					e.printStackTrace();
				} catch (SecurityException e) {
					e.printStackTrace();
				} catch (IllegalAccessException e) {
					e.printStackTrace();
				} catch (IllegalArgumentException e) {
					e.printStackTrace();
				} catch (InvocationTargetException e) {
					e.printStackTrace();
				}
				return null;
			}
		});
		return elements;
	}

	/**
	 * 根据关键字和索引找到对应元素
	 * 
	 * @param pageKeyword   页面关键字
	 * @param eleKeyword    元素关键字
	 * @param index         索引
	 * 
	 * @return   元素对象
	 */
	public WebElement getEleByIndex(String pageKeyword, String eleKeyword, int index) {
		List<WebElement> elementList = getElements(pageKeyword, eleKeyword);
		WebElement element = elementList.get(index);
		return element;
	}

	/**
	 * 找到元素，并且该元素可被点击
	 * @param     pageKeyword
	 * @param     eleKeyword
	 * @return    WebElement
	 *
	 * @author       luandao
	 * @Date         2020年9月29日 
	 *
	 */
	public WebElement getElementClickable(String pageKeyword, String eleKeyword) {
		// 所有页面的页面描述
		HashMap<String, Locator> page = UILibraryUtil.pagesMap.get(pageKeyword);
		// 当前要找的元素的定位信息
		Locator locator = page.get(eleKeyword);
		// 获取页面元素
		String byStr = locator.getBy();
		String value = locator.getValue();
		logger.info("以" + byStr + "方式" + "开始查找【" + pageKeyword + "】的【" + eleKeyword + "】元素");
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
			Class<By> clazz = By.class;
			// 获得方法：by中的某个静态方法如id方法、name方法
			Method method = clazz.getMethod(byStr, String.class);
			// invoke得到的对象强转成一个By对象
			By by = (By) method.invoke(null, value);
			WebElement element = wait.until(ExpectedConditions.elementToBeClickable(by));
			return element;
		} catch (NoSuchMethodException e) {
			logger.info("找不到对应方法，请检查你的xml配置");
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
		return null;
	}
	
}
