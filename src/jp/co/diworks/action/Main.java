package jp.co.diworks.action;

public class Main {

	public static void main(String[] args) {
		System.out.println("Hello World"); 
		System.out.println(gokei());
		System.out.println(gokei2(5,7));
		System.out.println(circle(5));
	}
	
	public static int gokei() {
		return 1 + 1;
	}
	
	public static int gokei2(int number1, int number2) {
		return number1 + number2;
	}
	
	public static double circle(int hankei) {
		return hankei*hankei*3.14;
	}
}
