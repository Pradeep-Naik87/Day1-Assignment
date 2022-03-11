package hello;

public class Hello {

	void hello(short i) {
		System.out.println("Short Method is running");
	}

	void hello(int i) {
		System.out.println("Integer Method is running");
	}

	void hello(byte i) {
		System.out.println("Byte Method is running");
	}

	void hello(long i) {
		System.out.println("Long Method is running");
	}

	public static void main(String[] args) {
		Hello h = new Hello();
		h.hello(5);

	}
}
