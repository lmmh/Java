package day03;

import java.util.ArrayList;
import java.util.Collection;

import day02.Point;

/**
 * @author Joshua
 *@version 集合存放元素存放的是元素的引用（地址）
 */
public class CollectionDemo2 {
	public static void main(String[] args) {
		Collection c = new ArrayList(); 					
		Point p = new Point(1,2);
		c.add(p);
		System.out.println(c);
		
		p.setX(2);
		p.setY(3);
		System.out.println(p); 
		System.out.println(c);

	}
}
