package ch07;

public class InterfaceExam2 {//fighterTest��Ű�� ����

}

interface movable{
	void move(int x,int y);
}

interface attackable{
	void attack(unit u);
}

interface fightable extends movable, attackable{} //�������̽��� �������̽��κ��͸� ����� �������ִ�
//���� Ŭ������ �޸� ���߻���� �����ϴ�

class fighter implements fightable{//������ �Ͽ� �ϼ��� ����� �Ѵ�
	public void move(int x,int y) {
		System.out.println(x+"+"+y+"�� �̵��Ͽ����ϴ�");
	}
	public void attack(unit u) {
		
	}
}
/*abstract class fighter implements fightable{//�Ϻθ� �����Ҷ��� abstract�� �ٿ� �̿ϼ��� �߻�Ŭ�������� �˷�����Ѵ�
	public void move(int x,int y) {
		System.out.println(x+"+"+y+"�� �̵��Ͽ����ϴ�");
	}
}*/


/*class fighter extends unit implements fightable{//��Ӱ� ������ ���ÿ� �ϴ°͵� �����ϴ�.
 * �������̽��� �̸� �ڿ��� able�� �ٿ� �̰��� �������̽����� �˱� ���� ���ִ°��� ���� 
	public void move(int x,int y) {
		System.out.println(x+"+"+y+"�� �̵��Ͽ����ϴ�");
	}
}*/
class unit{
	
}