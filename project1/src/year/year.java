package year;
import java.util.Scanner;
public class year {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Scanner scan = new Scanner(System.in);
        System.out.println("��������ݣ�");
        int year = scan.nextInt();
        boolean flag = (year%4 == 0 && year%100 !=0) || year%400 ==0;
        String str = flag ? year+"������" : year+"��������";
        System.out.println(str);
	}

}
