package day01;

/**
 * String substring(int start,int end)
 * 截取字符串，从指定位置（start）开始截取到指定的位置（end）
 * java api有一个特点，通常用两个数字表示范围时，都是含头不含尾的。
 * @author Joshua
 *
 */
public class TestSubString {
	public static void main(String[] args) {
		//            0123456789012345
		String str = "thinking in java";
		//截取ink
		 String substr = str.substring(2,5) ;
		 System.out.println(substr);
		 //从指定位置开始截取到末尾
		 substr = str.substring(2);
		 System.out.println(substr);
 
	}

}
