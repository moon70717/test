package p07;

public class Exam02 {
	static int water = 109;

	// 5리터,3리터,2리터 물통을 이용해
	// 가장 적은 물통을사용해 107리터를 담는 예제를 만드시오
	public static void main(String[] args) {
//		five = 0;
//		three = 0;
//		two = 0;
		
		
		runNomal();
		runWhile();
	}
	
	static void runNomal() {
		int five = water / 5;
		water = water % 5;
		System.out.println("5리터로 나눴습니다.\n" + five + "개의 통을 사용하였고 " + water + "만큼의 물이 남았습니다");
		int three = water / 3;
		water = water % 3;
		System.out.println("3리터로 나눴습니다.\n" + three + "개의 통을 사용하였고 " + water + "만큼의 물이 남았습니다");
		int two = water / 2;
		water = water % 2;
		System.out.println("2리터로 나눴습니다.\n" + two + "개의 통을 사용하였고 " + water + "만큼의 물이 남았습니다");

		System.out.println("5리터:" + five + " 3리터:" + three + " 2리터:" + two + " 남은 물의 양:" + (water));
	}
	
	static void runWhile() {
		int five = 0;
		int three = 0;
		int two = 0;
		water = 107;
		while (true) {
			if ((water / 5) != 0) {
				water -= 5;
				five++;
			}
			else {
				if ((water / 3) != 0) {
					water -= 3;
					three++;
				}
				else {
					if ((water / 2) != 0) {
						water -= 2;
						two++;
					}
					else {
						break;
					}
				}
			}
		}
		System.out.println("5리터:" + five + " 3리터:" + three + " 2리터:" + two + " 남은 물의 양:" + (water));
	}
}
