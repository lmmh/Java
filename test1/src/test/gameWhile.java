package test;
import java.util.Scanner;
public class gameWhile {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = (int)(Math.random()*1000+1);
		System.out.println(num);
		int guess = scan.nextInt();
		while(guess!=num){
			if(guess == 0){
				break;
			}else if(guess>num){
				System.out.println("̫���ˣ�");
			
			}else{
				System.out.println("̫С�ˣ�");
			}
			System.out.println("�����£�");
			guess = scan.nextInt();
		}
        if(guess == num){
        	System.out.println("��ϲ�㣬�ش���ȷ��");
        }else{
        	System.out.println("��ӭ�´���ս��");
        }
	}

}
