package sundry;

import java.util.Random;

public class Mon {
	public static void main(String[]args) {
		Random rand=new Random();
		int i=20;
		while(i>3) {
			int r=rand.nextInt(3)+1;
			System.out.println(r);
			i--;
		}
		
	}
}
