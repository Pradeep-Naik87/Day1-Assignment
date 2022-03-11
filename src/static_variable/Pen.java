package static_variable;

public class Pen {
	static double price = 20.0;
	static String color = "red";

	public static void main(String[] args) {
		System.out.println("Pen price is " + price + "$ and the colour is " + color);

		System.out.println("Pen price is " + Pen.price + "$ and the colour is " + Pen.color);
	}

}
