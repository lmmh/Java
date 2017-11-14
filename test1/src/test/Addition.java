package test;
import java.util.Scanner;
public class Addition {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int score = 0;
		for(int i=1; i<=10; i++){
			int a = (int)(Math.random()*100+1);
			int b = (int)(Math.random()*100+1);
			int sum = a+b;
			System.out.println("("+i+")"+ a+"+"+b+"=?");
			 
			int answer = scan.nextInt();
			if(answer==-1){
				break;
			}
			if(answer==sum){
				System.out.println("正确");
				score+=10;
			}else{
				System.out.println("错误");
				
			}
			
		}
		System.out.println("得分为："+score);

	}

}
