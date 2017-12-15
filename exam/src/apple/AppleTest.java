package apple;

public class AppleTest {
	public static void main(String[] args) {
		Apple apple = new Apple();
		Customer cus = new Customer();

		while (true) {
			apple.say();
			cus.buy();
		}

	}
}
