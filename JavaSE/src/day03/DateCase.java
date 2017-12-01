package day03;
import java.util.Scanner;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
/**
 * @author Joshua
 *
 */
public class DateCase {
	public static void main(String[] args) throws ParseException {
		System.out.println("请输入你的生日：");
		Scanner scan = new Scanner(System.in);
		String birthstr = scan.nextLine();
		//将输入的字符串转换为date
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date birth = sdf.parse(birthstr);
		//获取当前与出生日期毫秒数的差值
		Date now = new Date();
		long time = now.getTime() - birth.getTime();
		time = time/1000/60/60/24;
		System.out.println("你已经活了"+time+"天");
		time = 10000 - time;
		System.out.println("差"+time+"天，活了10000天");
		time = time*24*60*60*1000;
	     //差值+当前毫秒数 重设当前时间 输出时间
	     now.setTime(now.getTime()+time);
	     System.out.println("10000天的纪念日为："+sdf.format(now));
	}
}
