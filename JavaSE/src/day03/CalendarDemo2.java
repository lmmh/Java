package day03;

import java.util.Calendar;

/**
 * @author Joshua
 *@version
 *��ȡһ��Calendar��ʾ�������и���ʱ�������Ӧ��ֵ
 */
public class CalendarDemo2 {
	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		/*
		 * int get(int filed)
		 * ��ȡ��Ӧʱ�������ֵ
		 */
	   //��ȡ��
		int year = calendar.get(Calendar.YEAR);
		int month = calendar.get(Calendar.MONTH)+1;
		int date = calendar.get(Calendar.DATE);
		System.out.println(year+"-"+month+"-"+date);
		int hour = calendar.get(Calendar.HOUR_OF_DAY);
		int minute = calendar.get(Calendar.MINUTE);
		int second = calendar.get(Calendar.SECOND);
		int dow = calendar.get(Calendar.DAY_OF_WEEK)-1;
		System.out.println(hour+":"+minute+":"+second+"-"+dow);
		
		//�����Ѿ����˶�������
		int doy = calendar.get(Calendar.DAY_OF_YEAR);
		System.out.println("�����Ѿ�����"+doy+"��");
	}
		
		
}
