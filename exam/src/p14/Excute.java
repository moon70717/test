package p14;

import java.util.ArrayList;
import java.util.Random;

public class Excute {

	public static void main(String[] args) {
		MapExam me = new MapExam();
		ArrayList<MapExam> alMap = new ArrayList<MapExam>();
		Random rand = new Random();

		for (int i = 0; i < 10; i++) {
			me=new MapExam();
			me.put("name", "" + i);
			me.put("age", "" + (rand.nextInt(100) + 1));
			alMap.add(me);
		}
		for(MapExam me2:alMap) {
			System.out.println(me2);
		}
	}
}
