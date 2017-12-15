package p16;

public class Hong extends Person{
	
	Hong(String name, int age, int cm, String email){
		super(name,age,cm,email);
	}
	
	public void eat() {
		System.out.println(getName()+": 스팸이좋다");
	}
	
	public void eat(String s) {
		System.out.println("스팸팸");
	}
}
