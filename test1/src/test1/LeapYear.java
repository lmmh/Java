package test1;
import java.util.Scanner;
public class LeapYear {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("��������ݣ�");
		int year = scan.nextInt();
		//����һ
		if(year%4==0 && year%100!=0 || year%400==0){
			System.out.println("�������������");
		}else{
			System.out.println("��������ݲ�������");
		}
		//������
	   /*boolean flag = year%4==0 && year%100!=0 || year%400==0;
	   String str = flag? year + "������" : year + "��������";	
	   System.out.println(str);*/
	}

}
