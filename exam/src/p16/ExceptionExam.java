package p16;

import java.util.Scanner;

public class ExceptionExam {

	public void convertAndPerint(String str) throws Exception{
		System.out.println(Integer.parseInt(str));
	}

	public static void main(String[] args) {
		ExceptionExam ee = new ExceptionExam();
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		try {
			ee.convertAndPerint(str);
		} catch (Exception e) {
			System.out.println("숫자가 아닙니다");
			System.out.println("츨력할 숫자를 입력해주세요");
			str=s.nextLine();
			try {
				ee.convertAndPerint(str);
			}catch(Exception e1) {
				System.out.println("숫자가 아닙니다");
			}
		}
	}
}
