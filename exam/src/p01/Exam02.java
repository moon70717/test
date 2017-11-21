package p01;

import java.util.Scanner;

public class Exam02 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
//		s.nextLine();
		String str=s.nextLine();
		int result=0;
		if(str.trim().equals("+")) {
			result=a+b;
		}
		System.out.println("result= "+result);
//		System.out.println("a="+a+", b="+b+", str="+str);
	}
}