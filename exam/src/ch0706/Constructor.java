package ch0706;

public class Constructor {
	int strat;
	
	Constructor(int i){//�����ڿ� �ִ°��� ��ó�� �ѹ� ������������ �����
		strat=i;//�� ���𰡴�
		System.out.println("Constructor�� �����ڰ� �����Ǿ����ϴ�"+i);//���� �������� �����ÿ��� ����Ʈ �����ڰ� �ڵ����� ������
	}
	Constructor(){// �ֵ� �����ε� ������
		System.out.println("�Ű������� ���� Constructor�� �����Ǿ����ϴ�");
	}
	public static void main(String[]args) {
		Constructor cons=new Constructor(3);//Constructor�� �����ڸ� ������, ���� �����ټ�����
		Constructor cons2=new Constructor();
	}
	
}
