package day03;
import java.util.Calendar;
/**
 * @author Joshua
 * @version ��ȡĳһ��ʱ���������������ֵ������깲�ж����죬2�¹��ж����졣��
 *
 */
public class CalendarDemo3 {
	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		//������ж����죿
		int days = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
		System.out.println(days);
		
		//2���ж����죿
		calendar.set(Calendar.MONTH,1);
		days = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
		System.out.println(days);
		//�����ж����죿
		int year = calendar.getActualMaximum(Calendar.DAY_OF_YEAR);
		System.out.println(year);
		
	}

}
