package jp.co.diworks.action;

public class Main {

	public static void main(String[] args) {
		System.out.println("Hello World"); 
		System.out.println(gokei());
		System.out.println(gokei2(2,3));
	}
	
	public static int gokei() {
		return 1 + 1;
	}
	
	public static int gokei2(int number1, int number2) {
		return number1 + number2;
	}
}
