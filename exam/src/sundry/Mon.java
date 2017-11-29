package sundry;

import java.util.Random;

public class Mon {
	static int notChange = 0;
	static int change = 0;
	static int cWin=0;
	static int cLose=0;
	
	
	public static void main(String[] args) {
		answer();
		answer();
		answer();
		answer();
		answer();
		answer();
		answer();
		
		System.out.println("cwin:"+cWin+" cLose:"+cLose);
	}

	static void reset() {
		if (notChange > change) {
			System.out.println("바꾸지 않았을때가 더 큼");
			cLose++;
		}
		else {
			System.out.println("바꿨을때가 더 큼");
			cWin++;
		}
		notChange = 0;
		change = 0;
	}

	static void answer() {

		Random rand = new Random();
		for (int j = 0; j < 1000000; j++) {
			int reward = rand.nextInt(3) + 1;
			int select = rand.nextInt(3) + 1;

			int not = rand.nextInt(3) + 1;
			if (select == not || reward == not) {
				j--;
			}
			else {
				if (reward == select)
					notChange++;
			}
		}
		System.out.println("바꾸지 않았을때: " + notChange);

		for (int j = 0; j < 1000000; j++) {
			int reward = rand.nextInt(3) + 1;
			int select = rand.nextInt(3) + 1;

			int not = rand.nextInt(3) + 1;
			if (select == not || reward == not) {
				j--;
			}
			else {
				select = (1 == select ? (2 == not ? 3 : 2) : (3 == select ? (2 == not ? 1 : 2) : (1 == not ? 2 : 1)));
				if (reward == select)
					change++;
			}
		}
		System.out.println("바꿨을때: " + change);
		reset();
	}
}
