package ch07;

class father {
	int i=3;
}

public class ExtendsExam extends father{// fatherŬ������ ��ӹ���
	
	void use() {
		System.out.println(i);//��ӹ��� Ŭ������ ������ ��밡����
		
		System.out.println(--i);//��ӹ��� Ŭ������ ������ �����Ҽ� ����
	}
	
	public static void main(String[]args) {
		new ExtendsExam().use();
	}
}