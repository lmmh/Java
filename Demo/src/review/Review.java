package review;
import java.util.Scanner;
public class Review {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		char[] a = randomChar();
		System.out.println(a);
		System.out.println("猜吧！");
		int[] result;
		int score = 0;
		int num = 0;
		do{
			String s = scan.next().toUpperCase();
			char[] str = s.toCharArray();
			 if(s.equals("EXIT")){
				System.out.println("game over!");
				break;
			}
			 result = check(a,str);
			 if(result[1]==a.length){
				 score = a.length*100 - num*10;
				 System.out.println("恭喜你回答正确！得分"+score);
				 break;
			 }else{
				 String sustr = "字符正确："+result[0]+"个，位置正确："+result[1]+"个";
				 System.out.println(sustr);
				 num++;
			 }
			 
		}while(result[1]!=a.length);
		
		

	}
	
	public static char[] randomChar(){
		  char[] result = new char[5];
		  char[] letters = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
		  int index;
		  boolean[] flag = new boolean[letters.length];
		  
		  for(int i=0; i<5; i++){
			  do{
				   index =(int)(Math.random()*letters.length);
			  }while(flag[index]==true);
			  result[i] = letters[index];
			  flag[index] = true;
		  }
		return result;
	}
	public static int[] check(char[] a,char[] b){
	    int result[] = new int[2];
		for(int i=0; i<a.length; i++){
			for(int j=0; j<b.length; j++){
				if(b[j]==a[i]){
					result[0]++;
					if(i==j){
						result[1]++;
					}
					break;
				}
			}
		}
		
		return result;
	}

}
