package day04;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

/**
 * @author Joshua
 * @version ���ϵ���������
 */
public class CollectionDemo1 {
	public static void main(String[] args) {
	 Collection c1 = new ArrayList();
	 c1.add("java");
	 c1.add("php");
	 c1.add("c++");
	 c1.add("css");
	 System.out.println(c1);
	 
	 Collection c2 = new HashSet();//�����в��������ظ�Ԫ��
	 c2.add("css");
	 c2.add("html");
	 c2.add("js");
	 c2.add("js");//���ܷ���ͬԪ��
	 System.out.println(c2);
	 /*
	  * ȡ����
	  * boolean addAll(Collection c)
	  * �����������е�����Ԫ����ӵ���ǰ������
	  * ��Ӻ�ֻҪ��ǰ����Ԫ�����������˱仯���򷵻�true��
	  */
	 boolean flag = c2.addAll(c1);
	 System.out.println(flag);
	 System.out.println(c2);
	 /*
	  * boolean containsAll(Collection c)
	  * �жϵ�ǰ����Ԫ���Ƿ�������������е�����Ԫ��
	  */
	 Collection c3 = new ArrayList();
	 c3.add("php");
	 c3.add("java");
	 c3.add("python");
	 boolean contains = c1.containsAll(c3);
	 System.out.println(contains);//false
	 /*
	  * �Ӽ�����ɾ�����������й��е�Ԫ��
	  */
	 c1.removeAll(c3);
	 System.out.println(c1);
	 System.out.println(c3);
	}
}
