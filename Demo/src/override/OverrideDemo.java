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
		System.out.println("父类show");
	}
}
class Foo extends Eoo{
	void show(){
		System.out.println("子类show");
	}
}
class Goo{
	void test(Eoo o){
		System.out.println("父型参数");
		o.show();
	};
	void test(Foo o){
		System.out.println("子型参数");
		o.show();
	}
	
}    
