package p03;

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
		/*
		 * Test test = new Test("가나다ABC123"); System.out.println(test.str);
		 * 
		 * String str = "나 여기있습니다~~나"; test.print(str);
		 * 
		 * test.print(str.replace("나", "문희주")); test.print(str);
		 * 
		 * str = str.replace("나", "문희주"); test.print(str);
		 * 
		 * System.out.println(str.lastIndexOf("나"));// 뒤에서부터 찾기 앞에서부터 찾기는 last빼야됨
		 */
		ObjectExam objectExam = new ObjectExam();
		objectExam.inputNums(objectExam);

		GuGuDan guGuDan = new GuGuDan();
		guGuDan.printLoop(objectExam);
	}
}