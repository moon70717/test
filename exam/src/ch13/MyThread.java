package ch13;

public class MyThread {

	public static void main(String[]args) {
		Thread1 t1=new Thread1();
		Thread2 t2=new Thread2();
		
		Runnable r=new Thread2();
		Thread tt=new Thread(r);
		
		t1.start();
		tt.start();
	}
}
class Thread1 extends Thread{
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.print(getName());
		}
	}
}
class Thread2 implements Runnable{

	@Override
	public void run() {
		System.out.print(Thread.currentThread().getName()+"runnable");
		
	}
	
}
