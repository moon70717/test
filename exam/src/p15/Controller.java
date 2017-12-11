package p15;

public class Controller extends Server{

	public void print() {
		super.print();
		System.out.println("컨트롤도 담당합니다");
	}
	public void print(int i) {
		super.print();
		System.out.println("그리고 숫자도 출력합니다"+i);
	}
}
