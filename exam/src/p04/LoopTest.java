package p04;

public class LoopTest {
	void add() {
		int all = 0;
		for (int i = 1; i <= 100; i++) {
			all += i;
		}
		System.out.println("1���� 100������ ��:" + all);
	}

	void one() {
		System.out.println("Ȧ���� ����մϴ�");
		for (int i = 1; i <= 100; i+=2) {
			System.out.print(i + ", ");
		}
		System.out.println();
	}

	void two() {
		System.out.println("¦���� ����մϴ�");
		for (int i = 2; i <= 100; i+=2) {
			System.out.print(i + ", ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		LoopTest lT = new LoopTest();

		lT.add();
		lT.one();
		lT.two();

	}

}
