package ch07;

public class InterfaceExam{
	
	public static void main(String[]args) {
		
	}
	
	
}
interface print{//추상클래스는 부분적으로라도 완성이 되어있는데 인터페이스는 그런거도없음
	//추상클래스와 같이 인터페이스도 그 자체로는 인스턴스 생성불가
	int dama=3;//public static final이 붙어야 하나 생략가능함
	
	public abstract void run();//메소드도 생성가능
}