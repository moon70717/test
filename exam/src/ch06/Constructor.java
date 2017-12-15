package ch06;

public class Constructor {
	int strat;
	
	Constructor(int i){//생성자에 있는것은 생성자가 생성할때 실행됨
		strat=i;//값 선언가능
		System.out.println("Constructor의 생성자가 생성되었습니다"+i);//따로 생성하지 않을시에는 디폴트 생성자가 자동으로 생성됨
	}
	Constructor(){// 애도 오버로딩 가능함
		System.out.println("매개변수가 없는 Constructor가 생성되었습니다");
	}
	public static void main(String[]args) {
		Constructor cons=new Constructor(3);//Constructor의 생성자를 생성함, 값을 보내줄수있음
		Constructor cons2=new Constructor();
	}
	
}