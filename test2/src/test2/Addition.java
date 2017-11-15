package test2;
//9+99+999+9999+....+9999999999;
public class Addition {

	public static void main(String[] args) {
		long sum =0;
		long num =0;
		for(int i=0; i<10; i++){
			num = num*10+9;
			sum+=num;
		}
		System.out.println("sum:"+sum);
	}

}
