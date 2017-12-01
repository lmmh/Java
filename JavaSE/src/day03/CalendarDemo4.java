package day03;

import java.util.Calendar;

/**
 * @author Joshua
 * @version Calendar�м���ʱ��ķ���
 * void add(int field,int value);
 * ��ָ����ʱ��������ϸ�����ֵ����������ֵ�Ǹ��������Ǽ�ȥ������ֵ��
 */
public class CalendarDemo4 {
	public static void main(String[] args) {
		/*
		 * �鿴3��2������8��������
		 */
		Calendar calendar = Calendar.getInstance();
		//�鿴�����
		calendar.add(Calendar.YEAR,3);
		System.out.println(calendar.getTime());
		//�鿴2���º�
		calendar.add(Calendar.MONTH,2);
		System.out.println(calendar.getTime());
		//�鿴8��������
		calendar.add(Calendar.DAY_OF_YEAR,8);
		System.out.println(calendar.getTime());
		//�鿴5Сʱǰ��ʱ��
		calendar.add(Calendar.HOUR_OF_DAY, -5);
		System.out.println(calendar.getTime());

	}
}
