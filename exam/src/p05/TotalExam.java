package p05;

import java.util.Scanner;

public class TotalExam {
	int a;
	Integer ac;
	boolean b;
	Boolean bc;

	public static void main(String[] args) {
		TotalExam te=new TotalExam();
		int t=Integer.parseInt("35");
		if(te.a==1||te.a==2||te.a==3) {
			System.out.println("a�� 0�̾ƴϳ׿�");
		}
		else if(te.a==1&&te.a==2&&te.a==3) {
			System.out.println("a�� 0�̳׿�");
		}
		
		System.out.println(Integer.parseInt("167")==167);
		
		System.out.println("��Ʈ�� �迭 ������ �氹�� �Է�");
		Scanner s=new Scanner(System.in);
		int leng=s.nextInt();
		s.nextLine();
		String[] strArr=new String[leng];
		
		for(int i=0;i<strArr.length;i++) {
			System.out.println("���� ���ڸ� �Է��ϼ���");
			strArr[i]=s.nextInt()+"";
		}
		for(int i=0;i<strArr.length;i++) {
			System.out.println(strArr[i]);
		}
		
		s.close();
	}
}
