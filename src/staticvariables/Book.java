package staticvariables;

public class Book {
	static int totalPiece = 8;
	static int price = 30;

	public void bookDetails() {
		int totalPrice = totalPiece * price;
		System.out.println("total price is " + totalPrice);
	}

	public static void main(String[] args) {
		Book b = new Book();
		b.bookDetails();

	}

}
