package test;
import java .util .Scanner;
public class gameDoWhile {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = (int)(Math.random()*1000+1);
		System.out.println(num);
		int guess;
		do{
		System.out.println("�°ɣ�");
		guess = scan.nextInt();
		if(guess==0){
			break;
		}else if(guess>num){
			System.out.println("̫���ˣ�");
		}else if(guess<num){
			System.out.println("̫С��");
		}
		}while(guess!= num);
        if(guess==num){
        	System.out.println("��ϲ�ش���ȷ��");
        }else{
        	System.out.println("�´μ��Ͱɣ�");
        }
	}

}
