package day04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Joshua
 * @version ����ת��Ϊ����
 * ��Ҫע�⣬ת��ֻ��ת��ΪList����
 * ʹ�õ�������Ĺ�����Arrays�ľ�̬����asList
 * ֻ��ת��ΪList���ϵ���Ҫԭ���ǣ�Set���ܴ��
 * �ظ�Ԫ�ء�������ת��ΪSet���Ͽ��ܳ��ֶ�ʧԪ�ص����
 *       
 */
public class ArrayToListDemo {
	public static void main(String[] args) {
		String[] array = {"one","two","three","four"};
		List<String> list = Arrays.asList(array);
		System.out.println(list);
		/*
		 * �򼯺�������һ��Ԫ��
		 * 
		 * ʵ�������������׳��쳣��ԭ�����ڣ��ü���
		 * ��������ת�������ģ���ô�ü��Ͼͱ�ʾԭ����
		 * ���飬���ԶԼ��ϵĲ������Ƕ�����Ĳ�������ô
		 * ����Ԫ�ػᵼ��ԭ��������ݣ���ô�Ͳ��ܱ�ʾԭ����
		 * �����ˡ����Բ�������ü���������Ԫ�ء�
		 */
		//list.add("five");
		//System.out.println(list);
		//�޸ļ���Ԫ�أ�����Ԫ��Ҳ��ı�
		list.set(1, "2");
		System.out.println(list);
		for(String str : array){
			System.out.println(str);
		}
		/*
		 * ��ϣ����ɾԪ�أ���Ҫ������һ������
		 */
//		List<String> list1 = new ArrayList<String>();
//		list1.addAll(list);
		/*
		 * ���еļ��϶��ṩ��һ������Collection
		 * ���Ͳ����Ĺ��췽����
		 * �ù��췽����Ϊ�����ƹ�����
		 * �������ڴ�����ǰ���ϵ�ͬʱ��
		 * �����а����������ϵ�����Ԫ�ء�
		 */
		List<String> list1 = new ArrayList<String>(list);
		list1.add("five");
		System.out.println(list1);
	}
}