package ch13;

public class MyThread3 {
	static long startTime = 0;

	public static void main(String[] args) {
		Thread3_1 th1 = new Thread3_1();
		th1.start();
		startTime = System.currentTimeMillis();

		for (int i = 0; i < 300; i++) {
			System.out.printf("%s", new String("-"));
		}
		System.out.print("소요시간1:" + (System.currentTimeMillis() - MyThread3.startTime));
	}
}