package day03;
import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @author Joshua 
 * @version 要求用户输入一个日期，然后对日期进行一系列的运算，
 * 再将计算后的日期显示给用户。
 * 流程如下：
 * 1.获取用户输入的日期字符串
 * 2.使用SimpleDateFormat将其转换为Date
 * 3.创建一个Calendar，使其表示Date表示的日期
 * 4.使用Calendar根据需求计算时间
 * 5.将Calendar转换为一个Date
 * 6.使用SimpleDateFormat将Date转换为字符串后显示给用户。
 *
 */
public class CaseDemo {
	public static void main(String[] args) throws ParseException {
		//1
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入日期：");
		String str = scan.next();
		//2
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date dat = sdf.parse(str);
		//3
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(dat);
		System.out.println(calendar.getTime());
		//4
		calendar.add(Calendar.YEAR,-2);
		System.out.println(calendar.getTime());
		//5
		Date date = calendar.getTime();
		//6
		String sub = sdf.format(date);
		System.out.println(sub);


	}
}
