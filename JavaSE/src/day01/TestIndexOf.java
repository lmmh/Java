package day01;

/**
 * int indexOf(String str)
 * �÷���ʹ�������Ҹ����ַ����ڵ�ǰ�ַ����е�λ�á�
 * �÷����м������ط�����
 * @author Joshua
 *
 */
public class TestIndexOf {
	public static void main(String[] args) {
		           // 012345678901234567
		String str = "thinking jain java";
		//����ja��str�ַ����е�λ�ã���û�л᷵��-1��
		int index = str.indexOf("ja");
		System.out.println("ja��index:"+index);
		
		//���ط���������ָ��λ�ô���ʼ���ң�����������������ַ�����λ�ã�������䡣
		index = str.indexOf("ja",3);
		System.out.println(index);
		
		//�����ַ��������ֵ�λ��
		index = str.lastIndexOf("ja",9);
		System.out.println(index);
	}

}