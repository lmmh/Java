package day03;
import java.util.Calendar;
/**
 * @author Joshua
 * @version 获取某一个时间分量所允许的最大值。如今年共有多少天，2月共有多少天。。
 *
 */
public class CalendarDemo3 {
	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		//这个月有多少天？
		int days = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
		System.out.println(days);
		
		//2月有多少天？
		calendar.set(Calendar.MONTH,1);
		days = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
		System.out.println(days);
		//今年有多少天？
		int year = calendar.getActualMaximum(Calendar.DAY_OF_YEAR);
		System.out.println(year);
		
	}

}
