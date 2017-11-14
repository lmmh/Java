package test1;
import java.util.Scanner;
public class ScoreLevel {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入成绩：");
		int score = scan.nextInt();
		if(score<0 || score>=100){
			System.out.println("输入成绩不合法！");
		}else if(score>=90){
			System.out.println("A-成绩优秀");
		}else if(score>=80){
			System.out.println("B-成绩良好");
		}else if(score>=70){
			System.out.println("C-成绩一般");
		}else if(score>=60){
			System.out.println("D-成绩及格");
		}else{
			System.out.println("E-成绩不及格");
		}

	}

}
