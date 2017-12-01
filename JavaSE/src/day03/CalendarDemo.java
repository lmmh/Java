package day03;

import java.util.Calendar;
import java.util.Date;

/**
 * @author Joshua
 * @version
 *  java.util Calendar
 * ������
 * ������һ�������࣬��װ�˶�ʱ�����ز�����
 * ���õ�ʵ��������������������
 * ʹ����������Ϊ�˶�ʱ�������صĲ������������ʱ�䡣
 *
 */
public class CalendarDemo {
	public static void main(String[] args) {
		/*ʹ��Calendar�ľ�̬��������ʵ����
		 * �÷�������ݵ�ǰϵͳ���ڵ�������һ����Ӧ��ʵ�֣�
		 * ͨ����GregorianCalendar
		 * Ĭ�ϴ���������ʵ����ʾ��ǰϵͳʱ�䡣
		 */
		Calendar calendar = Calendar.getInstance();
		/*toString����ֱ�۷�ӳ��ʾ������*/
		System.out.println(calendar);
		/*
		 * Calendar��Date֮���ת��
		 * Calendar -> Date
		 * Date getTime();
		 * Calendar�ṩ�˷���getTime(),
		 *�÷������ص���һ��Date���󣬸ö����ʾ��ʱ����ǵ�ǰCalender��ʾ��ʱ�䡣 		 
		 */
		Date date = calendar.getTime();
		System.out.println(date);
		date.setTime(date.getTime()+24*60*60*1000);
		System.out.println(date);
		/*
		 * Date -> Calendar
		 * void setTime(Date date)
		 * Calendar��setTime��������ʹ��ǰCalendar��ʾ������Date����ʾ��ʱ�䡣
		 * CalendarҲ��ʾ������һ����
		 */
		calendar.setTime(date);
		System.out.println(calendar);
	}

}