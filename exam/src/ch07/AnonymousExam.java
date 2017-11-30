package ch07;

public class AnonymousExam {
	public static void main(String[]args){
		Object iv=new Object() {
			public void mm() {
				System.out.println("아무도 모르게");
			}
		};
	}
}
