package day04;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

/**
 * @author Joshua
 * @version 集合的批量操作
 */
public class CollectionDemo1 {
	public static void main(String[] args) {
	 Collection c1 = new ArrayList();
	 c1.add("java");
	 c1.add("php");
	 c1.add("c++");
	 c1.add("css");
	 System.out.println(c1);
	 
	 Collection c2 = new HashSet();//集合中不允许有重复元素
	 c2.add("css");
	 c2.add("html");
	 c2.add("js");
	 c2.add("js");//不能放相同元素
	 System.out.println(c2);
	 /*
	  * 取并集
	  * boolean addAll(Collection c)
	  * 将给定集合中的所有元素添加到当前集合中
	  * 添加后只要当前集合元素数量发生了变化，则返回true。
	  */
	 boolean flag = c2.addAll(c1);
	 System.out.println(flag);
	 System.out.println(c2);
	 /*
	  * boolean containsAll(Collection c)
	  * 判断当前集合元素是否包含给定集合中的所有元素
	  */
	 Collection c3 = new ArrayList();
	 c3.add("php");
	 c3.add("java");
	 c3.add("python");
	 boolean contains = c1.containsAll(c3);
	 System.out.println(contains);//false
	 /*
	  * 从集合中删除两个集合中共有的元素
	  */
	 c1.removeAll(c3);
	 System.out.println(c1);
	 System.out.println(c3);
	}
}
