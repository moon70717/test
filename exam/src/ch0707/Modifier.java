package ch0707;

abstract class no {//�� ��ä�δ� �ƹ��͵� ����, ���� �ν��Ͻ��� ������������
	void run() {//������ ��ӹ޾Ƽ� �������̵��� �ϰų� �������̤���ȭ �ϱ⿡�� ������
		System.out.println("�߻�Ŭ���� ���ư�");
	}
}

public class Modifier extends no{
	static int i = 3;// static�� ���̸� �����ڸ� ������ �ʾƵ� ������ ��������
	final int max = 3;// final�� ���̸� ���� �����Ҽ� ������

	public static void main(String[] args) {
		new Modifier().run();
	}
	
	void run() {
		System.out.println("�߻�Ŭ������ ��ӹ޾ҽ��ϴ�");
	}
}
