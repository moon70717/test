package p03;

import java.util.Scanner;

public class ObjectExam {
	int num1;
	int num2;

	public ObjectExam() {
		System.out.println("ObjectExam ����");
	}

	void add(int num1, int num2) {
		System.out.println("���� ���� " + (num1 + num2));
	}

	int getNum2(int num2) {
		return num2;
	}

	void inputNums(ObjectExam oe) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ù��° ���ڸ� �Է��� �ּ��� : ");
		oe.num1 = sc.nextInt();
		System.out.println("�ι�° ���ڸ� �Է��� �ּ��� : ");
		oe.num2 = sc.nextInt();
	}

	void printLoop(ObjectExam oe) {
		for (int i = oe.num1; i < oe.num2; i++) {
			System.out.print(i + ",");
		}
		System.out.println(oe.num2);
		System.out.println("���۰�:" + oe.num1);
		System.out.println("���ᰪ:" + oe.num2);
	}

	public static void main(String[] args) {
		
	}
}