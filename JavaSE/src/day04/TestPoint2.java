package day04;
/**
 * @author Joshua
 * ���͵�ԭ��ΪObject
 * �����˷���ֻ�Ǳ���������һЩ��֤����
 * �����ǶԷ��͵���������ֵʱ�������Ƿ���������Ҫ��
 * �����ǻ�ȡһ���������͵�ֵʱ�����Զ���������ת����
 *
 */
public class TestPoint2 {
	public static void main(String[] args) {
		/*
		 * ����ָ�����͵�ʵ������ΪInteger
		 * ��ʵ���ϣ�������Point�����е���x��y����
		 * ��Object���ͣ�����ֻ��Ӧ����������Integer������
		 */
	Point<Integer>p1 = new Point<Integer>(1,2);
	/*
	 * ���ڲ�����T���������֤ʵ���Ƿ�ΪInteger,
	 * �����ǣ������ʧ�ܣ�
	 * ���Դ���������ͣ���Ϊ�����Զ�װ�䡣 
	 */
	p1.setX(1);
	/*
	 * ��ȡʱ��Ҳ���Զ��������͡�����������ʾ�Ľ�������ת����
	 */
	int x1 = p1.getX();  
	/*
	 * ����ָ�����ͣ���ʹ��Ĭ�ϵ�Object����
	 */
	Point p2 = p1;
	p2.setX("һ");
	String x2 = (String)p2.getX();
	System.out.println(x2);
	//�������쳣
	x1 = p1.getX();
	System.out.println(x1);
	}

}
