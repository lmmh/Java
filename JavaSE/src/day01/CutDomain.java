package day01;
import java.util.Scanner;
/**
 * 编写一个程序，要求用户输入一个网址信息。
 * 格式可是如下：
 * www.baidu.com
 * www.sohu.com.cn
 * http://www.baidu.com
 * 然后经过处理，输出域名，如，baidu
 * @author Joshua
 *
 */
public class CutDomain {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入网址：");
		String str = scan.next();
		String substr = Cut(str);
		System.out.println(substr);
	}
	public static String Cut(String str){
		//获得第一个"."后第一个字符的位置
		int start = str.indexOf(".")+1;
	    //从第一个"."后的第一个字符位置开始向后找
		int end =  str.indexOf(".",start);
		String substr = str.substring(start,end);
		return substr;
	}

}
