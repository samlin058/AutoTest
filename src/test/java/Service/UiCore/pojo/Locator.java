package Service.UiCore.pojo;

public class Locator {
	// 1.通过什么方式去找元素（Cssselecter、Xpath、id、name、by("value")）
	private String by;
	// 2.元素的值
	private String value;
	// 3.简单的描述元素（关键字）
	private String desc;

	public String getBy() {
		return by;
	}

	public void setBy(String by) {
		this.by = by;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;

	}
    
	@Override
	public String toString() {
		return "Locator[by=" + by + ",value=" + value + ",desc=" + desc + "]";
	}
	
	//locator的调用后方法
	public Locator(String by,String value,String desc){
		super();
		this.by=by;
		this.value=value;
		this.desc=desc;
		
	}
	
	
}
