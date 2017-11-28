package day01;

/**
 * @author Joshua
 *
 */
public class StringDemo {
	public static void main(String[] args) {
		String str = "HelloWorld";
		System.out.println(str.length());
		System.out.println(str.indexOf("o"));
		System.out.println(str.indexOf("o",5));
		System.out.println(str.substring(0, 5));
		System.out.println(str.substring(5));
		
		String str1 = "  hello ";
		System.out.println(str1.trim());
		System.out.println(str.charAt(5));
		boolean flag = str.startsWith("H") && str.endsWith("ld");
		System.out.println(flag);
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		

	}

}