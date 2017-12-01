package day03;

import java.util.Calendar;

/**
 * @author Joshua
 *@version
 *获取一个Calendar表示的日期中各个时间分量对应的值
 */
public class CalendarDemo2 {
	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		/*
		 * int get(int filed)
		 * 获取对应时间分量的值
		 */
	   //获取年
		int year = calendar.get(Calendar.YEAR);
		int month = calendar.get(Calendar.MONTH)+1;
		int date = calendar.get(Calendar.DATE);
		System.out.println(year+"-"+month+"-"+date);
		int hour = calendar.get(Calendar.HOUR_OF_DAY);
		int minute = calendar.get(Calendar.MINUTE);
		int second = calendar.get(Calendar.SECOND);
		int dow = calendar.get(Calendar.DAY_OF_WEEK)-1;
		System.out.println(hour+":"+minute+":"+second+"-"+dow);
		
		//今年已经过了多少天了
		int doy = calendar.get(Calendar.DAY_OF_YEAR);
		System.out.println("今年已经过了"+doy+"天");
	}
		
		
}
