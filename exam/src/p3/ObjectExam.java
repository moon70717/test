package p3;

import java.util.Scanner;

public class ObjectExam {
	int num1;
	int num2;

	ObjectExam() {
		System.out.println("생성자 호출");
	}

	void add(int num1, int num2) {
		System.out.println("둘의 합은 " + (num1 + num2));
	}

	int getNum2(int num2) {
		return num2;
	}

	void inputNums() {
		Scanner sc = new Scanner(System.in);
		System.out.println("첫번째 숫자를 입력해 주세요 : ");
		num1 = sc.nextInt();
		System.out.println("두번째 숫자를 입력해 주세요 : ");
		num2 = sc.nextInt();
	}

	void printLoop() {
		for (int i = num1; i < num2; i++) {
			System.out.print(i + ",");
		}
		System.out.println(num2);
	}

	public static void main(String[] args) {
		ObjectExam objectExam = new ObjectExam();
		objectExam.inputNums();
		objectExam.printLoop();
	}
}