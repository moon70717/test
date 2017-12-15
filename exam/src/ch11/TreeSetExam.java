package ch11;

import java.util.Random;
import java.util.TreeSet;

public class TreeSetExam {

	public static void main(String[]args) {
		TreeSet ts=new TreeSet();
		
		for(int i=0;i<5;i++) {
			Random ran=new Random();
			int rand=ran.nextInt(50)+1;
			ts.add(rand);
		}
		System.out.println(ts);// TreeSet은 기본적으로 오름차순으로 출력함
		System.out.println(ts.headSet(30));//이것보다 작은값만 찾을수도있고
		System.out.println(ts.tailSet(20));//이것보다 큰값만 찾을수도 있다
		
		System.out.println(ts.subSet(5, 35));//찾을 범위를 지정함
		System.out.println(ts.subSet(37, 50));//찾을 범위를 지정함
	}
}
