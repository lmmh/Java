package oop;

public class testPerson {

	public static void main(String[] args) {
		Person per = new Person();
		per.name = "С��";
		per.age =23;
		per.address = "������ʡ��������";
	    per.study();
		per.msg();
		
		
		
		Person zs = new Person();
		zs.name = "��ɽ";
		zs.age = 24;
		zs.address = "������ʡ�������";
		zs.study();
		zs.msg();
		
		
		Person mc = new Person();
		mc.name = "��";
		mc.age = 25;
		mc.address = "����";
		mc.study();
		mc.msg();

	}

}
