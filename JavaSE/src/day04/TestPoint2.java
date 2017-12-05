package day04;
/**
 * @author Joshua
 * 泛型的原型为Object
 * 定义了泛型只是编译器在做一些验证工作
 * 当我们对泛型的类型设置值时，会检查是否满足类型要求。
 * 当我们获取一个泛型类型的值时，会自动进行类型转换。
 *
 */
public class TestPoint2 {
	public static void main(String[] args) {
		/*
		 * 这里指定泛型的实际类型为Integer
		 * 但实际上，创建的Point对象中的想x，y属性
		 * 是Object类型，这里只是应当将它当做Integer看待。
		 */
	Point<Integer>p1 = new Point<Integer>(1,2);
	/*
	 * 由于参数是T，这里会验证实参是否为Integer,
	 * 若不是，则编译失败！
	 * 可以传入基本类型，因为还会自动装箱。 
	 */
	p1.setX(1);
	/*
	 * 获取时，也会自动进行造型。这里无需显示的进行类型转换。
	 */
	int x1 = p1.getX();  
	/*
	 * 若不指定泛型，则使用默认的Object类型
	 */
	Point p2 = p1;
	p2.setX("一");
	String x2 = (String)p2.getX();
	System.out.println(x2);
	//类造型异常
	x1 = p1.getX();
	System.out.println(x1);
	}

}
