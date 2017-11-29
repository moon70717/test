package ch0707;

class Father {
	int f1 = 11;
	
	Father(String str){
		System.out.println("부모클래스를 상속받았습니다. "+str);
	}
	
	void printl(String a) {
		System.out.println("부모 클래스입니다:" + a);
	}
}

public class OverridingExam extends Father {// 부모 클래스에게 상속받은것을 변경하는 예제
	static int f1=1;
	
	OverridingExam(){
		//super();// 직접 붙이지 않으면 컴파일러가 자동으로 추가하게됨, 부모의 생성자
		super("얍");//부모 클래스의 생성자를 호출함
	}
	
	public static void main(String[] args) {
		OverridingExam oe=new OverridingExam();
		oe.printl("gg");
		oe.callFather();
	}

	void callFather() {//이름이 같은 변수가 있을때  super를 이용하여 부모클래스의 변수를 사용할수있음, this와 비슷하다고 보면됨
		int f1=3;
		System.out.println("f1:"+f1);
		System.out.println("this.f1:"+this.f1);
		System.out.println("super.f1:"+super.f1);//super는 static에서는 사용할수 없음
	}
	
	void printl(String a) {// 부모클래스에 있는 요소를 수정할수 있음
		System.out.println("부모 클래스를 오버라이딩한 자식클래스입니다:" + a);
	}
}
