package day01;

/**
 * String substring(int start,int end)
 * ��ȡ�ַ�������ָ��λ�ã�start����ʼ��ȡ��ָ����λ�ã�end��
 * java api��һ���ص㣬ͨ�����������ֱ�ʾ��Χʱ�����Ǻ�ͷ����β�ġ�
 * @author Joshua
 *
 */
public class TestSubString {
	public static void main(String[] args) {
		//            0123456789012345
		String str = "thinking in java";
		//��ȡink
		 String substr = str.substring(2,5) ;
		 System.out.println(substr);
		 //��ָ��λ�ÿ�ʼ��ȡ��ĩβ
		 substr = str.substring(2);
		 System.out.println(substr);
 
	}

}