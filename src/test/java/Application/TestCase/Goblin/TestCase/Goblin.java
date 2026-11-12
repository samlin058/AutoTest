package Application.TestCase.Goblin.TestCase;

import org.testng.annotations.Test;

public class Goblin extends GoblinBaseReady {

	/**
	 *
	 * @Case 待我处理查询
	 * @author luandao
	 * @Date 2020年9月6日
	 *
	 */
	@Test
	public void case_1() throws InterruptedException {
		// 移动到工作台
		moveToElement("Goblin主页", "工作台");
		// 点击待我处理
		click("Goblin主页", "待我处理");
		// 点击催收机构
		click("Goblin主页", "请选择催收机构");
		// 选择机构
		click("Goblin主页", "玛仔汽车/玛瑙湾");
		// 点击节点
		click("Goblin主页", "请选择节点");
		// 选择玛仔汽车/玛瑙湾-节点
		click("Goblin主页", "玛仔汽车/玛瑙湾-节点");
		// 点击催收员button
		click("Goblin主页", "催收员下拉框");
		// 选择催收员姓名
		click("Goblin主页", "请选择催收员");
		// 点击查询
		click("Goblin主页", "查询");
		//AssertUtil.assertElementText(, expectedText);
	}

}
