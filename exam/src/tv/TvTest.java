package tv;

public class TvTest {
	public static void main(String[] args) {
		Tv t=new Tv();
		
		t.power();
		t.chUp();
		t.chDown();
		t.color("무지개색");
		System.out.println("현재 채널은 "+t.ch+"입니다.");
		t.power();
	}
}
