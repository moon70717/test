package p09;

import java.util.Random;

public class ForExam {

	public static void main(String[] args) {
		int[][] nums = new int[3][];
		nums[0] = new int[3];
		nums[1] = new int[4];
		nums[2] = new int[2];
		
		Random ra=new Random();
		
		int num = 1;
		for (int i = 0; i < nums.length; i++) {
			if(i!=0) {
				num+=nums[i-1].length;
			}
			for (int j = 0; j < nums[i].length; j++) {
				nums[i][j] = j+num;
			}
		}
		String str="";
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums[i].length; j++) {
				str+=nums[i][j]+"\t";
			}
			str=str+"\n";
		}System.out.println(str);
		
		String ss="hello.www";
		
		System.out.println(ss.indexOf('.'));
		
	}
}
