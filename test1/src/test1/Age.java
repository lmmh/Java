package test1;
import java.util.Scanner;
public class Age {

	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    System.out.println("���������䣺");
        int age = scan.nextInt();
        if(age>=18 && age<=50){
        	System.out.println("�������Ҫ��");
        }else{
        	System.out.println("���䲻����Ҫ��");
        }
	}

}
