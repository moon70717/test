package ch10;

import java.util.Calendar;

public class CalendarExam2 {

	public static void main(String[] args) {
		int year = 2017;
		int month = 11;
		int startDayOfWeek = 0;
		int endDay = 0;

		Calendar sDay = Calendar.getInstance();
		Calendar eDay = Calendar.getInstance();

		sDay.set(year, month - 1, 1);
		eDay.set(year, month, 1);
		
		eDay.add(Calendar.DATE, -1);
		
		startDayOfWeek=sDay.get(Calendar.DAY_OF_WEEK);
		
		endDay=eDay.get(Calendar.DATE);
			
		System.out.println("\t\t\t"+year+"년"+month+"월");
		System.out.println("\tSU\tMO\tTU\tWE\tTH\tFR\tSA");
		
		for(int i=1;i<startDayOfWeek;i++) {
			System.out.print("\t");
		}
		
		for(int i=1,n=startDayOfWeek;i<=endDay;i++,n++) {
			System.out.print((i<10)?"\t"+i:"\t"+i);
			if(n%7==0) {
				System.out.println();
			}
		}
	}
}
