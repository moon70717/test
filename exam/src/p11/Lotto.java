package p11;

import java.util.Random;
import java.util.Scanner;

public class Lotto {
	int maxNum;
	int minNum;
	int[] lottos;
	int[] joins;
	
	void inputNum() {
		Scanner sc=new Scanner(System.in);
		System.out.println("참여인원을 입력해주세요");
		maxNum=sc.nextInt();
		
		System.out.println("당첨인원을 입력해주세요");
		minNum=sc.nextInt();
		sc.close();
	}
	
	int[] getLottos() {
		return new int[minNum];
	}
	
	int[] getJoins() {
		return new int[maxNum];
	}
	
	
	void select() {
		if(minNum>=maxNum) {
			System.out.println("모두가 당첨되었습니다");
			return;
		}
		Random r=new Random();
		int temp;
		for(int i=0;i<minNum;i++) {
			temp=r.nextInt(maxNum)+1;
			if(dupl(temp,i)) {
				i--;
				continue;
			}
			lottos[i]=temp;
			
		}
	}
	
	boolean dupl(int temp, int m) {
		for(int i=0;i<m;i++) {
			if(lottos[i]==temp) {
				return true;
			}
		}
		return false;
	}
	
	void print() {
		if(minNum<maxNum) {
			System.out.println("당첨인원"+minNum);
			System.out.println("비 당첨인원"+(maxNum-minNum));
			for(int i:lottos) {
				System.out.print(i+"\t");
			}
		}
	}
	
	public static void main(String[]args) {
		Lotto l=new Lotto();
		l.inputNum();
		l.lottos=l.getLottos();
		l.joins=l.getJoins();
		l.select();
		l.print();
	}
}
