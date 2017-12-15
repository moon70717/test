package p12;

import java.util.ArrayList;
import java.util.Scanner;

public class ListExam {
	private ArrayList<String> alStr;
	
	ListExam(){
		alStr=new ArrayList<String>();
	}
	
	
	void add(String str) {
		if(alStr.isEmpty()) {
			System.out.println("처음 값을 입력하셨군요!");
		}
		else {
			System.out.println("전에 넣은 값: "+alStr.get((alStr.size()-1)));
			System.out.println("현재 값:"+str);
		}
		alStr.add(str+"");
	}
	
	String get(int id) {
		return alStr.get(id)+"";
	}
	
	void remove(int id) {
		alStr.remove(id);
	}
	
	void inputAlStr() {
		Scanner sc=new Scanner(System.in);
		System.out.println("숫자 스트링을 넣어주세요 구분자는 ,입니다");
		String str=sc.nextLine();
		String[] strs=str.split(",");
		for(String ss:strs) {
			add(ss);
		}
		sc.close();
	}
	
	int size() {
		return alStr.size();
	}
	
	void split() {
	}
	
	void printAlStr() {
		int temp=0;
		for(String str:alStr) {
			System.out.print((temp++)+"번째 인덱스 "+str+"\t");
		}
	}
	
	void printAlStr2() {
		for(int i=0;i<alStr.size();i++) {
			
		}
	}
}
