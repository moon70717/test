package Exam12;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Lotto {
	ArrayList<Integer> seleLotto;
	ArrayList<Integer> lottoNum;
	int mod;
	
	Lotto(){
		seleLotto=new ArrayList<Integer>();
		lottoNum=new ArrayList<Integer>();
		seleMod();
		getRanNum(lottoNum,0);
	}
	
	void seleMod() {
		System.out.println("모드를 설정해주세요\n1.자동 (1입력)\n2.수동 (2입력)\n3.반자동 (3입력)");
		Scanner sc=new Scanner(System.in);
			mod=sc.nextInt();
			
			if(mod==1) {
				System.out.println("자동모드");
				getRanNum(seleLotto,0);
			}else if(mod==2) {
				System.out.println("수동모드");
				inputMyNum();
			}else if(mod==3) {
				System.out.println("반자동모드");
				System.out.println("*을 입력하면 나머지 숫자는 랜덤숫자가 입력됩니다");
				inputMyNum();
			}
	}
	
	void getRanNum(ArrayList<Integer> li, int str) {
		Random rand=new Random();
		int input;
		for(int i=str;i<6;i++) {
			input=rand.nextInt(45)+1;
			if(lottoNum.indexOf(li)==-1) {
				System.out.print((i+1)+"번째 숫자: "+input+"\t");
				li.add(input);
				continue;
			}
			i--;
		}System.out.println();
	}
	
	void inputMyNum() {
		System.out.println("로또번호를 입력하세요");
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<6;i++) {
			String input=sc.nextLine();
			if(input.equals("*")) {
				getRanNum(seleLotto,i);
				break;
			}else {
				int in=Integer.parseInt(input);
				if((in<=45&&in>=1)&&seleLotto.indexOf(in)==-1) {
					seleLotto.add(in);
				}
				else {
					System.out.println("잘못된 범위이거나 중복된 숫자입니다.");
					i--;
				}
			}
		}sc.close();
	}
	
	void checkNum() {
		System.out.println("당신의 숫자");
		for(int i:seleLotto) {
			System.out.print(i+"\t");
		}
		int temp=0;
		for(int i=0;i<6;i++) {
			int num1=seleLotto.get(i);
			for(int j=0;j<6;j++) {
				int num2=lottoNum.get(i);
				if(num1==num2) {
					temp++;
				}
			}
		}
		System.out.println("\n"+temp+"개 맞았습니다.");
	}
	
	public static void main(String[]args) {
		Lotto l=new Lotto();
		l.checkNum();
	}
}
