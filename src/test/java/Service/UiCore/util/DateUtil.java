package Service.UiCore.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {

	private static SimpleDateFormat ymdFormat = new SimpleDateFormat("yyyyMMdd");
	private static SimpleDateFormat ymdhmsFormat = new SimpleDateFormat("yyyyMMdd-hhmmss");

	/**
	 * 返回年月日：yyyymmdd
	 * @param date
	 * @return
	 */
	public static String getYMDString(Date date) {
		return ymdFormat.format(date);
	};

	/**
	 * 返回年月日:yyyyMMdd-hhmmss
	 * @param date
	 * @return
	 */
	public static String getYMDHMSString(Date date) {
		return ymdhmsFormat.format(date);
	}

	/**
	 * 获取今天的时间，格式为yyyyMMdd
	 * @return
	 */
	public static String getTodayYMDString() {
		return getYMDString(new Date());
	}

	/**
	 * 获取此时的时间，格式为yyyyMMdd-hhmmss
	 * @return
	 */
	public static String getTodayYmdHmsString() {
		return getYMDHMSString(new Date());
	}

}
