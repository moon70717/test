package ch0706;

public class ThisExam {
	int i;
	int j;
	int x;
	int z;

	ThisExam() {
		this(3, 5, 6, 7);// �Ű������� �ִ� ThisExam�� �����ټ�����
	}

	ThisExam(int i) {
		this(i, 5, 6, 7);// �Ϻθ� �����ؼ� ���۰���
	}

	ThisExam(ThisExam te) {
		i = te.i;// �����ڸ� �̿��ؼ� ���� �����Ҽ�����
		j = te.j;
		x = te.x;
		z = te.z;
	}

	public ThisExam(int i, int j, int x, int z) {
		this.i = i;// ���� �̸��� ������ this�� ���������� ȣ�Ⱑ��
		this.j = j;
		this.x = x;
		this.z = z;
	}

	public static void main(String[] args) {
		ThisExam te1 = new ThisExam();
		ThisExam te2 = new ThisExam(88);
		ThisExam te3 = new ThisExam(te2);

		System.out.println("te1�� ���� ����մϴ�" + te1.i + " " + te1.j + " " + te1.x + " " + te1.z + " ");
		System.out.println("te2�� ���� ����մϴ�" + te2.i + " " + te2.j + " " + te2.x + " " + te2.z + " ");
		System.out.println("te3�� ���� ����մϴ�" + te3.i + " " + te3.j + " " + te3.x + " " + te3.z + " ");
	}
}
