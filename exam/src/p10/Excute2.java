package p10;

public class Excute2 {
	public static void main(String[]args) {
		Object p1=new Person();
		Object p2=new P2();
		Object p3=new P3();
		Object p4=new P4();
		
		Object[] ob=new Object[4];

		ob[0]=new Person();
		ob[1]=new P2();
		ob[2]=new P3();
		ob[3]=new P4();
		
		for(Object i:ob) {
			System.out.println(i);
		}
	}
}
