package ch0706;

public class Initialization3 {
	static int count =0;
	String name;
	
	Initialization3(){
		this("제목없음"+ ++count);
	}
	Initialization3(String name){
		this.name=name;
		System.out.println("문서 "+ this.name+".txt가 생성되었습니다");
	}
	
	public static void main(String[]args) {
		Initialization3 init1=new Initialization3();
		Initialization3 init2=new Initialization3("java");
		Initialization3 init3=new Initialization3();
		Initialization3 init4=new Initialization3();
	}
}
