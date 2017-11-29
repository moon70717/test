package fighterTest;

public class FighterTest {
	public static void main(String[] args) {
		fighter f = new fighter();

		if (f instanceof unit)
			System.out.println("f는 unit 클래스의 자손입니다");
		if (f instanceof fightable)
			System.out.println("f는 fightable 클래스의 자손입니다");

		if (f instanceof movable)
			System.out.println("f는 movable 클래스의 자손입니다");

		if (f instanceof attackable)
			System.out.println("f는 attackable 클래스의 자손입니다");

		if (f instanceof Object)// 모든것은 결국에는 오브젝트의 자손임
			System.out.println("f는 Object 클래스의 자손입니다");
	}
}

class fighter extends unit implements fightable {// 구현을 해준다
	public void move(int x, int y) {
		System.out.println(x + "+" + y + "로 이동하였습니다");
	}

	public void attack(unit u) {

	}
}

class unit {
	int hp;
	int x;
	int y;
}

interface fightable extends movable, attackable {// movable과 attackable을 한곳에 합치는 부분
}

interface movable {
	void move(int x, int y);
}

interface attackable {
	void attack(unit u);
}