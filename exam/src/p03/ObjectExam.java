package p03;

import java.util.Scanner;

public class ObjectExam {
	int num1;
	int num2;

	public ObjectExam() {
		System.out.println("ObjectExam 실행");
	}

	void add(int num1, int num2) {
		System.out.println("둘의 합은 " + (num1 + num2));
	}

	int getNum2(int num2) {
		return num2;
	}

	void inputNums(ObjectExam oe) {
		Scanner sc = new Scanner(System.in);
		System.out.println("첫번째 숫자를 입력해 주세요 : ");
		oe.num1 = sc.nextInt();
		System.out.println("두번째 숫자를 입력해 주세요 : ");
		oe.num2 = sc.nextInt();
	}

	void printLoop(ObjectExam oe) {
		for (int i = oe.num1; i < oe.num2; i++) {
			System.out.print(i + ",");
		}
		System.out.println(oe.num2);
		System.out.println("시작값:" + oe.num1);
		System.out.println("종료값:" + oe.num2);
	}

	public static void main(String[] args) {
		
	}
}