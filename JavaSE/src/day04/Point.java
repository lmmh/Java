package day04;
/**
 * @author Joshua
 * @version ����
 * �����ֳ�Ϊ���������ͣ��ǽ���ǰ������Ե����ͣ�
 * ���������������Լ���������ֵ�Ķ���Ȩ�ƽ���ʹ���ߡ�
 * ʹ�����ڴ�����ǰ�����ͬʱ�����͵�ʵ�����ʹ��롣
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
