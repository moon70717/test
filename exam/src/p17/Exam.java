package p17;

import java.util.ArrayList;
import java.util.List;

public class Exam {

	void ii(int...is) {
		for(int i:is) {
			System.out.println(i);
		}
	}
	
	public static void main(String[]args) {
		
		Exam e=new Exam();
		e.ii(3,4,1,6,3,4,6,2,1,4,5);
		
		List ii=new ArrayList();
	}
}
