package ch11;

import java.util.Arrays;
import java.util.List;

public class ArrayExam {

	public static void main(String[]args) {
		int[] arr={1,4,3,2,5,56};
		int[] arr2=Arrays.copyOf(arr, 2);
		int idx=Arrays.binarySearch(arr, 56);
//		System.out.println(idx);
		for(int i:arr2) {
			System.out.print(i+", ");
		}System.out.println();
		
		int[] arr3 =Arrays.copyOfRange(arr, 2, 5);
		List list=Arrays.asList(3,56,1,2,3,5);
		for(int i=0;i<list.size();i++) {
			System.out.print(list.get(i)+", ");
		}System.out.println();
		for(int i:arr3) {
			System.out.print(i+", ");
		}System.out.println();
		
		Arrays.fill(arr, 356);
		for(int i:arr) {
			System.out.print(i+", ");
		}System.out.println();
	}
}
