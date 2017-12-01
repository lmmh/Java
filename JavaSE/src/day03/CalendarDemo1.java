package day03;

import java.util.Calendar;

/**
 * @author Joshua
 *@version
 *Calendar�ṩ����Բ�ͬʱ�������������ֵ�ķ�����
 *void set(int field,int value);
 *���е�һ������Ϊ��ʱ����������磺�꣬�£��յȵȡ�
 *�ڶ�������Ϊ��Ӧ��ֵ��
 *ʱ�������һ��intֵ��ʹ��Calendar�ṩ�ĳ�����
 *
 */
public class CalendarDemo1 {
	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		//������
		calendar.set(Calendar.YEAR, 2016);
		System.out.println(calendar.getTime());
		//����1��,�´�0��ʼ���ó�����ʾ
		calendar.set(Calendar.MONTH,Calendar.OCTOBER);
		System.out.println(calendar.getTime());
		/*
		 * ������
		 * ��Ӧ��ʱ��������õģ�
		 * DATE:������
		 * DAY_OF_MONTH�������죬��DATEһ��
		 * DAY_OF_WEEK�����е��죬���ڼ�
		 * DAY_OF_YEAR�����е���
		 */
		calendar.set(Calendar.DAY_OF_MONTH,9);
		calendar.set(Calendar.HOUR_OF_DAY,20);
		calendar.set(Calendar.MINUTE,0);
		calendar.set(Calendar.SECOND,0);
		System.out.println(calendar.getTime());
	}
}
