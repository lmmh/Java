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
		System.out.println("������������գ�");
		Scanner scan = new Scanner(System.in);
		String birthstr = scan.nextLine();
		//��������ַ���ת��Ϊdate
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date birth = sdf.parse(birthstr);
		//��ȡ��ǰ��������ں������Ĳ�ֵ
		Date now = new Date();
		long time = now.getTime() - birth.getTime();
		time = time/1000/60/60/24;
		System.out.println("���Ѿ�����"+time+"��");
		time = 10000 - time;
		System.out.println("��"+time+"�죬����10000��");
		time = time*24*60*60*1000;
	     //��ֵ+��ǰ������ ���赱ǰʱ�� ���ʱ��
	     now.setTime(now.getTime()+time);
	     System.out.println("10000��ļ�����Ϊ��"+sdf.format(now));
	}
}