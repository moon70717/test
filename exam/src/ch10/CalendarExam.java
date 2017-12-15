package ch10;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class CalendarExam {
	
	public static void main(String[]args) {
		Calendar cal=new GregorianCalendar();//Calendar는 추상 클래스이므로 인스턴스를 생성할수 없음
		//그러므로 Calendar 를 상속받아 구현한 GregorianCalendar를 통해 인스턴스를 반환받게함
		
		Calendar cal2= Calendar.getInstance();//아니면 이런식으로 인스턴스를 받아오도록함
		
		Date d=new Date(cal2.getTimeInMillis()); //Calendar를 Date로 변환함
		cal2.setTime(d);// Date를 Calendar로 변환
		
		System.out.println("년: "+cal2.get(Calendar.YEAR));
		System.out.println("월: "+cal2.get(Calendar.MONTH));//0~11로 표기됨 주의
	}
}
