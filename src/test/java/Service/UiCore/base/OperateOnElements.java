package base;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

/**
 * 
 * @Description  对页面元素进行操作 
 * @author       luandao
 * @Date         2020年9月28日 
 *
 */
public class OperateOnElements extends FindEle {
     
	private static Logger logger = Logger.getLogger(OperateOnElements.class);
	
	/**
	 * 点击元素
	 * 
	 * @param element  要点击的元素
	 */
	public void click(WebElement element) {
		element.click();
	}

	/**
	 *  点击元素
	 * @param pageKeyword           页面关键字
	 * @param eleKeyword            元素关键字
	 * @throws InterruptedException void
	 *
	 * @author       luandao
	 * @Date         2020年9月29日 
	 *
	 */
	public void click(String pageKeyword, String eleKeyword) {
		String clickBeforePageSource = driver.getPageSource();
		WebElement element = getElementClickable(pageKeyword, eleKeyword);
		logger.info("点击元素：" + eleKeyword);
		click(element);
		String clickAfterPageSource = driver.getPageSource();
		if (clickBeforePageSource.equals(clickAfterPageSource)) {
			logger.info("再点一次");
			click(element);
		}
	}

	/**
	 * 输入内容（进一步封装）
	 * 
	 * @param keyword      要输入内容的元素值
	 * @param value        输入的内容
	 *            
	 */
	public void fillIn(String pageKeyword, String eleKeyword, String value) {
		WebElement element = getElement(pageKeyword, eleKeyword);
		logger.info("往【" + eleKeyword + "】输入内容：" + value);
		element.sendKeys(value);
	}

	/**
	 * 得到元素的文本内容
	 * 
	 * @param pageKeyword      页面关键字
	 * @param eleKeyword       元素关键字
	 * @return String        元素的文本内容
	 */
	public String getText(String pageKeyword, String eleKeyword) {
		return getElement(pageKeyword, eleKeyword).getText();
	}

	/**
	 * 聚焦到元素上
	 * 
	 * @author luandao
	 * @throws InterruptedException 
	 * @Date 2020年9月7日
	 *
	 */
	public void moveToElement(String pageKey, String eleKey) throws InterruptedException {
		Actions actions = new Actions(driver);
		WebElement element = getElement(pageKey, eleKey);
		actions.moveToElement(element).perform();
	}

	/**
	 * 
	 * @param pageKey  页面关键字
	 * @param eleKey   元素关键字
	 * @param value    值
	 * @author       luandao
	 * @Date         2020年9月28日 
	 *
	 */
	public void selectByValue(String pageKey, String eleKey, String value) {
		Select select = new Select(getElement(pageKey, eleKey));
		select.selectByValue(value);
	}

}
