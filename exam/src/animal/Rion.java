package animal;

public class Rion extends Animal{
	public void eat(String thing) {
		if(thing.equals("고기")) {
			System.out.println(thing+"을 먹습니다");
		}
		else {
			System.out.println("고기만먹습니다");
		}
	}
}
