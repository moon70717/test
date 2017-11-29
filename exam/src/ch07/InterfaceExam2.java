package ch07;

public class InterfaceExam2 {//fighterTest패키지 참조

}

interface movable{
	void move(int x,int y);
}

interface attackable{
	void attack(unit u);
}

interface fightable extends movable, attackable{} //인터페이스는 인터페이스로부터만 상속을 받을수있다
//또한 클래스와 달리 다중상속이 가능하다

class fighter implements fightable{//구현을 하여 완성을 해줘야 한다
	public void move(int x,int y) {
		System.out.println(x+"+"+y+"로 이동하였습니다");
	}
	public void attack(unit u) {
		
	}
}
/*abstract class fighter implements fightable{//일부만 구현할때는 abstract를 붙여 미완성된 추상클래스임을 알려줘야한다
	public void move(int x,int y) {
		System.out.println(x+"+"+y+"로 이동하였습니다");
	}
}*/


/*class fighter extends unit implements fightable{//상속과 구현을 동시에 하는것도 가능하다.
 * 인터페이스의 이름 뒤에는 able을 붙여 이것이 인터페이스임을 알기 쉽게 해주는것이 좋다 
	public void move(int x,int y) {
		System.out.println(x+"+"+y+"로 이동하였습니다");
	}
}*/
class unit{
	
}