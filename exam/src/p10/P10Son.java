package p10;

import p09.P10FaFa;

public class P10Son extends P10FaFa{
	
	P10Son(String str){
		super(str);
	}
	P10Son(String str, String str2){
		super(str,str2);
	}
	
	public static void main(String[]args) {
		P10Son pson =new P10Son("public");
		P10Son pson2 =new P10Son("protected","protected");
		
//		pson.prin("public");
//		pson.prin("protected","protected");
//		pson.prin(); defalut는 같은 패키지가 아니면 접근불가  
	}
}
