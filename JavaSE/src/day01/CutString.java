package day01;
import java.util.Scanner;
/**
 * 编写一个程序，要求用户输入一个网址信息。
 * 格式可是如下：
 * www.baidu.com
 * www.baidu.com.cn
 * http://www.baidu.com
 * 然后经过处理，输出域名，如，baidu
 * @author Joshua
 *
 */
public class CutString {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入百度网址：");
		String str = scan.next();
		String sub = cut(str);
		System.out.println(sub);

	}
	public static String cut(String str){
		int index = str.indexOf("baidu");
		String substr = str.substring(index,index+5);
		return substr;
	}

}
