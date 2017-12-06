package ch10;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatExam {
	
	public static void main(String[]args) {
		Date today=new Date();
		
		SimpleDateFormat sdf1=new SimpleDateFormat("yyyy-mm-dd");
		
		System.out.println(sdf1.format(today));//포멧에 맞춰서 출력이됨
		
	}
}
