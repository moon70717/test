package ch0707;

class fathers {
	int i=3;
}

public class ExtendsExam2 extends fathers{// fatherŬ������ ��ӹ���
	
	void use() {
		System.out.println(i);//��ӹ��� Ŭ������ ������ ��밡����
		
		System.out.println(--i);//��ӹ��� Ŭ������ ������ �����Ҽ� ����
	}
	
	public static void main(String[]args) {
		new ExtendsExam2().use();
	}
}