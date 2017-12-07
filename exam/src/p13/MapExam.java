package p13;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class MapExam {

	public static void main(String[]args) {
		HashMap<String, String> hm=new HashMap<String, String>();
		hm.put("age", 10+"");
		hm.put("name","홍길동");
		ArrayList<HashMap<String, String>> al=new ArrayList<HashMap<String, String>>();
		for(int i=0;i<10;i++) {
			hm=new HashMap<String, String>();
			Random r=new Random();
			String tmp=(r.nextInt(100)+1)+"";
			if(hm.containsValue(tmp)) {
				i--;
			}else {
				hm.put("age",tmp);
				hm.put("name", i+"");
				al.add(hm);
			}
		}
		/*int age1;
		int age2;
		HashMap<String, String> temp=new HashMap<String, String>();
		for(int i=0;i<al.size();i++) {
			age1=Integer.parseInt(al.get(i).get("age"));
			for(int j=0;j<al.size();j++) {
				age2=Integer.parseInt(al.get(j).get("age"));
				
				if(age1>age2) {
					temp=al.get(i);
					al.set(i, al.get(j));
					al.set(j, temp);
				}
			}
		}*/
		ArrayList<HashMap<String, String>> al2=new ArrayList<HashMap<String, String>>();
		int max=0;
		int idx=0;
		for(int i=0;i<al.size();i++) {
			if(max<Integer.parseInt(al.get(i).get("age"))) {
				max=Integer.parseInt(al.get(i).get("age"));
				idx=i;
			}
			if(i==al.size()-1) {
				al2.add(al.get(idx));
				al.remove(idx);
				i=idx=max=0;
			}
		}
		
		for(HashMap<String, String> h:al2) {
			System.out.println(h);
		}System.out.println(al.get(0).get("age"));
	}
}
