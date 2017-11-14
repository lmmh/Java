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
				System.out.println("太大了！");
			
			}else{
				System.out.println("太小了！");
			}
			System.out.println("继续猜！");
			guess = scan.nextInt();
		}
        if(guess == num){
        	System.out.println("恭喜你，回答正确！");
        }else{
        	System.out.println("欢迎下次挑战！");
        }
	}

}
