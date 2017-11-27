package ch06;

public class Initialization {
	int i=4;// 기본형 변수를 초기화
	//Initialization in=new Initialization();// 참조형 변수의 초기화
	
	int num1;
	int num2;
	
	static{//클래스 초기화 블럭		
		System.out.println("클래스 초기화 블럭");
	}//클래스가 처음 로딩될때 단 한번 초기화됨
	
	
	{//무조건실행하고 가게됨
		num1=1;//중복되는 코드일시 이 방법으로 초기화시키고 지나갈수있음
		num2=2;
		System.out.println("인스턴스 초기화 블럭");
	}//인스턴스가 생성될때마다 각 인스턴스별로 초기화됨(생성자)

	public static void main(String[] args) {
		System.out.println(new Initialization().num1);
	}
}
