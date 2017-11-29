package ch06;

public class Initialization2 {
	static int count=0;
	int seNo;
	
	{
		count++;
		seNo=count;
	}
	
	public static void main(String[]args) {
		Initialization2 initi1=new Initialization2();
		Initialization2 initi2=new Initialization2();
		Initialization2 initi3=new Initialization2();
		
		System.out.println("initi1의 제품번호는 "+initi1.seNo);
		System.out.println("initi2의 제품번호는 "+initi2.seNo);
		System.out.println("initi3의 제품번호는 "+initi3.seNo);
		System.out.println("총 갯수는 "+count+"개 입니다");
	}
}
