package ch0706;

public class InstanceMethod {
	static int sInt=0;
	int insInt=0;
	
	int insInt2=insInt;
	//static int sInt2=insInt2; 생성자가 필요함
	static int sInt2=new InstanceMethod().insInt2;//이렇게
	
	static void sInt() {
		System.out.println(sInt);
		//insInt(); 생성자가 필요하므로 불가능함
	}
	
	void insInt() {
		System.out.println(insInt);//인스턴스 메서드이므로 인스턴스 변수를 그냥 사용가능
	}
	
	void calling() {
		sInt();
		insInt();
	}
	
	public static void main(String[]args) {
		InstanceMethod ins=new InstanceMethod();
		sInt=3;
		ins.insInt=2;
		sInt();//static은 생성자 필요없음, static 메서드라고함
		ins.insInt();//static이 없을경우 생성자 필요, 인스턴스메서드라고 함
		
		ins.calling();//인스턴스 메서드에서는 두종류의 메서드를 둘다 호출가능
	}
}
