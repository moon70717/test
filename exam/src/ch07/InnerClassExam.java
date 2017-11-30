package ch07;

public class InnerClassExam {
	class innerClass1{
//		static int h=3; inner클래스에서는 static변수를 선언할수없다
		int i=3;
		void say() {
			System.out.println("inner클래스에서 불러왔습니다.");
			ssay();// 하지만 inner클래스는 outter클래스에 그냥 접근가능
		}
	}
	
	private class pr{//inner클래스에도 접근제어자를 붙일수 있음
		private int ss;//접근제어자 붙여서 변수선언가능
		
	}
	
	abstract class bb {//inner클래스로 추상클래스를 사용가능
		
	}
	
	public static class stclass{//static도 붙일수 있음
		static int csc=3;  //inner클래스에서 static 변수를 선언할려면 static 클래스내부에서만 가능하다
		final static int cc=4; //final static은 상수이므로 허용된다
	}
	
	public static void main(String[]args) {
		InnerClassExam ic=new InnerClassExam();
//		System.out.println(innerClass1.i); 외부 클래스의 지역변수는 final이 않붙으면 접근이 불가능하다
		System.out.println(stclass.csc);
//		say(); outter클래스는 inner클래스에 그냥 접근할수 없다
	}
	static void ssay() {
		System.out.println("outter클래스에서 말하는중");
	}
}
