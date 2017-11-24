package tv;

public class Tv {
	String color;
	boolean power;
	int ch;
	void power() {
		power= !power;
		System.out.println(power==true? "TV를 켰습니다.":"TV를 껐습니다.");
	}
	void color(String color) {
		this.color= color;
		System.out.println(color+"으로 색을 변경하였습니다.");
	}
	void chUp() {
		ch++;
		System.out.println("현재 채널은 "+ch+"입니다.");
	}
	void chDown() {
		ch--;
		System.out.println("현재 채널은 "+ch+"입니다.");
	}
}
