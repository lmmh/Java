package day04;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author Joshua
 *@version��ѭ����������
 *
 */
public class NewForDemo2 {
	public static void main(String[] args) {
		Collection c = new ArrayList();
		c.add("one");
		c.add("#");
		c.add("two");
		c.add("#");
		c.add("three");
		System.out.println(c);
		//������ȡ�����Ƕ�����Ҫǿת��������ʽ������������ʹ����ѭ������
		/*
		 * ��ѭ�������µ��﷨����ѭ���Ǳ������Ͽɣ�������������Ͽɡ�
		 * ʹ����ѭ����������ʱ���������Ὣ����Ϊ��������ʽ������
		 * ������ʹ����ѭ����������ʱ����ͨ�����ϵķ�����ɾԪ�ء�
		 */
		for(Object o:c){
			String str = (String)o;
			System.out.println(str);
			if("#".equals(str));
			c.remove(str);//����ɾ��
		}
		
	}
}