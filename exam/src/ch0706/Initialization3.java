package ch0706;

public class Initialization3 {
	static int count =0;
	String name;
	
	Initialization3(){
		this("�������"+ ++count);
	}
	Initialization3(String name){
		this.name=name;
		System.out.println("���� "+ this.name+".txt�� �����Ǿ����ϴ�");
	}
	
	public static void main(String[]args) {
		Initialization3 init1=new Initialization3();
		Initialization3 init2=new Initialization3("java");
		Initialization3 init3=new Initialization3();
		Initialization3 init4=new Initialization3();
	}
}
