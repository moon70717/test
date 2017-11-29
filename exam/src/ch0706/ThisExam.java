package ch0706;

public class ThisExam {
	int i;
	int j;
	int x;
	int z;

	ThisExam() {
		this(3, 5, 6, 7);// 매개변수가 있는 ThisExam로 보내줄수있음
	}

	ThisExam(int i) {
		this(i, 5, 6, 7);// 일부만 변경해서 전송가능
	}

	ThisExam(ThisExam te) {
		i = te.i;// 생성자를 이용해서 값을 복사할수있음
		j = te.j;
		x = te.x;
		z = te.z;
	}

	public ThisExam(int i, int j, int x, int z) {
		this.i = i;// 변수 이름이 같을시 this로 전역변수를 호출가능
		this.j = j;
		this.x = x;
		this.z = z;
	}

	public static void main(String[] args) {
		ThisExam te1 = new ThisExam();
		ThisExam te2 = new ThisExam(88);
		ThisExam te3 = new ThisExam(te2);

		System.out.println("te1의 값을 출력합니다" + te1.i + " " + te1.j + " " + te1.x + " " + te1.z + " ");
		System.out.println("te2의 값을 출력합니다" + te2.i + " " + te2.j + " " + te2.x + " " + te2.z + " ");
		System.out.println("te3의 값을 출력합니다" + te3.i + " " + te3.j + " " + te3.x + " " + te3.z + " ");
	}
}
