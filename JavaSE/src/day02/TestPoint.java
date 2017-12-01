package day02;

/**
 * @author Joshua
 *自己定义的类时，需要重写toString()方法。
 */
public class TestPoint {
	public static void main(String[] args) {
		Point p1 = new Point(1,2);
		String str = p1.toString();
		
		System.out.println(p1);
		
		Point p2 = new Point(1,2);
		System.out.println(p1==p2);
		System.out.println(p1.equals(p2));
	}

}
