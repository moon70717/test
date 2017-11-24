package apple;

import java.util.Scanner;

public class Customer {
	int cMoney=5000;
	int count;
	int gMoney;
	void buy() {
		Scanner sc=new Scanner(System.in);
		System.out.println("몇개를 살까?");
		count=sc.nextInt();
		System.out.println("얼마를 낼까?");
		gMoney=sc.nextInt();
		Apple apple=new Apple();
		apple.sell(gMoney, count);
	}
}
