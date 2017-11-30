package p08;

import java.util.Random;

public class Lotto {
	int[] lottoNums;
	Random r;
	int lottoTemp;
	int lotooMax;

	public Lotto(int rNumsLength,int lotooMax) {
		lottoNums = new int[rNumsLength];
		r = new Random();
		this.lotooMax=lotooMax;
	}

	void printLotoo() {
		String str = "";
		for (int i = 0; i < lottoNums.length; i++) {
			str += lottoNums[i] + ", ";
		}
		System.out.println("로또 당첨번호 입니다\n" + str.substring(0, str.length() - 2));
	}

	boolean isDupl() {
		for (int i = 0; i < lottoNums.length; i++) {
			if (lottoNums[i] == lottoTemp) {
				return true;
			}
		}
		return false;
	}

	void getLottoNums() {
		for (int i = 0; i < lottoNums.length; i++) {
			lottoTemp = r.nextInt(45) + 1;
			if (isDupl()) {
				i--;
				continue;
			}
			lottoNums[i] = lottoTemp;
		}
	}
	
	public static void main(String[] args) {
		Lotto lt = new Lotto(6,45);
		lt.getLottoNums();
		lt.printLotoo();
	}
}
