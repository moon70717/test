package ch11;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExam {

	public static void main(String[]args) {
		Object[] obj= {3,6,4,1,2,3,5,7,4,2,2,8};
		Set set=new HashSet();
		
		for(Object oo:obj) {
			set.add(oo);
		}
		System.out.println(set);
		
		Iterator it=set.iterator();// 
		
		while(it.hasNext()) {
			System.out.println((Integer)it.next());
		}
	}
}
