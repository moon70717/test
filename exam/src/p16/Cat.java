package p16;

public class Cat extends Animal{
	
	Cat(String name, int age, int cm){
		super(name,age,cm);
	}
	
	public void eat() {
		System.out.println(getName()+"가 사료를 원합니다");
	}
	
	public void eat(String str) {
		System.out.println("");
	}
}
