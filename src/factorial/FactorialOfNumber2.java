package factorial;

public class FactorialOfNumber2 {
	public static void main(String[] args) {
		int a = 4;
		int fact = 1;
		int i = 1;
		while (i <= a) {
			fact = fact * i;
			i++;
		}
		System.out.println(fact);
	}

}
