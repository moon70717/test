package p14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Cal {

	ArrayList<Integer> result;
	int num1;
	int num2;
	String calc;

	Cal() {
		result = new ArrayList<Integer>();

	}

	void inputNum() {
		Scanner s = new Scanner(System.in);
		System.out.println("첫번째 수를 입력하세요");
		num1 = s.nextInt();
		System.out.println("두번째 수를 입력하세요");
		num2 = s.nextInt();
		s.nextLine();
		System.out.println("연산자 하나를 입력하세요");
		calc = s.nextLine();
		if(num1<num2) {
			int temp=num1;
			num1=num2;
			num2=temp;
		}
	}

	void selecMod() {
		if (calc.equals("+")) {
			result.add(plus());
		}
		else if (calc.equals("-")) {
			result.add(minus());
		}
		else if (calc.equals("*")) {
			result.add(multiply());
		}
		else if (calc.equals("/")) {
			result.add(division());
		}
		else {
			System.out.println("잘못된 입력입니다");
		}
	}

	int plus() {
		return num1 + num2;
	}

	int minus() {
		return num1 - num2;
	}

	int multiply() {
		return num1 * num2;
	}

	int division() {
		return num1 / num2;
	}

	void sortList() {
/*		Integer tempp;
		int r1;
		int r2;
		for (int i = 0; i < result.size(); i++) {
			r1 = result.get(i);

			for (int j = 0; j < result.size(); j++) {
				r2 = result.get(j);

				if (r1 > r2) {
					tempp = result.get(i);
					result.set(i, r2);
					result.set(j, tempp);
				}
			}
		}*/
		
		Collections.reverse(result);
	}

	public static void main(String[] args) {
		Cal c = new Cal();
		
		for(int i=0;i<4;i++) {
			c.inputNum();
			c.selecMod();
		}
		
		c.sortList();
		
		System.out.println(c.result);
	}
}
