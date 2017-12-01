package day02;

/**
 * @author Joshua
 *split·Ö¸î×Ö·û´®
 */
public class StringSplit {

	public static void main(String[] args) {
		String str = "123abc456def789ghi";
		String regex = "[a-z]+";
		String[] arr = str.split(regex);
		for(int i=0; i<arr.length; i++){
			System.out.println(arr[i]);
		}
		System.out.println(arr.length);

	}

}
