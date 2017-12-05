package day04;
/**
 * @author Joshua
 *JDK5.0之后推出的一个新特性：
 *增强for循环，又叫新循环， for each
 *
 *新循环不能替代传统循环。作用仅仅是用来遍历集合或数组的。
 */
public class NewForDemo {
	public static void main(String[] args) {
		String [] arr = {"one","two","three"};
		for(int i=0; i<arr.length; i++){
			System.out.println(arr[i]);
		}
		for(String str:arr){
			System.out.println(str);
		}
	}
}
