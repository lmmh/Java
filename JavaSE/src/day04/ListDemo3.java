package day04;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Joshua
 *@version ȡ�Ӽ�
 *
 *List subList(int start,int end);
 *��ȡ��ǰ������ָ����Χ�ڵ��Ӽ���ͬ����ͷ����β
 */
public class ListDemo3 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		for(int i=0; i<10; i++){
			list.add(i);
		}
		//[0-9]
		System.out.println(list);
		//[3-7]
		List<Integer> subList = list.subList(3,8);
		System.out.println(subList);
		//���Ӽ��е�ÿ��Ԫ������10��
		for(int i=0; i<subList.size(); i++){
			int n = subList.get(i);
			n=n*10;
			subList.set(i, n);
		}
		System.out.println(subList);
		/*
		 * ���Լ����޸ģ������޸�ԭ������Ӧ������
		 */
		System.out.println(list);
		/*
		 * ɾ��������2-8��Ԫ��
		 */
		list.subList(2, 9).clear();
		System.out.println(list);
	}
}