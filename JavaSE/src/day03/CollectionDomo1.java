package day03;

import java.util.ArrayList;
import java.util.Collection;

import day02.Point;

/**
 * @author Joshua
 * @version boolean contains(E e)
 * 判断当前集合是否包含给定元素
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
		 * 集合判断是否包含指定元素是依靠元素的equals比较的结果。
		 * 只要集合中有元素与给定元素比较为true，则认为包含。
		 * toString和equals在Point中必须重写
		 */
		boolean contains = c.contains(p);
		System.out.println(contains);

	}
}
