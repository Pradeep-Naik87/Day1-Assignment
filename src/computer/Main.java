package computer;

public class Main {
	public static void main(String[] args) {
		Computer c1 = new Computer("High HD", 254, 5.6, "8GB");
		Computer c2 = new Computer("medium HD", 345, 5.9, "4GB");
		Computer c3 = new Computer("low HD", 100, 6.6, "12GB");

		System.out.println(c1.getComputer());
		System.out.println(c2.getComputer());
		System.out.println(c3.getComputer());
	}

}
