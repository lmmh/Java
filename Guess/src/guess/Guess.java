package guess;
import java.util.Scanner;
public class Guess {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		char[] chs = randomChar();
		System.out.println(chs);
		System.out.println("开始猜吧！");
		int[] res;
		int count = 0;
		do{
			String s = scan.next().toUpperCase();
			char[] input = s.toCharArray();
			if(s.equals("EXIT")){
				System.out.println("下次再来吧！");
				break;
			}
			 res = check(chs,input);
			 if(res[1]==chs.length){
				 System.out.println("恭喜你回答正确！");
	             int score = chs.length*100 - count*10;
	             System.out.println("得分为："+score);
				 break;
			 }else{
				 System.out.println("猜对字符"+res[0]+"个，"+"猜对位置"+res[1]+"个");
			     count++;
			 }
			 
		}while(res[1]!=chs.length);
	}
    public static char[] randomChar(){
    	char[] chs = new char[5];
    	char[] letters = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
    	boolean[] bool = new boolean[letters.length];
    	for(int i=0; i<chs.length; i++){
    		int index;
			do{
    			 index = (int)(Math.random()*26);
    		}while(bool[index]==true);
    		chs[i] = letters[index];
    		bool[index] = true;
    	}
    	return chs;
    }
	public static int[] check(char[] chs,char[] input){
		int[] result = new int[2];
		for(int i=0; i<chs.length; i++){
			for(int j=0; j<input.length; j++){
				if(input[j]==chs[i]){
					result[0]++;//字符数正确+1
					if(j==i){
						result[1]++;//位置对+1
					}
					break;
				}
			}
		}
		return result;
	}

}
