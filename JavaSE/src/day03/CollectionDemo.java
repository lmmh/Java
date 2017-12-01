package day03;
import java.util.ArrayList;
import java.util.Collection;
/**
 * @author Joshua
 *@version java.util.Collection
 *���ϣ����ڴ洢һ��Ԫ�أ��ṩ��ά�����ϵ���ز�����
 *�������������ӽӿڣ�
 *List:���ظ���
 *Set:�����ظ���
 *Ԫ���Ƿ��ظ�������Ԫ������equals�����ȽϵĽ�������ġ�
 */
public class CollectionDemo {
	public static void main(String[] args) {
		Collection c = new ArrayList();
		/*
		 * boolean add(E e)��EΪObject
		 * �򼯺�������Ԫ��
		 * ��Ԫ�سɹ����ӵ����Ϻ󷵻�ֵΪtrue
		 * 
		 */
		c.add(1);
		c.add(2);
		c.add(3);
		c.add("three");
		System.out.println(c);
		/*
		 * int size();
		 * ���ص�ǰ����Ԫ�صĸ���
		 * ��ͬ������ĳ���length
		 */
		System.out.println("size:"+c.size());
		/*
		 * boolean isEmpty()
		 * �жϵ�ǰ�����Ƿ񲻺����κ�Ԫ��
		 * �ռ���
		 */
		boolean isEmpty = c.isEmpty();
		System.out.println(isEmpty);
		/*
		 * ���������
		 */
		c.clear();
		System.out.println("c��size:"+c.size());
		System.out.println("c�Ƿ�Ϊ�ռ�"+isEmpty);
	}
}