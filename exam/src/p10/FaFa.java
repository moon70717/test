package p10;

public class FaFa {
	public int a=3;
	
	
	FaFa(){
		System.out.println("FaFa 호출됨");
	}
	
	protected void prin() {
		System.out.println("private");
	}
	public void prin(String str) {
		System.out.println("public");
	}
	void prin(String str,String str1) {
		System.out.println("protected");
	}
	void prin(int i) {
		System.out.println("default");
	}
}
