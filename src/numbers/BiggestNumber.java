package numbers;

public class BiggestNumber {
	public static void main(String[] args) {
		int a = 20;
		int b = 30;
		int c = 50;
		System.out.println((a > b && a > c) ? a : (b > a && b > c) ? b : c);
	}

}
