package p15;

public class Exam {
	
	static String str="3";
	public static void main(String[]args) {
		Exam e=new Exam();
		Exam.str="33";
		System.out.println(str);
	}
}
