package day03;

import java.util.Calendar;

/**
 * @author Joshua
 *@version
 *Calendar提供了针对不同时间分量单独设置值的方法。
 *void set(int field,int value);
 *其中第一个参数为：时间分量，例如：年，月，日等等。
 *第二个参数为对应的值。
 *时间分量是一个int值，使用Calendar提供的常量。
 *
 */
public class CalendarDemo1 {
	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		//设置年
		calendar.set(Calendar.YEAR, 2016);
		System.out.println(calendar.getTime());
		//设置1月,月从0开始或用常量表示
		calendar.set(Calendar.MONTH,Calendar.OCTOBER);
		System.out.println(calendar.getTime());
		/*
		 * 设置日
		 * 对应的时间分量常用的：
		 * DATE:月中天
		 * DAY_OF_MONTH：月中天，与DATE一致
		 * DAY_OF_WEEK：周中的天，星期几
		 * DAY_OF_YEAR：年中的天
		 */
		calendar.set(Calendar.DAY_OF_MONTH,9);
		calendar.set(Calendar.HOUR_OF_DAY,20);
		calendar.set(Calendar.MINUTE,0);
		calendar.set(Calendar.SECOND,0);
		System.out.println(calendar.getTime());
	}
}
