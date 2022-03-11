package methodoverloading;

public class Main {

	public static void main(String[] args) {
		MethodOverload m = new MethodOverload();
		int s1 = m.add(10, 20);
		double s2 = m.add(10.5, 6);
		double s3 = m.add(6, 10.5);
		double s4 = m.add(8, 7, 6);

		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);

	}

}
