package oop;

public class testPerson {

	public static void main(String[] args) {
		Person per = new Person();
		per.name = "小明";
		per.age =23;
		per.address = "黑龙江省哈尔滨市";
	    per.study();
		per.msg();
		
		
		
		Person zs = new Person();
		zs.name = "张山";
		zs.age = 24;
		zs.address = "黑龙江省齐齐哈尔";
		zs.study();
		zs.msg();
		
		
		Person mc = new Person();
		mc.name = "马超";
		mc.age = 25;
		mc.address = "西安";
		mc.study();
		mc.msg();

	}

}
