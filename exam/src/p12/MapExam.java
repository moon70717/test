package p12;

import java.util.LinkedHashMap;
import java.util.Random;

public class MapExam {
	LinkedHashMap<Integer, String> hash=new LinkedHashMap<Integer, String>();
	
	void add(String str) {
		hash.put(hash.size(),str);
	}
	void add(int i) {
		System.out.println(i);
		hash.put(i,(i+1)+"번째");
	}
	public static void main(String[]args) {
		MapExam me=new MapExam();
		Random r=new Random();
		int temp;
		for(int i=0;i<10;i++) {
			temp=r.nextInt(10);
			if(me.hash.containsKey(temp)) {
				i--;
				continue;
			}
			me.add(temp);
		}
		System.out.println(me.hash);
	}
}
