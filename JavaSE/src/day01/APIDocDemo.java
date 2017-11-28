package day01;

/**
 * @author Joshua
 * @version 2017/11/27
 * 注释加在类、常量、方法上
 */
public class APIDocDemo {
	/**
	 * sayHello方法中用到的问候语
	 */
	public static final String INFO = "你好！";
	/**
	 * 为指定用户添加一个问候语
	 * @param name 指定用户的名字
	 * @return 添加问候语后的字符串
	 */
    public static String sayHello(String name){
    	return INFO+name;
    }
}
