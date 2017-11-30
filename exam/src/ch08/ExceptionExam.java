package ch08;

public class ExceptionExam {
	public static void main(String[] args) {
		try {
			int[] arr = new int[2];
			arr[3]=2;
			int a = 0;
			a /= 0;
			System.out.println("afs");// 에러가 떠서 catch로가면 뒤에것은 실행되지않음
		} catch (ArithmeticException e) {
			System.out.println("ArithmeticException e");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException e");
		}
	}
}
