package ch10;

import java.text.ChoiceFormat;

public class ChoiceFormatExam {

	public static void main(String[]args) {
		double[] limit= {0,60,70,80,90};
		
		String[] grades= {"F","D","C","B","A"};
		
		int[] scores= {100,96,88,77,66,33,80};
		ChoiceFormat form=new ChoiceFormat(limit,grades);//자동으로 기준에 맞춰서 뽑아줌
		
		for(int i:scores) {
			System.out.println(i+":"+form.format(i));
		}System.out.println("========================================");
		
		
		String pattern= "0<F|60#D|70#C|80<B|90#A";
		form=new ChoiceFormat(pattern);// 패턴을 지정하여 뽑게 할수도 있음
		for(int i:scores) {
			System.out.println(i+":"+form.format(i));
		}
	}
}
