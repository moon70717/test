package animal;

public class Gilin extends Animal{
	
	@Override
	public void eat(String thing) {
		if(thing.equals("식물")) {
			System.out.println(thing+"을 먹습니다");
		}
		else {
			System.out.println("식물만 먹습니다");
		}
	}
	
	public int ob(int i,Object...objects) {
		System.out.println(i+"따로옴");
		System.out.println(objects[0]);
		for(Object n:objects) {
			System.out.println(n);
		}
		return 0;
	}
	
	public static void main(String[]args) {
		Gilin g=new Gilin();
		
		g.ob(0,3,5,6,"asd",true,(3+4),(3>4),'c');
	}
}