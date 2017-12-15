package p08;

import java.util.Random;

public class Lotto {
	private int[] lottoNums;
	private Random r;
	private int lottoTemp;
	private int lotooMax;
	private int[] checkLottoNums;

	public Lotto() {
		this(6, 45);
	}

	public Lotto(int rNumsLength, int lotooMax) {
		lottoNums = new int[rNumsLength];
		r = new Random();
		this.lotooMax = lotooMax;
	}

	void printLotoo() {
		String str = "";
		for (int i = 0; i < lottoNums.length; i++) {
			str += lottoNums[i] + ", ";
		}
		System.out.println("로또 당첨번호 입니다\n" + str.substring(0, str.length() - 2));
	}

	private boolean isDupl() {
		for (int i = 0; i < lottoNums.length; i++) {
			if (lottoNums[i] == lottoTemp) {
				return true;
			}
		}
		return false;
	}

	void getLottoNums() {
		for (int i = 0; i < lottoNums.length; i++) {
			lottoTemp = r.nextInt(lotooMax) + 1;
			if (isDupl()) {
				i--;
				continue;
			}
			lottoNums[i] = lottoTemp;
		}
	}

	void setCheckLottoNums(int[] checkLottoNums) {
		this.checkLottoNums = checkLottoNums;

		String str = "";
		for (int i = 0; i < this.checkLottoNums.length; i++) {
			str += this.checkLottoNums[i] + ", ";
		}
		System.out.println("당신의 숫자\n" + str.substring(0, str.length() - 2));
	}

	void checkLottoNums() {
		int cnt = 0;
		for (int i = 0; i < lottoNums.length; i++) {
			for (int j = 0; j < lottoNums.length; j++) {
				if (checkLottoNums[i] == lottoNums[j]) {
					cnt++;
					System.out.println(checkLottoNums[i] + "==" + lottoNums[j] + ":" + (checkLottoNums[i] == lottoNums[j]));
				}
			}
		}
		System.out.println(cnt + "개 맞았습니다");
	}

	public static void main(String[] args) {
		Lotto lt = new Lotto(6, 45);
		lt.getLottoNums();
		lt.printLotoo();

		int[] nums = { 10, 15, 23, 4, 24, 33 };
		lt.setCheckLottoNums(nums);
		lt.checkLottoNums();
	}
}
