package p3;

public class GuGuDan {
	public static void main(String[]args) {
		for(int i=1;i<10;i++) {
//			System.out.print(i+"´Ü||");
			for(int j=1;j<=9;j++) {
//				System.out.print(i+" * "+j+" = "+(j*i)+",  ");
				System.out.printf("%2d * %2d = %2d||", j,i,(i*j));
			}
			System.out.println("");
//			System.out.println(i+" * 9 = "+(9*i));
		}
		
		/*for(int i=1;i<10;i++) {
			for(int j=1;j<10;j++) {
				System.out.print(j+"*"+i+"="+(i*j)+", ");
			}System.out.println("");
		}*/
	}
}
