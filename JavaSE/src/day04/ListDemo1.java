package day04;
import java.util.ArrayList;
import java.util.List;
/**
 * @author Joshua
 *@version java.util.List
 *���ظ�������������
 *�ص��ǿ��Ը����±����Ԫ�ء�
 *����ʵ���ࣺ
 *ArrayList:ʹ������ʵ�֣���ѯ���졣
 *LinkedList:ʹ������ʵ�֣���ɾ���죨��β��ɾЧ�����ԣ���
 */
public class ListDemo1 {
	public static void main(String[] args) {
		/*
		 * E set(int index,E e)
		 * ��������Ԫ�����õ�ָ����λ���ϣ�����ֵΪ
		 * ԭλ�� ��Ԫ�ء��������滻Ԫ�ز���
		 */
		List<String> list = new ArrayList<String>();
		list.add("one");
		list.add("two");
		list.add("three");
		list.add("four");
		//[one,two,three,four]
		System.out.println(list);
		String old = list.set(1, "2");//����ֵΪ���滻����Ԫ��
		//two
		System.out.println(old);
		//[one,2,three,four];
		System.out.println(list);
		//list.set(4,"five");//�������±�Խ��
		list.add("five");
		/*
		 * E get(int index)
		 * ��ȡ�����±��Ӧ��Ԫ��
		 */
		//��ȡ������Ԫ��
		
		String str = list.get(4);
		System.out.println(str);
		//��ͳѭ������List����
		for(int i=0; i<list.size(); i++){
			str = list.get(i);
			System.out.println(str);
		}
	}
}