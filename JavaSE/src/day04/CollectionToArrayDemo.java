package day04;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author Joshua
 *@version ����ת��Ϊ����
 *
 */
public class CollectionToArrayDemo {
	public static void main(String[] args) {
		Collection<String> c = new ArrayList<String>();
		c.add("one");
		c.add("two");
		c.add("three");
		c.add("four");
		/*
		 * �����ṩ��һ������toArray,
		 * ���Խ���ǰ����ת��Ϊ����
		 */
		//Object[] array = c.toArray();//���ַ���������
		/*
		 * ��������������ã�������Դ�ż�������Ԫ�أ�ʱ��
		 * ��ʹ�ø����顣
		 * �������ã����Զ�����һ�����������ͬ���͵����顣
		 */
		String[] array = c.toArray(new String[c.size()]);
		System.out.println("len:"+array.length);
		for(String str : array){
			System.out.println(str);
		}
	}
}