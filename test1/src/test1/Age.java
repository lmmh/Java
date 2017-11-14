package test1;
import java.util.Scanner;
public class Age {

	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    System.out.println("请输入年龄：");
        int age = scan.nextInt();
        if(age>=18 && age<=50){
        	System.out.println("年龄符合要求");
        }else{
        	System.out.println("年龄不符合要求");
        }
	}

}
