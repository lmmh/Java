package override;

public class OverrideDemo {

	public static void main(String[] args) {
	    Goo goo = new Goo();
	    Eoo o = new Foo();
	    goo.test(o);

	}

}
class Eoo{
	void show(){
		System.out.println("����show");
	}
}
class Foo extends Eoo{
	void show(){
		System.out.println("����show");
	}
}
class Goo{
	void test(Eoo o){
		System.out.println("���Ͳ���");
		o.show();
	};
	void test(Foo o){
		System.out.println("���Ͳ���");
		o.show();
	}
	
}    
