package tv;

public class TvTest {
	public static void main(String[] args) {
		Tv t=new Tv();
		
		t.power();
		t.chUp();
		t.chDown();
		t.color("��������");
		System.out.println("���� ä���� "+t.ch+"�Դϴ�.");
		t.power();
	}
}
