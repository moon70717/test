package ch0707;

class Father {
	int f1 = 11;
	
	Father(String str){
		System.out.println("�θ�Ŭ������ ��ӹ޾ҽ��ϴ�. "+str);
	}
	
	void printl(String a) {
		System.out.println("�θ� Ŭ�����Դϴ�:" + a);
	}
}

public class OverridingExam extends Father {// �θ� Ŭ�������� ��ӹ������� �����ϴ� ����
	static int f1=1;
	
	OverridingExam(){
		//super();// ���� ������ ������ �����Ϸ��� �ڵ����� �߰��ϰԵ�, �θ��� ������
		super("��");//�θ� Ŭ������ �����ڸ� ȣ����
	}
	
	public static void main(String[] args) {
		OverridingExam oe=new OverridingExam();
		oe.printl("gg");
		oe.callFather();
	}

	void callFather() {//�̸��� ���� ������ ������  super�� �̿��Ͽ� �θ�Ŭ������ ������ ����Ҽ�����, this�� ����ϴٰ� �����
		int f1=3;
		System.out.println("f1:"+f1);
		System.out.println("this.f1:"+this.f1);
		System.out.println("super.f1:"+super.f1);//super�� static������ ����Ҽ� ����
	}
	
	void printl(String a) {// �θ�Ŭ������ �ִ� ��Ҹ� �����Ҽ� ����
		System.out.println("�θ� Ŭ������ �������̵��� �ڽ�Ŭ�����Դϴ�:" + a);
	}
}
