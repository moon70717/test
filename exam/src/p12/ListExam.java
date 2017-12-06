package p12;

import java.util.ArrayList;

public class ListExam {
	private ArrayList<String> alStr;
	
	ListExam(){
		alStr=new ArrayList<String>();
	}
	
	
	void add(String str) {
		alStr.add(str);
	}
	
	String get(int id) {
		return alStr.get(id);
	}
	
}
