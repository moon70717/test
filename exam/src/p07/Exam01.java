package p07;

import java.util.Scanner;

public class Exam01 {
	static int[] numarr = new int[5];

	public static void main(String[] args) {
		inputNums();
		run();
	}

	static void run() {
		int temp=0;
		for (int i = numarr[0]; i >= numarr[1]; i--) {
			String str = "";
			for (int j = numarr[2]; j >= numarr[3]; j--) {
				if ((i * j) % numarr[4] == 0) {
					str += "[" + numarr[4] + "�ǹ��], ";
					temp++;
				}
				else {
					str += "[" + i + "*" + j + "=" + (i * j) + "]" + ", ";
				}
			}
			System.out.println(str.substring(0, str.length() - 2));
		}
		System.out.println(numarr[4]+"�� ����� "+temp+"�� ���Խ��ϴ�");
	}

	static void inputNums() {
		Scanner s = new Scanner(System.in);
		for (int i = 0; i < 5; i++) {
			System.out.println((i + 1) + "��° ���ڸ� �Է��ϼ���");
			numarr[i] = s.nextInt();
		}
	}
}
