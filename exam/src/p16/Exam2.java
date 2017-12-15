package p16;

public final class Exam2 {

	final int a;

	Exam2(int i) {
		a = i;
	}

	Exam2() {
		a = 3;
	}

	final void ss() {

	}

	public static void main(String[] args) {
		System.out.println(new Exam2(4).a);
	}
}