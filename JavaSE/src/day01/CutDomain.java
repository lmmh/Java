package day01;
import java.util.Scanner;
/**
 * ��дһ������Ҫ���û�����һ����ַ��Ϣ��
 * ��ʽ�������£�
 * www.baidu.com
 * www.sohu.com.cn
 * http://www.baidu.com
 * Ȼ�󾭹���������������磬baidu
 * @author Joshua
 *
 */
public class CutDomain {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("��������ַ��");
		String str = scan.next();
		String substr = Cut(str);
		System.out.println(substr);
	}
	public static String Cut(String str){
		//��õ�һ��"."���һ���ַ���λ��
		int start = str.indexOf(".")+1;
	    //�ӵ�һ��"."��ĵ�һ���ַ�λ�ÿ�ʼ�����
		int end =  str.indexOf(".",start);
		String substr = str.substring(start,end);
		return substr;
	}

}
