package ch06;

public class Initialization2 {
	static int count=0;
	int seNo;
	
	{
		count++;
		seNo=count;
	}
	
	public static void main(String[]args) {
		Initialization2 initi1=new Initialization2();
		Initialization2 initi2=new Initialization2();
		Initialization2 initi3=new Initialization2();
		
		System.out.println("initi1�� ��ǰ��ȣ�� "+initi1.seNo);
		System.out.println("initi2�� ��ǰ��ȣ�� "+initi2.seNo);
		System.out.println("initi3�� ��ǰ��ȣ�� "+initi3.seNo);
		System.out.println("�� ������ "+count+"�� �Դϴ�");
	}
}
