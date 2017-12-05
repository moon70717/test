package p11;

import java.util.ArrayList;

public class ListExam3 {
	ArrayList<String> alStr;
	
	ListExam3(){
		alStr=new ArrayList<String>();
	}
	
	public static void main(String[]args) {
		ListExam3 le=new ListExam3();
		System.out.println(le.alStr.size());
	}
}
