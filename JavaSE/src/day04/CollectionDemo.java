package day04;

import java.util.ArrayList;
import java.util.Collection;

import day02.Point;

/**
 * @author Joshua
 *
 */
public class CollectionDemo {
	public static void main(String[] args) {
		Collection c = new ArrayList();
		c.add(new Point(1,2));
		c.add(new Point(3,4));
		c.add(new Point(5,6));
		System.out.println(c);
		/*
		 * boolean remove(E e)
		 * �Ӽ�����ɾ��ָ��Ԫ�ء�ɾ���ɹ�����true
		 * ֻɾ�������е�һ�������Ԫ��equals�Ƚ�Ϊtrue��Ԫ�ء�
		 */
		Point p = new Point(1,2);
		System.out.println(c.remove(p));//true
		System.out.println(c);
		


	}

}
