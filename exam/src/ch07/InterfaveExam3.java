package ch07;

public class InterfaveExam3 {
	recyclable re=new paper(0);//인터페이스를 상속받은애로 생성자 생성가능
	
	
}

interface recyclable{}

class trash{
	int kg;
	trash(int kg){
		this.kg=kg;
	}
}

class burnableTrash extends trash{
	burnableTrash(int kg){
		super(kg);
	}
}

class paper extends burnableTrash implements recyclable{

	paper(int kg) {
		super(kg);
	}
	
}