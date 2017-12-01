package p09;

public class Son extends FaFa{
	public Son() {
		
	}
	
	public static void main(String[]args) {
		Son s=new Son();
		System.out.println(s.a);
		s.print();
	}
	
	public void print() {
		System.out.println("Son에서 상속받았습니다");
	}
}
