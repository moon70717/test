package p07;

public class Exam02 {
	static int water = 109;

	// 5����,3����,2���� ������ �̿���
	// ���� ���� ����������� 107���͸� ��� ������ ����ÿ�
	public static void main(String[] args) {
//		five = 0;
//		three = 0;
//		two = 0;
		
		
		runNomal();
		runWhile();
	}
	
	static void runNomal() {
		int five = water / 5;
		water = water % 5;
		System.out.println("5���ͷ� �������ϴ�.\n" + five + "���� ���� ����Ͽ��� " + water + "��ŭ�� ���� ���ҽ��ϴ�");
		int three = water / 3;
		water = water % 3;
		System.out.println("3���ͷ� �������ϴ�.\n" + three + "���� ���� ����Ͽ��� " + water + "��ŭ�� ���� ���ҽ��ϴ�");
		int two = water / 2;
		water = water % 2;
		System.out.println("2���ͷ� �������ϴ�.\n" + two + "���� ���� ����Ͽ��� " + water + "��ŭ�� ���� ���ҽ��ϴ�");

		System.out.println("5����:" + five + " 3����:" + three + " 2����:" + two + " ���� ���� ��:" + (water));
	}
	
	static void runWhile() {
		int five = 0;
		int three = 0;
		int two = 0;
		water = 107;
		while (true) {
			if ((water / 5) != 0) {
				water -= 5;
				five++;
			}
			else {
				if ((water / 3) != 0) {
					water -= 3;
					three++;
				}
				else {
					if ((water / 2) != 0) {
						water -= 2;
						two++;
					}
					else {
						break;
					}
				}
			}
		}
		System.out.println("5����:" + five + " 3����:" + three + " 2����:" + two + " ���� ���� ��:" + (water));
	}
}
