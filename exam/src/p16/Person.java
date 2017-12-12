package p16;

public class Person implements Action {
	
	private String name;
	private int age;
	private int cm;
	private String email;

	Person(String name, int age, int cm, String email) {
		this.name = name;
		this.age = age;
		this.cm = cm;
		this.email = email;
	}

	public void eat() {
		System.out.println(name+"가 먹습니다");
	}

	@Override
	public void sleep() {
		System.out.println(name+"가 잡니다");
	}

	@Override
	public void walk() {
		System.out.println(name+"가 걷습니다");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Hong [name=" + name + ", age=" + age + ", cm=" + cm + ", email=" + email + "]";
	}
}
