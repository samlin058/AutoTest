package Application.TestCase.Yongcheng.TestCase;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Service.UiCore.base.OperateOnElements;
import Service.UiCore.base.OperateOnDriver;

public class Demo extends OperateOnElements {

	@DataProvider
	//车主姓名、车架号、发动机号、证件号码、联系人手机、E-MAIL、纳税人证件号码
	public Object[][] TestData() {
		Object[][] TestData = { { "小红", "ASDA1231231231231", "123123121231", "432503199304017314", "13956963215",
				"516963258@qq.com", "432503199304017314" } };
		return TestData;
	}

	@Test(dataProvider = "TestData")
	public void ECS_001(String userName, String frameNo, String engineNumber, String identificationNumber,
						String telephoneNo, String email, String taxpayerNo) throws Exception {
		// 打开浏览器,进入homeIndex页面
		OperateOnDriver.maxAndTo("homeIndex");
		// 点击在线购买
		click("永诚主页", "在线购买");
		// 点击汽车保险
		click("永诚主页", "汽车保险");
		// 点击行驶城市
		click("车险投保页", "行驶城市");
		// 点击上海
		click("车险投保页", "上海");
		// 点击尚未取得车牌
		click("车险投保页", "尚未取得车牌");
		// 点击车主姓名，输入车主姓名
		fillIn("车险投保页", "车主姓名", userName);
		// 点击立即报价
		click("车险投保页", "立即报价");
		// 拉到最下
		//((JavascriptExecutor) driver).executeScript("window.scrollTo(0,document.body.scrollHeight)");
		// 车辆识别代码/车架号中输入值
		fillIn("信息录入", "车辆识别代码/车架号", frameNo);
		// 发动机号输入值
		fillIn("信息录入", "发动机号", engineNumber);
		// 点击车辆型号输入
		fillIn("信息录入", "车辆型号", "1");
		// 选择车辆类型
		click("信息录入", "东风LZ6470XQ16V多用途乘用车");
		// 输入证件号码
		fillIn("信息录入", "证件号码", identificationNumber);
		// 点击姓名：男
		click("信息录入", "性别-男(选择框)");
		// 点击出生日期
		// click("信息录入","出生日期");
		// 输入年
		// 输入月
		// 输入日
		// 输入联系人手机
		fillIn("信息录入", "联系人手机", telephoneNo);
		// 输入E-mail
		fillIn("信息录入", "E-MAIL", email);
		// 点击纳税人证件类型下拉框
		click("信息录入", "纳税人证件类型");
		// 点击选择纳税人证件类型
		click("信息录入", "纳税人证件类型-身份证");
		// 输入纳税人证件号码
		fillIn("信息录入", "纳税人证件号码", taxpayerNo);
		// 点击获取报价
		click("信息录入", "获取报价");
		// 点击跳过
		click("信息录入", "跳过");
		//assertTrue(false);
		//AssertUtil.assertElementEditable(getElement2("信息录入页", "button"));
	}




}
