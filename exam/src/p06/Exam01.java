package p06;

import java.util.Scanner;

public class Exam01 {
	static int[] numarr=new int[5];
	
	public static void main(String[] args) {
		inputNums();
		run();
	}
	
	static void run() {
		for (int i = numarr[0]; i >= numarr[1]; i--) {
			String str = "";
			for (int j = numarr[2]; j >= numarr[3]; j--) {
				if ((i * j) % numarr[4] == 0) {
					str += "["+numarr[4]+"의배수], ";
				}
				else {
					str += "[" + i + "*" + j + "=" + (i * j) + "]" + ", ";
				}
			}
			System.out.println(str.substring(0, str.length() - 2));
		}
	}
	
	static void inputNums() {
		Scanner s=new Scanner(System.in);
		for(int i=0;i<5;i++) {
			System.out.println((i+1)+"번째 숫자를 입력하세요");
			numarr[i]=s.nextInt();
		}
	}
}
