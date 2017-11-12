package age;
import java.util.Scanner;
public class age {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入年份：");
		int age = scan.nextInt();
		System.out.println(age>=18 && age<=50);

	}

}
