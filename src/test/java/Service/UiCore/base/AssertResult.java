package Service.UiCore.base;

import Service.UiCore.util.StringUtil;
import javafx.scene.control.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class AssertResult extends FindEle {

	/**
	 * 验证元素的文本内容与期望内容是否一致
	 * 
	 *
	 * @param expectedText
	 */
	public void assertElementText(String pageKeyword, String eleKeyword, String expectedText) {
		WebElement element = getElementClickable(pageKeyword, eleKeyword);
		String actualText = element.getText();
		Assert.assertEquals(actualText, expectedText);
	}

	/**
	 * 断言页面元素包含某文本
	 * 
	 *
	 * @param expectedText
	 */
	public void assertPartialTextPresent(String pageKeyword, String eleKeyword, String expectedText) {
		WebElement element = getElement(pageKeyword, eleKeyword);
		String actualText = element.getText();
		Assert.assertTrue(actualText.contains(expectedText));
	}

	/**
	 * 断言某元素可编辑
	 * 
	 *
	 */
	public void assertElementEditable(String pageKeyword, String eleKeyword) {
		WebElement element = getElement(pageKeyword, eleKeyword);
		Assert.assertTrue(element.isEnabled());
	}

	/**
	 * 断言某元素不可编辑
	 * 
	 *
	 */
	public void assertElementNotEditable(String pageKeyword, String eleKeyword) {
		WebElement element = getElement(pageKeyword, eleKeyword);
		Assert.assertFalse(element.isEnabled());
	}

	/**
	 *  断言当前url包含value
	 * @param driver
	 * @param value void
	 *
	 * @author       luandao
	 * @Date         2020年9月29日 
	 *
	 */
	public void assertURLContains(WebDriver driver, String value) {
		String url = driver.getCurrentUrl();
		Assert.assertTrue(url.contains(value));
	}

	/**
	 * 断言元素的text为空
	 *
	 *
	 * @author       luandao
	 * @Date         2020年9月29日 
	 *
	 */
	public void assertTextNotPresent(String pageKeyword, String eleKeyword) {
		WebElement element = getElement(pageKeyword, eleKeyword);
		String actual = element.getText();
		Assert.assertTrue(StringUtil.isEmpty(actual));

	}

	/**
	 * 断言元素的属性值是否与期望值相等
	 *
	 * @param attribute           属性key
	 * @param expectedValue       期望值 
	 *
	 * @author       luandao
	 * @Date         2020年9月29日 
	 *
	 */
	public void assertElementAttributeValueEquals(String pageKeyword, String eleKeyword, String attribute,
			String expectedValue) {
		WebElement element = getElement(pageKeyword, eleKeyword);
		String actual = element.getAttribute(attribute);
		Assert.assertEquals(actual, expectedValue);
	}

	/**
	 * 断言元素的属性值不等于期望值
	 *
	 * @param attribute         属性key
	 * @param expectedValue     期望值
	 *
	 * @author       luandao
	 * @Date         2020年9月29日 
	 *
	 */
	public void assertElementAttributeValueNotEquals(String pageKeyword, String eleKeyword, String attribute, String expectedValue) {
		WebElement element = getElement(pageKeyword, eleKeyword);
		String actual = element.getAttribute(attribute);
		Assert.assertNotEquals(actual, expectedValue);
	}

	/**
	 * 断言Alert弹框的text包含期望值
	 *
	 * @param expectedValue     期望值
	 *
	 * @author       luandao
	 * @Date         2020年9月29日 
	 *
	 */
	public void assertAlertTextContains(WebDriver driver, String expectedValue) {
		Alert alert = (Alert) driver.switchTo().alert();
		String value = alert.getContentText();
		Assert.assertTrue(value.contains(expectedValue));
	}

}
