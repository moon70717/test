package apple;

public class Apple {
	private int aMoney=0;
	final int cost=1000;
	int haveApple=10;
	
	void say() {
		System.out.println("사과 1개에"+cost+"입니다 사가세요~\n"+haveApple+"개 남았습니다~");
	}
	
	void sell(int cMoney, int count) {
		Customer cus=new Customer();
		if(cMoney>=count*cost) {
			aMoney+=(count*cost);
			haveApple-=count;
			System.out.println("여기 사과"+count+"개 입니다!");
		}
		else {
			System.out.println("돈이 부족합니다");
		}
	}
}
