package day01;

/**
 * @author Joshua
 *��ϰString API
 */
public class StringDemo {
	public static void main(String[] args) {
		String str = "HelloWorld";
		//����ַ����ĳ���
		System.out.println(str.length());
	    //���o������
		System.out.println(str.indexOf("o"));
		//������5��ʼ�����o��λ��
		System.out.println(str.indexOf("o",5));
		//��ȡHello
		System.out.println(str.substring(0, 5));
		//��ȡWorld
		System.out.println(str.substring(5));
		
		String str1 = "  hello ";
		//�ַ���ȥ������հ�
		System.out.println(str1.trim());
		//����ָ��λ�õ��ַ�
		System.out.println(str.charAt(5));
		//�ж��ַ����Ƿ���ָ���ַ�����ͷ�ͽ�β��
		boolean flag = str.startsWith("H") && str.endsWith("ld");
		System.out.println(flag);
		//���ַ���ȫ��ת��Ϊ��д��ĸ
		System.out.println(str.toUpperCase());
		//���ַ���ȫ��ת��ΪСд��ĸ
		System.out.println(str.toLowerCase());
		

	}

}
