package p12;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class RanArrayList {
	int maxNum;
	int minNum;
	ArrayList<Integer> inteArr;

	RanArrayList() {
		inteArr = new ArrayList<Integer>();
		setNum();
	}

	void setNum() {
		Scanner sc = new Scanner(System.in);
		System.out.println("minNum입력");
		minNum = sc.nextInt();
		System.out.println("maxNum입력");
		maxNum = sc.nextInt();
		sc.close();
	}

	void getNum() {
		Random rand = new Random();
		int temp;
		for (int i = 0; i < maxNum; i++) {
			temp = rand.nextInt(maxNum - minNum) + (minNum + 1);
			if ((maxNum - minNum) / 2 == i) {
				i = maxNum;
			}
			if (temp % 2 == 0 && inteArr.indexOf(temp) == -1) {
				inteArr.add(temp);
				continue;
			}
			i--;
		}
	}

	void printNum() {
		int tmp = 0;
		for (int i : inteArr) {
			tmp++;
			if (tmp % 10 == 0) {
				System.out.println(i + "\t");
				continue;
			}
			System.out.print(i + "\t");
		}
	}

	public static void main(String[] args) {
		RanArrayList ral = new RanArrayList();

		ral.getNum();
		ral.printNum();
	}
}
