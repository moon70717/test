package ch06;

public class OverLoading {
	
	static void over1(int i) {
		System.out.println(i);
	}
	static void over1(int i,int j) {
		System.out.println(i+""+j);
	}
	
	static void over1(String i) {
		System.out.println(i);
	}
	
	/*static void over1(int cc) { 매개변수의 이름은 상관이 없음
		System.out.println(cc);
	}*/
	
	static int over2(int i) {
		return i;
	}
	/*static long over2(int i) {  리턴타입또한 상관이 없음
		return i;
	}*/
	
	public static void main(String[]args) {
		over1(3);
		over1(3,5);//이름이 같아도 매개변수의 개수가 다르면 구분이됨
		over1("매개변수 타입이 달라도 ㄱㅊ");//매개변수의 개수나 타입이 달라야됨
	}
}