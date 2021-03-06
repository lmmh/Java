package day01;

/**
 * int indexOf(String str)
 * 该方法使用来查找给定字符串在当前字符串中的位置。
 * 该方法有几种重载方法。
 * @author Joshua
 *
 */
public class TestIndexOf {
	public static void main(String[] args) {
		           // 012345678901234567
		String str = "thinking jain java";
		//查找ja在str字符串中的位置，若没有会返回-1。
		int index = str.indexOf("ja");
		System.out.println("ja的index:"+index);
		
		//重载方法允许从指定位置处开始查找，但结果还是在整个字符串的位置，结果不变。
		index = str.indexOf("ja",3);
		System.out.println(index);
		
		//返回字符串最后出现的位置
		index = str.lastIndexOf("ja",9);
		System.out.println(index);
	}

}
