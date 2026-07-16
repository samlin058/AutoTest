package util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import pojo.Locator;

/**
 * 加载UI数据载体xml文件成为java中的对象
 *  
 * @author       luandao
 * @Date         2020年9月30日 
 *
 */
public class UILibraryUtil {

	// 所有页面的描述
	public static HashMap<String, HashMap<String, Locator>> pagesMap = new HashMap<String, HashMap<String, Locator>>();
	// 所有加载的配置路径
	public static ArrayList<String> pathList = new ArrayList<String>();

	static {
		pathList.add("/UiLibrary/GoblinUiLib.xml");
		pathList.add("/UiLibrary/Yongcheng.xml");
		readMoreData(pathList);
	}

	// 数据载体xml-->java中的对象
	private static HashMap<String, HashMap<String, Locator>> readUILibrary(String xmlPath) {
		// 得到读取器
		SAXReader reader = new SAXReader();
		try {
			// 获得xml文档
			Document document = reader.read(UILibraryUtil.class.getResourceAsStream(xmlPath));
			// 获得根元素
			Element rootElement = document.getRootElement();
			// 获得根元素下所有的page子元素
			@SuppressWarnings("unchecked")
			List<Element> pageElements = rootElement.elements("page");

			// 遍历每一个页面
			for (Element page : pageElements) {
				// 页面的名称--》类名
				// String pageName = page.attributeValue("name");
				// 页面的描述
				String pageDesc = page.attributeValue("desc");
				// 获得每个页面下的所有元素信息
				@SuppressWarnings("unchecked")
				List<Element> locatorElements = page.elements("locator");
				// 保存每个页面的locator的map
				HashMap<String, Locator> locatorMap = new HashMap<String, Locator>();
				// 遍历每一个元素
				for (Element locatorElement : locatorElements) {
					// 定位的方式
					String by = locatorElement.attributeValue("by");
					// 定位的值
					String value = locatorElement.attributeValue("value");
					// 元素的描述
					String desc = locatorElement.attributeValue("desc");
					// 创建locator
					Locator locator = new Locator(by, value, desc);
					locatorMap.put(desc, locator);
				}
				pagesMap.put(pageDesc, locatorMap);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return pagesMap;
	}

	/**
	 * 读更多的配置
	 * 
	 * @author luandao
	 * @Date 2020年9月3日
	 *
	 */
	private static void readMoreData(ArrayList<String> xmlPath) {
		for (String path : xmlPath) {
			readUILibrary(path);
		}
	}

	/**
	 *   例子    
	 * @author  luandao
	 * @Date    2020年9月28日 
	 *
	 */
	public static void main(String args[]) {
		Set<String> set = pagesMap.keySet();
		for (String key : set) {
			System.out.println("key：" + key);
			HashMap<String, Locator> locatorsMap = pagesMap.get(key);
			Set<String> keys = locatorsMap.keySet();
			int i = 1;
			for (String string : keys) {
				Locator locator2 = locatorsMap.get(string);
				System.out.println("By：" + locator2.getBy());
				System.out.println("Desc：" + locator2.getDesc());
				System.out.println("Value：" + locator2.getValue());
				System.out.println("num：" + i++);
				System.out.println("---------------------------------------------");
			}
		}

	}
}
