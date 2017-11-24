package p03;

public class GuGuDan {
	public GuGuDan() {
		System.out.println("GuGuDan ½ÇÇà");
	}

	public void printLoop(ObjectExam oe) {
		for (int i = 1; i < oe.num1; i++) {
			for (int j = 1; j < oe.num2; j++) {
				// System.out.printf("%2d * %2d = %2d ||", j, i, (i * j));
				System.out.print("[" + i + ", " + j + "]");
			}
			System.out.println("");
		}
	}

	public static void main(String[] args) {
	}
}
