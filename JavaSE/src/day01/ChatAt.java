package day01;

/**
 * 判断当前字符串是否为回文数
 * @author Joshua
 *
 */
public class ChatAt {
	public static void main(String[] args) {
		String str = "123456754321";
/*方法一：		boolean flag = false;
		for(int i=0; i<str.length()/2; i++){
			if(str.charAt(i)==str.charAt(str.length()-1-i)){
				flag = true;
			}else{
				flag = false;
				break;
			}  
		}
		if(flag){
			System.out.println(str+"是回文数");
		}else{
			System.out.println(str+"不是回文数");
		}*/
	    for(int i=0; i<str.length()/2; i++){
	    	if(str.charAt(i) != str.charAt(str.length()-1-i)){
	    		System.out.print("不");
	    		//return;结束方法 返回值为void时使用
	    		break;
	    	}
	    }
	    System.out.println("是回文数！");
	}
}
