package day02;

/**
 * @author Joshua
 *
 */
public class RegRep { 
	public static void main(String[] args) {
		String str = "123abc456def789";
		String regex = "[0-9]+";
		String sub = str.replaceAll(regex, "%20");
		System.out.println(sub);

	}

} 