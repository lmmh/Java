package day02;

/**
 * @author Joshua
 *正则表达式验证邮箱
 */
public class Reg {
	public static void main(String[] args) {
	String regex = "[a-zA-Z0-9_]+@[a-zA-Z0-9]+(\\.[a-zA-Z0-9]+)+";
	System.out.println(regex);
	String mail = "lg56578375@163.com.cn";
	boolean flag = mail.matches(regex);
	if(flag){
		System.out.println("是邮箱");
	}else{
	    System.out.println("不是邮箱");	
	}
	
	}

}
