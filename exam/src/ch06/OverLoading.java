package ch06;

public class OverLoading {
	
	static void over1(int i) {
		System.out.println(i);
	}
	static void over1(int i,int j) {
		System.out.println(i+""+j);
	}
	
	static void over1(String i) {
		System.out.println(i);
	}
	
	/*static void over1(int cc) { �Ű������� �̸��� ����� ����
		System.out.println(cc);
	}*/
	
	static int over2(int i) {
		return i;
	}
	/*static long over2(int i) {  ����Ÿ�Զ��� ����� ����
		return i;
	}*/
	
	public static void main(String[]args) {
		over1(3);
		over1(3,5);//�̸��� ���Ƶ� �Ű������� ������ �ٸ��� �����̵�
		over1("�Ű����� Ÿ���� �޶� ����");//�Ű������� ������ Ÿ���� �޶�ߵ�
	}
}
