package day01;
import java.util.Scanner;
/**
 * ��дһ������Ҫ���û�����һ����ַ��Ϣ��
 * ��ʽ�������£�
 * www.baidu.com
 * www.baidu.com.cn
 * http://www.baidu.com
 * Ȼ�󾭹���������������磬baidu
 * @author Joshua
 *
 */
public class CutString {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("������ٶ���ַ��");
		String str = scan.next();
		String sub = cut(str);
		System.out.println(sub);

	}
	public static String cut(String str){
		int index = str.indexOf("baidu");
		String substr = str.substring(index,index+5);
		return substr;
	}

}
