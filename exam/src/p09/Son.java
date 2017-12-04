package p09;

public class Son extends FaFa{
	public Son() {
		super("");
	}
	
	public static void main(String[]args) {
		Son s=new Son();
		FaFa f=new Son();
		
		System.out.println(f.a);
		s.print();
		
	}
	
	public void print() {
		System.out.println("Son에서  변경되었습니다");
	}
	
	void print(String str,String str2) {
		System.out.println(str+", "+str2);
	} 
	
	protected void print(String str) {
		System.out.println(str);
	}
}
