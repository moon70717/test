package ch06;

public class Varargs {// 가변인자
	String concate(String s1) {
		String all="";
		all+=s1;
		return all;
	}
	String concate(String s1,String s2) {
		String all="";
		all+=s1+s2;
		return all;
	}
	String concate(String s1,String s2,String s3) {//갯수별로 일일히 매개변수를 추가해야되서 귀찮음
		String all="";
		all+=s1+s2+s3;
		return all;
	}
	
	String[] concate(String...strings) {//여러개를 한번에 받을수 있음
		return strings;//대신 자동으로 배열로 변환되서 나가게됨
		
	}
	/*String[] concate(String str, String...strings) {  윗놈하고 같은 취급이 되서 메서드를 호출할떄 에러가 생김 
		return strings;  
		
	}*/
	String[] concate(int i, String...strings) {//다른 매개변수와 같이 사용할려면 제일 뒤에 둬야함
		return strings;
		
	}
	public static void main(String[]args) {
		String[] str=new Varargs().concate("1","2","3","4");
		for(int i=0;i<str.length;i++) {
			System.out.print(str[i]);
		}System.out.println();
		String[] str2={"3","5"};
		str=new Varargs().concate(str2);//배열도 보낼수있음
		for(int i=0;i<str2.length;i++) {
			System.out.print(str[i]);
		}System.out.println();
	}
}
