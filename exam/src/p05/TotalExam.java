package p05;

public class TotalExam {
	int a;
	Integer ac;
	boolean b;
	Boolean bc;

	public static void main(String[] args) {
		TotalExam te=new TotalExam();
		int t=Integer.parseInt("35");
		if(te.a==1||te.a==2||te.a==3) {
			System.out.println("a가 0이아니네요");
		}
		else if(te.a==1&&te.a==2&&te.a==3) {
			System.out.println("a가 0이네요");
		}
		
		System.out.println(Integer.parseInt("167")==167);
		
		String[] strArr=new String[3];
		strArr[0]="123";
		strArr[1]="123";
		strArr[2]="123";
	}
}
