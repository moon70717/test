package p11;

import java.util.ArrayList;
import java.util.HashMap;

public class ListExam3 {
	ArrayList<String> alStr;
	
	ListExam3(){
		alStr=new ArrayList<String>();
	}
	
	public static void main(String[]args) {
		ListExam3 le=new ListExam3();
		System.out.println(le.alStr.size());
		HashMap<String, Integer> hash=new HashMap<String, Integer>();
		hash.put("sfaf", 35);
		System.out.println(hash.get("sfaf"));
	}
}
