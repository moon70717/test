package p10;

public class Excute {

	int a = 4;

	/*Excute() {
		super(1, 333);
	}

	public void print() {
		String prin="";
		String[] sss= {"3","6","9"};
		for (int i = minNum; i <= maxNum; i++) {
			String str=i+"";
			
			for(String s:sss) {
				str=str.replace(s, "짝");
			}
			
			if(str.indexOf("짝")>-1) {
				for(char c:str.toCharArray()) {
					if(c=='짝') {
						prin+="짝";
					}
				}
			}
			else {
				prin+=str;
			}
			prin +="\t";

			if (i % 10 == 0) {
				System.out.println(prin);
				prin="";
			}
		}System.out.println(prin);
	}
	
	public void print(int i) {
		super.print();
	}*/
	
	public void print(Father f) {
		System.out.println(f.toString());
	}
	
	public static void main(String[] args) {
		Father f = new Father(1,2);
		Excute ex=new Excute();
		System.out.println(f);
		ex.print(f);
	}
}
