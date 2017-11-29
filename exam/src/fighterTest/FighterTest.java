package fighterTest;

public class FighterTest {
	public static void main(String[] args) {
		fighter f = new fighter();

		if (f instanceof unit)
			System.out.println("f�� unit Ŭ������ �ڼ��Դϴ�");
		if (f instanceof fightable)
			System.out.println("f�� fightable Ŭ������ �ڼ��Դϴ�");

		if (f instanceof movable)
			System.out.println("f�� movable Ŭ������ �ڼ��Դϴ�");

		if (f instanceof attackable)
			System.out.println("f�� attackable Ŭ������ �ڼ��Դϴ�");

		if (f instanceof Object)// ������ �ᱹ���� ������Ʈ�� �ڼ���
			System.out.println("f�� Object Ŭ������ �ڼ��Դϴ�");
	}
}

class fighter extends unit implements fightable {// ������ ���ش�
	public void move(int x, int y) {
		System.out.println(x + "+" + y + "�� �̵��Ͽ����ϴ�");
	}

	public void attack(unit u) {

	}
}

class unit {
	int hp;
	int x;
	int y;
}

interface fightable extends movable, attackable {// movable�� attackable�� �Ѱ��� ��ġ�� �κ�
}

interface movable {
	void move(int x, int y);
}

interface attackable {
	void attack(unit u);
}