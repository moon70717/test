package ch0706;

public class InstanceMethod {
	static int sInt=0;
	int insInt=0;
	
	int insInt2=insInt;
	//static int sInt2=insInt2; �����ڰ� �ʿ���
	static int sInt2=new InstanceMethod().insInt2;//�̷���
	
	static void sInt() {
		System.out.println(sInt);
		//insInt(); �����ڰ� �ʿ��ϹǷ� �Ұ�����
	}
	
	void insInt() {
		System.out.println(insInt);//�ν��Ͻ� �޼����̹Ƿ� �ν��Ͻ� ������ �׳� ��밡��
	}
	
	void calling() {
		sInt();
		insInt();
	}
	
	public static void main(String[]args) {
		InstanceMethod ins=new InstanceMethod();
		sInt=3;
		ins.insInt=2;
		sInt();//static�� ������ �ʿ����, static �޼�������
		ins.insInt();//static�� ������� ������ �ʿ�, �ν��Ͻ��޼����� ��
		
		ins.calling();//�ν��Ͻ� �޼��忡���� �������� �޼��带 �Ѵ� ȣ�Ⱑ��
	}
}
