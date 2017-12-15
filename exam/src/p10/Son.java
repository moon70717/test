package p10;

public class Son extends FaFa{
	private int a=5;
	
	
	Son(){
		System.out.println("Son 호출됨");
	}
	
	public void prin() {
		System.out.println(super.a+"overriding");
	}
	
	public void prin(String str) {
		System.out.println("overriding "+str);
	}
	
	protected void prin(String str, String str2) {
		System.out.println("overriding "+str+" "+str2);
	}
	
	public void prin(int i) {
		System.out.println("overriding "+i);
		super.prin(i);
	}
	public static void main(String[]args) {
		Son so=new Son();
		
		so.prin("str");
		
		FaFa fs=new Son();
		fs.prin(3);
		fs.prin("ss","aa");
	}
	
}


interface run {
	int i=0;
	
	public abstract void runs(int i);
	public static void runs2(int i) {
		System.out.println("이런식으로 넣을수도있음");
	};
}