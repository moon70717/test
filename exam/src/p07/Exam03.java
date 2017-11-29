package p07;

import java.util.Scanner;

public class Exam03 {
	int[] num=new int[5];
	public static void main(String[]args) {
		Exam03 ex=new Exam03();
		ex.insertNums();
		ex.checkNums();
		ex.printNums();
	}
	
	void printNums() {
		String str="";
		for(int i=0;i<num.length;i++) {
			str+=num[i]+", ";
		}
		System.out.println(str.substring(0, str.length()-2));
	}
	
	void checkNums() {
		for(int i=0;i<num.length;i++) {
			int temp=0;
			for(int j=i+1;j<num.length;j++) {
				if(num[i]<num[j]) {
					temp=num[i];
					num[i]=num[j];
					num[j]=temp;
				}
			}
		}
	}
	
	void insertNums() {
		Scanner s=new Scanner(System.in);
		
		for(int i=0;i<num.length;i++) {
			num[i]=s.nextInt();
			for(int j=0;j<i;j++) {
				if(num[i]==num[j]) {
					num[i]=0;
					i--;
					System.out.println("중복입니다.");
					continue;
				}
			}
		}
		
	}
}
