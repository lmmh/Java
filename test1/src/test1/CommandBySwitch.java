package test1;
import java.util.Scanner;
public class CommandBySwitch {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("1-ע�������2-��¼������0-�˳�");
		int num = scan.nextInt();
        switch(num){
        case 1:
        	System.out.println("ע�������");
        	break;
        case 2:
        	System.out.println("��¼������");
        	break;
        case 0:
        	System.out.println("�˳���");
        	break;
        default:
        	System.out.println("δָ֪�");
        }
        
	}

}
