package ch11;

import java.util.Arrays;
import java.util.Comparator;

public class ComparatorExam {

	public static void main(String[]args) {
		String[] arr= {"홍길동","김길동","황길동"};
		
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		
		Arrays.sort(arr, new Descending());// 내가 만든 조건으로 정렬하게 만듬
		System.out.println(Arrays.toString(arr));
	}
}


class Descending implements Comparator{// 이조건으로 정렬하게함

	@Override
	public int compare(Object o1, Object o2) {
		if(o1 instanceof Comparable && o2 instanceof Comparable) {
			Comparable c1= (Comparable)o1;
			Comparable c2= (Comparable)o2;
			
			return c1.compareTo(c2)* -1;
		}
		return -1;
	}
	
}