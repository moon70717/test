package p04;

import java.util.Scanner;

public class LoopTest {
	int num1 = 0;
	int num2 = 0;

	LoopTest() {
		System.out.println("<LoopTest ����>");
	}

	void add() {
		numInput();
		int all = 0;
		int temp = num2;
		if (num2 % 2 != 0) {
			all += num2;
			num2--;
		}
		for (int i = num1; i <= num2; i++) {
			all += (i + num2);
			num2--;
		}
		System.out.println(num1 + "���� " + temp + "������ ��:" + all);
	}

	void print() {
		numInput();
		if (num1 % 2 == 1) {
			System.out.println("Ȧ���� ����մϴ�");
		} else {
			System.out.println("¦���� ����մϴ�");
		}

		for (int i = num1; i <= num2; i += 2) {
			System.out.print(i + ", ");
		}
		System.out.println();
	}

	void fuc(int num1, int num2, int num3) {
		for (int i = num1; i <= num2; i++) {
			if (i % num3 == 0) {
				System.out.print(i + ", ");
			}
			if (i % 10 == 0) {
				System.out.println();
			}
		}
	}

	void numInput() {
		Scanner s = new Scanner(System.in);
		System.out.println("ù��° ���ڸ� �Է��ϼ���");
		num1 = s.nextInt();
		System.out.println("�ι�° ���ڸ� �Է��ϼ���");
		num2 = s.nextInt();
		if (num1 > num2) {
			int temp = num1;
			num1 = num2;
			num2 = temp;
		}
	}

	public static void main(String[] args) {
		LoopTest loopTest = new LoopTest();

		loopTest.fuc(1, 100, 3);

		loopTest.add();
		loopTest.print();
		loopTest.print();
	}

}
