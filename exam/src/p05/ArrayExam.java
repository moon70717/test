package p05;

public class ArrayExam {
	public static void main(String[] args) {
		int[][] numArr = new int[3][3];
		numArr[0][0] = 1;
		numArr[0][1] = 2;
		numArr[0][2] = 3;
		numArr[1][0] = 4;
		numArr[1][1] = 5;
		numArr[1][2] = 6;
		numArr[2][0] = 7;
		numArr[2][1] = 8;
		numArr[2][2] = 9;

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				numArr[i][j] = j + 1;
				System.out.print(numArr[i][j]);
				if(j!=2)
					System.out.print(", ");
				else
					System.out.println();
			}
		}
	}
}
