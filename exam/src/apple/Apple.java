package apple;

public class Apple {
	private int aMoney=0;
	final int cost=1000;
	int haveApple=10;
	
	void say() {
		System.out.println("��� 1����"+cost+"�Դϴ� �簡����~\n"+haveApple+"�� ���ҽ��ϴ�~");
	}
	
	void sell(int cMoney, int count) {
		Customer cus=new Customer();
		if(cMoney>=count*cost) {
			aMoney+=(count*cost);
			haveApple-=count;
			System.out.println("���� ���"+count+"�� �Դϴ�!");
		}
		else {
			System.out.println("���� �����մϴ�");
		}
	}
}
