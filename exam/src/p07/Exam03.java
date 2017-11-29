package p07;

import java.util.Scanner;

public class Exam03 {
	int[] num = new int[5];
	static int set;

	public static void main(String[] args) {
		Exam03 ex = new Exam03();

		ex.insertNums();
		ex.checkNums();
		ex.printNums();
	}

	void printNums() {
		String str = "";
		for (int i = 0; i < num.length; i++) {
			if (set % 2 == 1)
				str += num[num.length-1 - i] + ", ";
			else
				str += num[i] + ", ";
		}
		System.out.println(str.substring(0, str.length() - 2));
	}

	void checkNums() {
		for (int i = 0; i < num.length; i++) {
			int temp = 0;
			for (int j = i + 1; j < num.length; j++) {
				if (num[i] < num[j]) {
					temp = num[i];
					num[i] = num[j];
					num[j] = temp;
				}
			}
		}
	}

	void insertNums() {
		Scanner s = new Scanner(System.in);

		for (int i = 0; i < num.length; i++) {
			num[i] = s.nextInt();
			for (int j = 0; j < i; j++) {
				if (num[i] == num[j]) {
					num[i] = 0;
					i--;
					System.out.println("중복입니다.");
					continue;
				}
			}
		}
		System.out.println("오름차순 내림차순 여부를 확인합니다 (홀수: 오름차순||짝수: 내림차순)");
		set = s.nextInt();
	}
}
