package tv;

public class Tv {
	String color;
	boolean power;
	int ch;
	void power() {
		power= !power;
		System.out.println(power==true? "TV�� �׽��ϴ�.":"TV�� �����ϴ�.");
	}
	void color(String color) {
		this.color= color;
		System.out.println(color+"���� ���� �����Ͽ����ϴ�.");
	}
	void chUp() {
		ch++;
		System.out.println("���� ä���� "+ch+"�Դϴ�.");
	}
	void chDown() {
		ch--;
		System.out.println("���� ä���� "+ch+"�Դϴ�.");
	}
}
