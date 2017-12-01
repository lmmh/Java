package day03;

import java.util.Calendar;
import java.util.Date;

/**
 * @author Joshua
 * @version
 *  java.util Calendar
 * 日历类
 * 该类是一个抽象类，封装了对时间的相关操作。
 * 常用的实现类格里高里历（阳历）
 * 使用日历类是为了对时间进行相关的操作。比如计算时间。
 *
 */
public class CalendarDemo {
	public static void main(String[] args) {
		/*使用Calendar的静态方法穿件实例，
		 * 该方法会根据当前系统是在地区创建一个相应的实现，
		 * 通常是GregorianCalendar
		 * 默认创建的日历实例表示当前系统时间。
		 */
		Calendar calendar = Calendar.getInstance();
		/*toString不能直观反映表示的日期*/
		System.out.println(calendar);
		/*
		 * Calendar与Date之间的转换
		 * Calendar -> Date
		 * Date getTime();
		 * Calendar提供了方法getTime(),
		 *该方法返回的是一个Date对象，该对像表示的时间就是当前Calender表示的时间。 		 
		 */
		Date date = calendar.getTime();
		System.out.println(date);
		date.setTime(date.getTime()+24*60*60*1000);
		System.out.println(date);
		/*
		 * Date -> Calendar
		 * void setTime(Date date)
		 * Calendar的setTime方法可以使当前Calendar表示给定的Date所表示的时间。
		 * Calendar也表示明天这一刻了
		 */
		calendar.setTime(date);
		System.out.println(calendar);
	}

}
