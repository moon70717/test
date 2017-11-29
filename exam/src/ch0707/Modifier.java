package ch0707;

abstract class no {//애 자채로는 아무것도 못함, 또한 인스턴스를 생성하지못함
	void run() {//하지만 상속받아서 오버라이딩을 하거나 인터페이ㅏ스화 하기에는 적절함
		System.out.println("추상클래스 돌아감");
	}
}

public class Modifier extends no{
	static int i = 3;// static을 붙이면 생성자를 만들지 않아도 접근이 가능해짐
	final int max = 3;// final을 붙이면 값을 변경할수 없어짐

	public static void main(String[] args) {
		new Modifier().run();
	}
	
	void run() {
		System.out.println("추상클래스를 상속받았습니다");
	}
}
