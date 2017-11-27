package ch07;

class father {
	int i=3;
}

public class ExtendsExam extends father{// father클레스를 상속받음
	
	void use() {
		System.out.println(i);//상속받은 클래스의 변수를 사용가능함
		
		System.out.println(--i);//상속받은 클래스의 변수를 수정할수 있음
	}
	
	public static void main(String[]args) {
		new ExtendsExam().use();
	}
}