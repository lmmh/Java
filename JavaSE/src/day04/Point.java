package day04;
/**
 * @author Joshua
 * @version 泛型
 * 泛型又称为参数化类型，是将当前类的属性的类型，
 * 方法参数的类型以及方法返回值的定义权移交给使用者。
 * 使用者在创建当前的类的同时将泛型的实际类型传入。
 *
 */
public class Point<T> {
	private T x;
    private T y;
    public Point(T x, T y) {
		super();
		this.x = x;
		this.y = y;
	}
	public T getX() {
		return x;
	}
	public void setX(T x) {
		this.x = x;
	}
	public T getY() {
		return y;
	}
	public void setY(T y) {
		this.y = y;
	}
	public String toString(){
		return "("+x+","+y+")";
	}
	
}
