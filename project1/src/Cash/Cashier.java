package Cash;
import java.util.Scanner;
public class Cashier {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
         Scanner  scan = new Scanner(System.in);
         System.out.println("请输入单价：");
         double price = scan.nextDouble();
         System.out.println("请输入数量：");
         double amount = scan.nextDouble();
         double totalPrice = price * amount;
         System.out.println("收入现金:");
         double money = scan.nextDouble();
         double change = money - totalPrice;
         System.out.println("总价："+totalPrice+","+"找零:"+change);
	}

}
