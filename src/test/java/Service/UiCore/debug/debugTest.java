package debug;

import org.testng.annotations.Test;

import base.AssertResult;
import base.FindEle;
import base.OperateOnElements;

/**
 * 调试脚本的类
 * 
 * @author luandao
 * @Date 2020年9月28日
 *
 */
public class debugTest extends OperateOnElements {

	@Test
	public void debug() {
		
	}

	/**
	 * 
	 * 元素是否显示，可操作，可被选
	 * 
	 * @author luandao
	 * @Date 2020年9月28日
	 *
	 */
	public void EleIsOperation(String pageKeyword, String eleKeyword) {
		String isDisplayed = getElement(pageKeyword, eleKeyword).isDisplayed() + "";
		String isEnabled = getElement(pageKeyword, eleKeyword).isEnabled() + "";
		String isSelected = getElement(pageKeyword, eleKeyword).isSelected() + "";
		System.err.println("isDisplayed：" + isDisplayed);
		System.err.println("isEnabled：" + isEnabled);
		System.err.println("isSelected：" + isSelected);
	}
}
