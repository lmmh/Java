package test1;
import java.util.Scanner;
public class ScoreLevel {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("������ɼ���");
		int score = scan.nextInt();
		if(score<0 || score>=100){
			System.out.println("����ɼ����Ϸ���");
		}else if(score>=90){
			System.out.println("A-�ɼ�����");
		}else if(score>=80){
			System.out.println("B-�ɼ�����");
		}else if(score>=70){
			System.out.println("C-�ɼ�һ��");
		}else if(score>=60){
			System.out.println("D-�ɼ�����");
		}else{
			System.out.println("E-�ɼ�������");
		}

	}

}
