package Cash;
import java.util.Scanner;
public class Cashier {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
         Scanner  scan = new Scanner(System.in);
         System.out.println("�����뵥�ۣ�");
         double price = scan.nextDouble();
         System.out.println("������������");
         double amount = scan.nextDouble();
         double totalPrice = price * amount;
         System.out.println("�����ֽ�:");
         double money = scan.nextDouble();
         double change = money - totalPrice;
         System.out.println("�ܼۣ�"+totalPrice+","+"����:"+change);
	}

}
