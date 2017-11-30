package p08;

import java.util.Random;

public class Lotto {
	int[] rNums = new int[6];

	public static void main(String[] args) {
		Lotto lt = new Lotto();
		lt.getRan();
		lt.printRan();
		
	}
	
	void printRan() {
		String str = "";
		for (int i = 0; i < rNums.length; i++) {
			str += rNums[i] + ", ";
		}
		System.out.println("로또 당첨번호 입니다\n" + str.substring(0, str.length() - 2));
	}
	
	boolean checkRan(int ran, int max) {
		for(int i=0;i<max;i++) {
			if(rNums[i]==ran) {
				return true;
			}
		}
		return false;
	}
	
	void getRan() {
		Random r = new Random();
		int ran;
		for (int i = 0; i < rNums.length; i++) {
			ran=r.nextInt(45) + 1;
			
			if(checkRan(ran, i)) {
				i--;
				continue;
			}
			rNums[i] = ran;
		}
	}
	
}
