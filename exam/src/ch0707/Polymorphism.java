package ch0707;

class Father3{
	void run() {
		System.out.println("Father3�Դϴ�");
	}
}

public class Polymorphism extends Father3{
	public static void main(String[]args) {
		new hoi().hohoi();
	}
	void run() {
		System.out.println("Father3�� ��ӹ��� Polymorphism�Դϴ�");
	}
}

class hoi{
	void hohoi() {
		Father3 f3=new Polymorphism();//�θ��� ���������� �ڽ�Ÿ���� �ν�Ÿ���� �����Ҽ��ִ�
		f3.run();
		
		//Polymorphism poly=new Father3();  ������ �� �ݴ�� ����ȯ�� �õ��ϸ� �ʵ�
		//�⺻������ �θ� ����Ҽ��ִ� �ɹ� �������� �ڽ��� ��밡���� ������ �� ���⿡ ������ ����
		//�� ����ȯ�� �ҷ��� ���������� ����Ҽ��ִ� �ɹ��� ������ �ν��Ͻ��� �ɹ��������� ���ų� �������
	}
}
