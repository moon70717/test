package p11;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ListExam {
	ArrayList<Integer> al=new ArrayList<Integer>();
	int getNum;
	int people;
	
	void inputNum() {
		Scanner sc=new Scanner(System.in);
		System.out.println("참여인원을 입력해주세요");
		people=sc.nextInt();
		
		System.out.println("당첨인원을 입력해주세요");
		getNum=sc.nextInt();
		sc.close();
	}
	
	void select() {
		if(getNum>=people) {
			System.out.println("모두가 당첨되었습니다");
			return;
		}
		Random r=new Random();
		int temp;
		for(int i=0;i<getNum;i++) {
			temp=r.nextInt(people)+1;
			if(al.indexOf(temp)==-1) {
				al.add(temp);
				continue;
			}
			i--;
		}
	}
	
	void print() {
		if(getNum<people) {
			for(Integer i:al) {
				System.out.print(i+"\t");
			}
		}
	}
	
	public static void main(String[]args) {
		ListExam lE=new ListExam();
		
		lE.inputNum();
		lE.select();
		lE.print();
	}
}