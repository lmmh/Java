package day03;

import java.util.Date;

/**
 * @author Joshua
 *
 */
public class DateDemo {
	public static void main(String[] args) {
		Date now = new Date();
		System.out.println(now);
		/*
		 * Date大部分方法不建议使用了
		 * */
		now.getYear();
		/*
		 * 获取Date内部维护的long值
		 * 
		 * */
        long time = now.getTime();
        System.out.println(time);
        //明天这一刻的毫秒值
        time+=1000*60*60*24;
        now.setTime(time);
        System.out.println(now);
	}

}
