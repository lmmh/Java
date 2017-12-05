package day04;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @author Administrator
 *@version 集合支持泛型，而泛型是用来约束集合中元素的类型。
 */
public class CollectionDemo3 {
	public static void main(String[] args) {
	    Collection<String> c = new ArrayList<String>();
	    c.add("一");
	    c.add("二");
	    c.add("三");
	    c.add("四");
	    
	    for(String str:c){
	    	System.out.println(str);
	    }
	    
	    Iterator<String> it = c.iterator();
	    while(it.hasNext()){
	    	String str = it.next();
	    	System.out.println(str);
	    }
	    

	}
}
