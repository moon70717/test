package p3;

public class Test {
	String str;

	Test(String str) {
		this.str = str;
	}

	void print(String str) {
		System.out.println(str);
	}

	static void printInt(int a) {
		System.out.println(a);
	}

	public static void main(String[] args) {
		Test test = new Test("������ABC123");
		System.out.println(test.str);

		String str = "�� �����ֽ��ϴ�~~��";
		test.print(str);

		test.print(str.replace("��", "������"));
		test.print(str);

		/*
		 * str = str.replace("��", "������"); test.print(str);
		 */

		System.out.println(str.lastIndexOf("��"));// �ڿ������� ã�� �տ������� ã��� last���ߵ�

	}
}
