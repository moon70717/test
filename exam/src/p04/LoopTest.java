package p04;

import java.util.Scanner;

public class LoopTest {
	int num1 = 0;
	int num2 = 0;

	LoopTest() {
		System.out.println("LoopTest ����");
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
		System.out.println(str + "���� " + temp + "������ ��:" + all);
	}

	void print(int num, int end) {
		if (num % 2 == 1) {
			System.out.println("Ȧ���� ����մϴ�");
		} else {
			System.out.println("¦���� ����մϴ�");
		}

		for (int i = num; i <= end; i += 2) {
			System.out.print(i + ", ");
		}
		System.out.println();
	}

	void numInput() {
		Scanner s = new Scanner(System.in);
		System.out.println("ù��° ���ڸ� �Է��ϼ���");
		int temp;
		num1 = s.nextInt();
		System.out.println("�ι�° ���ڸ� �Է��ϼ���");
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
