package p07;

public class CallBy {
	
	int[] doFunc(int[] a) {
		a[0]=3;
		a=new int[a.length];
		System.out.println(a[0]);
		return a;
	}
	
	public static void main(String[]args) {
		int[] a=new int[1];
		int[] b=new int[2];
		
		CallBy cb=new CallBy();
		int cc[]=cb.doFunc(a);
		System.out.println(a==cc);
		System.out.println(cc.length);
	}
}
