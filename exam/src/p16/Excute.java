package p16;

public class Excute {

	public void printAction(Action act) {
		act.eat();
		act.sleep();
		act.walk();
		System.out.println(act);
	}

	public static void main(String[] args) {
		Excute e = new Excute();

		Person hong = new Hong("Hong", 20, 173, "gmail");
		e.printAction(hong);

		Animal c = new Cat("나비", 2, 15);
		e.printAction(c);
	}
}
