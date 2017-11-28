package oop1;

public class FinalDemo {
	public static void main(String[] args) {
	
	}
}
 class Oo{
	 final int a = 5;//声明同时初始化
	 final int b;
	 Oo(){
		 b=5;//构造方法中初始化
	 }
	 void show(){
		 final int c;
		 //a = 55;//final的变量不能被改变
	 }
 }