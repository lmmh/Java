package test1;
import java.util.Scanner;
public class Cashier {

	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    System.out.println("�����뵥�ۣ�");
		double price = scan.nextDouble();
		System.out.println("������������");
		double amount = scan.nextDouble();
		System.out.println("�����");
		double money = scan.nextDouble();
		double totalPrice = price * amount;
		if(totalPrice>=500){
			totalPrice *= 0.8; 
		}
		if(totalPrice<money){
			 double change = money - totalPrice;
			 System.out.println("�ܼ�Ϊ��"+totalPrice+","+"����Ϊ��"+ change);
		}else{
			System.out.println("ERROR �������");
		}
		
	}

}
