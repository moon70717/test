package ch06;

public class Initialization {
	int i=4;// �⺻�� ������ �ʱ�ȭ
	//Initialization in=new Initialization();// ������ ������ �ʱ�ȭ
	
	int num1;
	int num2;
	
	static{//Ŭ���� �ʱ�ȭ ��		
		System.out.println("Ŭ���� �ʱ�ȭ ��");
	}//Ŭ������ ó�� �ε��ɶ� �� �ѹ� �ʱ�ȭ��
	
	
	{//�����ǽ����ϰ� ���Ե�
		num1=1;//�ߺ��Ǵ� �ڵ��Ͻ� �� ������� �ʱ�ȭ��Ű�� ������������
		num2=2;
		System.out.println("�ν��Ͻ� �ʱ�ȭ ��");
	}//�ν��Ͻ��� �����ɶ����� �� �ν��Ͻ����� �ʱ�ȭ��(������)

	public static void main(String[] args) {
		System.out.println(new Initialization().num1);
	}
}
