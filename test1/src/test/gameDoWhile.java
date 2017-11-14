package test;
import java .util .Scanner;
public class gameDoWhile {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = (int)(Math.random()*1000+1);
		System.out.println(num);
		int guess;
		do{
		System.out.println("猜吧！");
		guess = scan.nextInt();
		if(guess==0){
			break;
		}else if(guess>num){
			System.out.println("太大了！");
		}else if(guess<num){
			System.out.println("太小了");
		}
		}while(guess!= num);
        if(guess==num){
        	System.out.println("恭喜回答正确！");
        }else{
        	System.out.println("下次加油吧！");
        }
	}

}
