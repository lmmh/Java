package day04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
/*
 * collections��collection������
 * collection�Ǽ��ϵĽӿڣ�
 * collections�Ǽ��ϵĹ����࣬
 * �ṩ�˱��ڲ������ϵķ�����
 */

/**
 * @author Joshua
 * @version ���򼯺�Ԫ��
 * ���򼯺�ʹ�õ��Ǽ��ϵĹ�����Collections
 * �ľ�̬����sort��
 * �������List���Ͻ��С���ΪSet����ʵ�����������
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