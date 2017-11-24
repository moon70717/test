package p04;

public class LoopTest {
	void add() {
		int all = 0;
		for (int i = 1; i <= 100; i++) {
			all += i;
		}
		System.out.println("1에서 100까지의 합:" + all);
	}

	void one() {
		System.out.println("홀수를 출력합니다");
		for (int i = 1; i <= 100; i+=2) {
			System.out.print(i + ", ");
		}
		System.out.println();
	}

	void two() {
		System.out.println("짝수를 출력합니다");
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
