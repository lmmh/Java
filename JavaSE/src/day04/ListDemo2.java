package day04;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Administrator
 *@version List�����ṩ��һ�����ص�add,remove����
 *void add(int index,E e)
 *������Ԫ�ز��뵽ָ��λ��
 *
 *E remove(int index)
 *�Ӽ�����ɾ��ָ��λ�õ�Ԫ�أ������䷵��
 */
public class ListDemo2 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("һ");
		list.add("��");
		list.add("��");
		list.add("��");
		//[one,two,three,four]
		System.out.println(list);
		//[one,2,two,three,four]ָ��λ�ò���Ԫ��
		list.add(1,"2");
		System.out.println(list);
		//[one,2,three,four]ɾ��ָ��λ�õ�Ԫ��
		String old = list.remove(2);
		System.out.println(old);//����ֵΪɾ������Ԫ��
		System.out.println(list);
	}
}