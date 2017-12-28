package ch13;

public class Thread3_1 extends Thread{
	public void run() {
		for(int i=0;i<300;i++) {
			System.out.printf("%s", new String("|"));
		}
		System.out.print("소요시간2:"+(System.currentTimeMillis()-MyThread3.startTime));
	}
}