package day01;

/**
 * �жϵ�ǰ�ַ����Ƿ�Ϊ������
 * @author Joshua
 *
 */
public class ChatAt {
	public static void main(String[] args) {
		String str = "123456754321";
/*����һ��		boolean flag = false;
		for(int i=0; i<str.length()/2; i++){
			if(str.charAt(i)==str.charAt(str.length()-1-i)){
				flag = true;
			}else{
				flag = false;
				break;
			}  
		}
		if(flag){
			System.out.println(str+"�ǻ�����");
		}else{
			System.out.println(str+"���ǻ�����");
		}*/
	    for(int i=0; i<str.length()/2; i++){
	    	if(str.charAt(i) != str.charAt(str.length()-1-i)){
	    		System.out.print("��");
	    		//return;�������� ����ֵΪvoidʱʹ��
	    		break;
	    	}
	    }
	    System.out.println("�ǻ�������");
	}
}