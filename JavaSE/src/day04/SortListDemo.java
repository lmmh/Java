package day04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
/*
 * collections和collection的区别？
 * collection是集合的接口，
 * collections是集合的工具类，
 * 提供了便于操作集合的方法。
 */

/**
 * @author Joshua
 * @version 排序集合元素
 * 排序集合使用的是集合的工具类Collections
 * 的静态方法sort。
 * 排序仅对List集合进行。因为Set部分实现类是无序的
 */
public class SortListDemo {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		Random random = new Random();
		for(int i=0; i<10; i++){
			list.add(random.nextInt(100));
		}
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
	}
}
