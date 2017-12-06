package p12;

import java.util.ArrayList;
import java.util.Scanner;

public class ListExam2 {
	ArrayList<String> stringList;

	ListExam2(){
		stringList=new ArrayList<String>();
		inputNums();
	}
	
	void inputNums() {
		Scanner sc=new Scanner(System.in);
		System.out.println("숫자를 입력하세요.\n구분자는 ','입니다");
		String str=sc.nextLine();
		if(str.endsWith(",")!=true) {
			str+=",";
		}
		char[] c=str.toCharArray();
		String temp="";
		for(int i=0;i<str.length();i++) {
			if(c[i]==',') {
				if(dupl(temp)) {
					temp="";
					continue;
				}
				stringList.add(temp);
				temp="";
			}else {
				temp+=c[i];
			}
		}
	}

	boolean dupl(String temp) {
		for(int i=0;i<stringList.size();i++) {
			if(Integer.parseInt(stringList.get(i))==Integer.parseInt(temp)) {
				System.out.println(temp+"는 중복된 숫자입니다");
				return true;
			}
		}
		return false;
	}
	
	void print() {
		for(String s:stringList) {
			System.out.print(s+"\t");
		}System.out.println();
	}
	
	void edit() {
		for(int i=0;i<stringList.size();i++) {
			if(Integer.parseInt(stringList.get(i))%2==1) {
				stringList.remove(i);
			}
		}
		
	}
	
	public static void main(String[] args) {
		ListExam2 le=new ListExam2();
	
		le.edit();
		le.print();
	}
}
