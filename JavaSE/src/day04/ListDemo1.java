package day04;
import java.util.ArrayList;
import java.util.List;
/**
 * @author Joshua
 *@version java.util.List
 *可重复集，并且有序。
 *特点是可以根据下标操作元素。
 *常用实现类：
 *ArrayList:使用数组实现，查询更快。
 *LinkedList:使用链表实现，增删更快（收尾增删效果明显）。
 */
public class ListDemo1 {
	public static void main(String[] args) {
		/*
		 * E set(int index,E e)
		 * 将给定的元素设置到指定的位置上，返回值为
		 * 原位置 的元素。所以是替换元素操作
		 */
		List<String> list = new ArrayList<String>();
		list.add("one");
		list.add("two");
		list.add("three");
		list.add("four");
		//[one,two,three,four]
		System.out.println(list);
		String old = list.set(1, "2");//返回值为被替换掉的元素
		//two
		System.out.println(old);
		//[one,2,three,four];
		System.out.println(list);
		//list.set(4,"five");//报错，下标越界
		list.add("five");
		/*
		 * E get(int index)
		 * 获取给定下标对应的元素
		 */
		//获取第三个元素
		
		String str = list.get(4);
		System.out.println(str);
		//传统循环遍历List集合
		for(int i=0; i<list.size(); i++){
			str = list.get(i);
			System.out.println(str);
		}
	}
}
