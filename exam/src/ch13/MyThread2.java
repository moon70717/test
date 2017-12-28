package ch13;

public class MyThread2 {

	public static void main(String[]args) {
		long startTime=System.currentTimeMillis();
		
		for(int i=0;i<100;i++) {
			System.out.printf("%s", new String("-"));
		}
		
		System.out.print("소요시간 1"+(System.currentTimeMillis()-startTime));
		System.out.println("");
		for(int i=0;i<300;i++) {
			System.out.printf("%s", new String("|"));
		}
		System.out.print("소요시간 2"+(System.currentTimeMillis()-startTime));
	}
}
