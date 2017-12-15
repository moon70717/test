package p16;

public class Animal implements Action {

	private String name;
	private int age;
	private int cm;

	Animal(String name, int age, int cm) {
		this.name = name;
		this.age = age;
		this.cm = cm;
	}

	@Override
	public void sleep() {
		System.out.println(name + "가 잠니다");
	}

	@Override
	public void walk() {
		System.out.println(name + "가 걷습니다");
	}

	@Override
	public void eat() {
		System.out.println(name + "가 먹습니다");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Animal [name=" + name + ", age=" + age + ", cm=" + cm + "]";
	}
}
