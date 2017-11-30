package ch07;

public class InterfaveExam4 {
	
	public static void main(String[]args) {
		
	}
}

interface inter{
	public abstract void methodB();
	default void defaultMethod() {//디폴트 메소드는 인터페이스를 상속받을때 구현할 필요가 없음
		System.out.println("인터페이스 속에 있는 디폴트 메소드!");
	}
}

class getInter implements inter{
	public void methodB() {
		System.out.println("methodB가 getInter클래스에서 실행되었습니다.");
	}
}

class get{
	public static void methodA(getInter get) {
		get.methodB();//getInter에서 직접 받아오는것처럼 보이지만 실제로는 inter인터페이스를 통해서 받아오게됨
	}
}