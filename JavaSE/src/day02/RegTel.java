package day02;
import java.util.Scanner;
/**
 * @author Joshua
 *正则表达式验证手机号
 */
public class RegTel {
	public static void main(String[] args) {
	   Scanner scan = new Scanner(System.in);
	   System.out.println("请输入一个手机号：");
	   String str = scan.nextLine();
	   String regex = "1[0-9]{10}";
	   if(str.matches(regex)){
		   System.out.println(str+"是手机号");
	   }else{
		   System.out.println(str+"不是手机号");
	   }
	}

}
