package day04;
/**
 * @author Joshua
 *JDK5.0֮���Ƴ���һ�������ԣ�
 *��ǿforѭ�����ֽ���ѭ���� for each
 *
 *��ѭ�����������ͳѭ�������ý����������������ϻ�����ġ�
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
