package projectPrepare;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import base.FindEle;
import base.OperateOnDriver;
import base.OperateOnElements;

public class GoblinBaseReady extends OperateOnElements {

	/**
	 * 
	 * @Case 所有测试前需要校验是否需要登陆，并且关闭催收禁止行为弹框
	 * @author luandao
	 * @throws InterruptedException
	 * @Date 2020年9月4日
	 *
	 */
	@BeforeClass
	public void maxBrowser() throws InterruptedException {
		// 打开goblin主页
		OperateOnDriver.maxAndTo("goblinIndex");
		// 判断是否需要登陆
		if (isLogin()) {
			// 登陆
			fillIn("Goblin登录页", "登录用户名框", "luandao");
			fillIn("Goblin登录页", "登录密码框", "520058~Wo");
			click("Goblin登录页", "登录按钮");
			// 关掉催收禁止行为弹框
			click("Goblin主页", "催收禁止行为X按钮");
		}
	}
    	
	@BeforeMethod
	public void beforeTest() throws InterruptedException {
		//OperateOnDriver.maxAndTo("goblinIndex");
		driver.navigate().to("https://xh.test.wacai.info/goblin/dashboard");
		if (getElement("Goblin主页", "催收禁止行为X按钮").isEnabled()) {
			click("Goblin主页", "催收禁止行为X按钮");
		}
		
	}

	/**
	 * 
	 * @Case 判断当前页面title是否为登陆页
	 * @author luandao
	 * @Date 2020年9月4日
	 *
	 */
	private boolean isLogin() {
		boolean flag = false;
		String title = driver.getTitle();
		if ("统一登录中心".equals(title)) {
			flag = true;
		}
		return flag;
	}

}
