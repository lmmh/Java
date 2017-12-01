package day01;

/**
 * @author Joshua
 *练习String API
 */
public class StringDemo {
	public static void main(String[] args) {
		String str = "HelloWorld";
		//输出字符长的长度
		System.out.println(str.length());
	    //输出o的索引
		System.out.println(str.indexOf("o"));
		//从索引5开始向后找o的位置
		System.out.println(str.indexOf("o",5));
		//截取Hello
		System.out.println(str.substring(0, 5));
		//截取World
		System.out.println(str.substring(5));
		
		String str1 = "  hello ";
		//字符串去掉后面空白
		System.out.println(str1.trim());
		//返回指定位置的字符
		System.out.println(str.charAt(5));
		//判断字符串是否以指定字符串开头和结尾的
		boolean flag = str.startsWith("H") && str.endsWith("ld");
		System.out.println(flag);
		//将字符串全部转换为大写字母
		System.out.println(str.toUpperCase());
		//将字符串全部转换为小写字母
		System.out.println(str.toLowerCase());
		

	}

}
