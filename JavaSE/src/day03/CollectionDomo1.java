package day03;

import java.util.ArrayList;
import java.util.Collection;

import day02.Point;

/**
 * @author Joshua
 * @version boolean contains(E e)
 * �жϵ�ǰ�����Ƿ��������Ԫ��
 *
 */
public class CollectionDomo1 {
	public static void main(String[] args) {
		Collection c = new ArrayList();
		c.add(new Point(1,2));
		c.add(new Point(3,4));
		c.add(new Point(5,6));
		System.out.println(c);
		Point p = new Point(1,2);
		/*
		 * �����ж��Ƿ����ָ��Ԫ��������Ԫ�ص�equals�ȽϵĽ����
		 * ֻҪ��������Ԫ�������Ԫ�رȽ�Ϊtrue������Ϊ������
		 * toString��equals��Point�б�����д
		 */
		boolean contains = c.contains(p);
		System.out.println(contains);

	}
}
