package day04;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @author Administrator
 *@version ����֧�ַ��ͣ�������������Լ��������Ԫ�ص����͡�
 */
public class CollectionDemo3 {
	public static void main(String[] args) {
	    Collection<String> c = new ArrayList<String>();
	    c.add("һ");
	    c.add("��");
	    c.add("��");
	    c.add("��");
	    
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
