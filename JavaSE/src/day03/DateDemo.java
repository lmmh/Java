package day03;

import java.util.Date;

/**
 * @author Joshua
 *
 */
public class DateDemo {
	public static void main(String[] args) {
		Date now = new Date();
		System.out.println(now);
		/*
		 * Date�󲿷ַ���������ʹ����
		 * */
		now.getYear();
		/*
		 * ��ȡDate�ڲ�ά����longֵ
		 * 
		 * */
        long time = now.getTime();
        System.out.println(time);
        //������һ�̵ĺ���ֵ
        time+=1000*60*60*24;
        now.setTime(time);
        System.out.println(now);
	}

}