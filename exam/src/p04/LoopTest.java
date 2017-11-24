package p04;

import java.util.Scanner;

public class LoopTest {
	int num1 = 0;
	int num2 = 0;

	LoopTest() {
		System.out.println("LoopTest 시작");
	}

	void add(int str, int end) {
		int all = 0;
		int temp = end;
		if (end % 2 != 0) {
			all += end;
			end--;
		}
		for (int i = str; i <= end; i++) {
			all += (i + end);
			end--;
		}
		System.out.println(str + "에서 " + temp + "까지의 합:" + all);
	}

	void print(int num, int end) {
		if (num % 2 == 1) {
			System.out.println("홀수를 출력합니다");
		} else {
			System.out.println("짝수를 출력합니다");
		}

		for (int i = num; i <= end; i += 2) {
			System.out.print(i + ", ");
		}
		System.out.println();
	}

	void numInput() {
		Scanner s = new Scanner(System.in);
		System.out.println("첫번째 숫자를 입력하세요");
		int temp;
		num1 = s.nextInt();
		System.out.println("두번째 숫자를 입력하세요");
		num2 = s.nextInt();
		if (num1 > num2) {
			temp = num1;
			num1 = num2;
			num2 = temp;
		}
	}

	public static void main(String[] args) {
		LoopTest loopTest = new LoopTest();

		loopTest.numInput();
		loopTest.add(loopTest.num1, loopTest.num2);
		loopTest.numInput();
		loopTest.print(loopTest.num1, loopTest.num2);
		loopTest.numInput();
		loopTest.print(loopTest.num1, loopTest.num2);
	}

}
