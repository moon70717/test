package Exam171213;

import java.util.Scanner;

public class Sort {

	public static void main(String[]args) {
		String[] ss=new String[5];
		Scanner scan=new Scanner(System.in);
		
		for(int i=0;i<ss.length;i++) {
			System.out.println(i+"번 학생의 점수를 입력해주세요");
			ss[i]=scan.nextLine();
		}
		
		for(int i=0;i<ss.length;i++) {
			for(int j=i+1;j<ss.length;j++) {
				if(Integer.parseInt(ss[i])>Integer.parseInt(ss[j])) {
					String temp=ss[i];
					ss[i]=ss[j];
					ss[j]=temp;
				}
			}
		}
		for(String s:ss) {
			System.out.println(s);
		}
	}
}


