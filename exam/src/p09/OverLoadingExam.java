package p09;

public class OverLoadingExam {
	
	void a(int a) {
		
	}
	int a() {
		return 0;
	}
	public static void maim(String[]args) {
		OverLoadingExam oe=new OverLoadingExam();
		
		System.out.println("오버로딩");
	}
}
