package p05;

import java.util.Scanner;

public class ArrayExam2 {
	public static void main(String[]args) {
		Scanner s=new Scanner(System.in);
		int x=s.nextInt();
		int y=s.nextInt();
		
		for(int i=1;i<=x;i++) {
			for(int j=1;j<=y;j++) {
				System.out.print(i+" * "+j+" = "+(i*j)+"||");
				/*if(j<y) {
					System.out.print(", ");
				}*/
			}System.out.println();
		}
	}
}
