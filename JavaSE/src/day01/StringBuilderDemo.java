/**
 * 
 */
package day01;

/**
 * StringBuilder提供了用于修改字符串内容相关的方法。
 * 其内部维护是一个可变的字符数组，所以修改都是在当前对象内部完成的。
 * 当频繁修改字符串内容时应使用当前类来完成。
 * @author Joshua
 *
 */
public class StringBuilderDemo {
	public static void main(String[] args) {
		String str = "I like pizza";
		/*将String转换为StringBuilder
		 * 可使用有参的构造方法。
		 * StringBuilder也有无参的构造方法，默认表示空字符串。
		 * 
		 * */
		StringBuilder builder = new StringBuilder(str);
		/*
		 * 从StringBuilder转换为字符串
		 * 使用StringBuilder的toString方法即可。
		 *
		 * */
		str = builder.toString();
		/*StringBuilder append(String str)
		 * 向当前字符串末尾追加指定内容。
		 * 有若干重载方法，参数类型不同，这些重载方法允许追加其他内容（先转换为字符串再追加）
		 * */
		builder.append(",所以我爱吃。");
		System.out.println(builder.toString());
		/*
		 * StringBuilder replace(int start,int end,String str)
		 * 将指定范围内的字符串替换为指定的内容。
		 * 含头不含尾
		 * */
		 builder.replace(0,6, "I Love");
		 System.out.println(builder.toString());
		/*
		 *反转字符串
		 * */
		 
		 String substr = "1234567890";
		 StringBuilder build = new StringBuilder(substr);
		 
		 System.out.println(build.reverse());
		 
		 
		 
		 
	}

}
