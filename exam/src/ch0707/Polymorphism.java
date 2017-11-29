package ch0707;

class Father3{
	void run() {
		System.out.println("Father3입니다");
	}
}

public class Polymorphism extends Father3{
	public static void main(String[]args) {
		new hoi().hohoi();
	}
	void run() {
		System.out.println("Father3을 상속받은 Polymorphism입니다");
	}
}

class hoi{
	void hohoi() {
		Father3 f3=new Polymorphism();//부모의 참조변수로 자식타입의 인스타입을 참조할수있다
		f3.run();
		
		//Polymorphism poly=new Father3();  하지만 그 반대로 형변환을 시도하면 않됨
		//기본적으로 부모가 사용할수있는 맴버 갯수보다 자식이 사용가능한 갯수가 더 많기에 에러가 나옴
		//즉 형변환을 할려면 참조변수가 사용할수있는 맴버의 갯수는 인스턴스의 맴버개수보다 같거나 적어야함
	}
}
