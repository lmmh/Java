package day02;
import java.util.Scanner;
/**
 * @author Joshua
 *�������ʽ��֤�ֻ���
 */
public class RegTel {
	public static void main(String[] args) {
	   Scanner scan = new Scanner(System.in);
	   System.out.println("������һ���ֻ��ţ�");
	   String str = scan.nextLine();
	   String regex = "1[0-9]{10}";
	   if(str.matches(regex)){
		   System.out.println(str+"���ֻ���");
	   }else{
		   System.out.println(str+"�����ֻ���");
	   }
	}

}