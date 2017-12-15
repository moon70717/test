package p12;

import java.util.Scanner;

public class SplitExam {

	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요.\n구분자는 ','입니다");
		String str=sc.nextLine();
		
		String[] strs=str.split(",");
		int temp=0;
		for(int i=0;i<strs.length;i++) {
			System.out.println("strs["+i+"] = "+strs[i]);
			temp+=Integer.parseInt(strs[i]);
		}System.out.println(temp+"");
	}
}
