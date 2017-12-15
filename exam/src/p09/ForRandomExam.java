package p09;

import java.util.Arrays;
import java.util.Random;

public class ForRandomExam {
	int[][] numArr = new int[3][3];
	int ran;

	public static void main(String[] args) {
		ForRandomExam fr = new ForRandomExam();
		fr.input();
		fr.sortNum();
		fr.print();
	}
	
	int setNum() {
		int temp=0;
		for(int i=0;i<numArr.length;i++) {
			temp+=numArr[i].length;
		}
		return temp;
	}
	
	void sortNum() {
		int[] tempNum = new int[setNum()];
		int temp = 0;
		for (int i = 0; i < numArr.length; i++) {
			for (int j = 0; j < numArr[i].length; j++) {
				tempNum[temp++] = numArr[i][j];
			}
		}
		Arrays.sort(tempNum);
		temp = 0;
		for (int i = 0; i < numArr.length; i++) {
			for (int j = 0; j < numArr.length; j++) {
				numArr[i][j] = tempNum[temp++];
			}
		}
	}

	void print() {
		for (int i = 0; i < numArr.length; i++) {
			String str = "";
			for (int j = 0; j < numArr[i].length; j++) {
				str += numArr[i][j] + "\t";
			}
			System.out.println(str);
		}
	}

	boolean dupl() {
		for (int i = 0; i < numArr.length; i++) {
			for (int j = 0; j < numArr[i].length; j++) {
				if (numArr[i][j] == ran) {
					return true;
				}
			}
		}
		return false;
	}

	void input() {
		Random r = new Random();
		for (int i = 0; i < numArr.length; i++) {
			for (int j = 0; j < numArr[i].length; j++) {
				ran = r.nextInt(20) + 1;
				if (dupl()) {
					j--;
					System.out.println("중복입니다");
				}
				else {
					numArr[i][j] = ran;
				}
			}
		}
	}
}

