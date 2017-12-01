package day02;

/**
 * @author Joshua
 * 
 * @versionÍ¼Æ¬ÖØÃüÃû
 */
public class RegPic {
	public static void main(String[] args) {
         String str = "1.jpg";
         String regex = "\\.";
         String[] arr = str.split(regex);
         str = System.currentTimeMillis()+"."+arr[1];
         System.out.println(str);

	}

}
