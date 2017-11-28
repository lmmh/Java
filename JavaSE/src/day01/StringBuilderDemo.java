/**
 * 
 */
package day01;

/**
 * StringBuilder�ṩ�������޸��ַ���������صķ�����
 * ���ڲ�ά����һ���ɱ���ַ����飬�����޸Ķ����ڵ�ǰ�����ڲ���ɵġ�
 * ��Ƶ���޸��ַ�������ʱӦʹ�õ�ǰ������ɡ�
 * @author Joshua
 *
 */
public class StringBuilderDemo {
	public static void main(String[] args) {
		String str = "I like pizza";
		/*��Stringת��ΪStringBuilder
		 * ��ʹ���вεĹ��췽����
		 * StringBuilderҲ���޲εĹ��췽����Ĭ�ϱ�ʾ���ַ�����
		 * 
		 * */
		StringBuilder builder = new StringBuilder(str);
		/*
		 * ��StringBuilderת��Ϊ�ַ���
		 * ʹ��StringBuilder��toString�������ɡ�
		 *
		 * */
		str = builder.toString();
		/*StringBuilder append(String str)
		 * ��ǰ�ַ���ĩβ׷��ָ�����ݡ�
		 * ���������ط������������Ͳ�ͬ����Щ���ط�������׷���������ݣ���ת��Ϊ�ַ�����׷�ӣ�
		 * */
		builder.append(",�����Ұ��ԡ�");
		System.out.println(builder.toString());
		/*
		 * StringBuilder replace(int start,int end,String str)
		 * ��ָ����Χ�ڵ��ַ����滻Ϊָ�������ݡ�
		 * ��ͷ����β
		 * */
		 builder.replace(0,6, "I Love");
		 System.out.println(builder.toString());
		/*
		 *��ת�ַ���
		 * */
		 
		 String substr = "1234567890";
		 StringBuilder build = new StringBuilder(substr);
		 
		 System.out.println(build.reverse());
		 
		 
		 
		 
	}

}
