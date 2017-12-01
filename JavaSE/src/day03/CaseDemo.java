package day03;
import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @author Joshua 
 * @version Ҫ���û�����һ�����ڣ�Ȼ������ڽ���һϵ�е����㣬
 * �ٽ�������������ʾ���û���
 * �������£�
 * 1.��ȡ�û�����������ַ���
 * 2.ʹ��SimpleDateFormat����ת��ΪDate
 * 3.����һ��Calendar��ʹ���ʾDate��ʾ������
 * 4.ʹ��Calendar�����������ʱ��
 * 5.��Calendarת��Ϊһ��Date
 * 6.ʹ��SimpleDateFormat��Dateת��Ϊ�ַ�������ʾ���û���
 *
 */
public class CaseDemo {
	public static void main(String[] args) throws ParseException {
		//1
		Scanner scan = new Scanner(System.in);
		System.out.println("���������ڣ�");
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