package apple;

import java.util.Scanner;

public class Customer {
	int cMoney=5000;
	int count;
	int gMoney;
	void buy() {
		Scanner sc=new Scanner(System.in);
		System.out.println("��� ���?");
		count=sc.nextInt();
		System.out.println("�󸶸� ����?");
		gMoney=sc.nextInt();
		Apple apple=new Apple();
		apple.sell(gMoney, count);
	}
}
