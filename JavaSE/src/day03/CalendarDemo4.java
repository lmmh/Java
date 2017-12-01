package day03;

import java.util.Calendar;

/**
 * @author Joshua
 * @version Calendar中计算时间的方法
 * void add(int field,int value);
 * 对指定的时间分量加上给定的值，若给定的值是负数，则是减去给定的值。
 */
public class CalendarDemo4 {
	public static void main(String[] args) {
		/*
		 * 查看3年2个月零8天后的日期
		 */
		Calendar calendar = Calendar.getInstance();
		//查看三年后
		calendar.add(Calendar.YEAR,3);
		System.out.println(calendar.getTime());
		//查看2个月后
		calendar.add(Calendar.MONTH,2);
		System.out.println(calendar.getTime());
		//查看8天后的日期
		calendar.add(Calendar.DAY_OF_YEAR,8);
		System.out.println(calendar.getTime());
		//查看5小时前的时间
		calendar.add(Calendar.HOUR_OF_DAY, -5);
		System.out.println(calendar.getTime());

	}
}
