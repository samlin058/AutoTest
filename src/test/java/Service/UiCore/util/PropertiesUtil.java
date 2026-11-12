package Service.UiCore.util;

import java.util.Properties;

public class PropertiesUtil {

	public static Properties urlProperties;

	static {
		loadProperties();
	}

	/**
	 * 加载属性文件
	 *
	 * @author       luandao
	 * @Date         2020年9月30日 
	 *
	 */
	private static void loadProperties() {
		if (urlProperties == null) {
			urlProperties = new Properties();
		}
		try {
			urlProperties.load(PropertiesUtil.class.getResourceAsStream("/properties/url.properties"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
