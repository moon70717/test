package ch10;

import java.text.MessageFormat;

public class MessageFormatExam {

	public static void main(String[]args) {
		String msg="Name: {0} \nTel: {1} \nAge: {2} \nBirth: {3}";//넣는칸은 배열처럼 0부터 시작하게됨
		String[] arguments= {"문희주","010-3577-7071","19","08-05"};
		
		String result=MessageFormat.format(msg, arguments);// arguments를 msg에서 지정한 형식대로 배열함
		
		System.out.println(result);
		
		
		String[] data= {"INSERT INTO CUST_INFO VALUES ('문희주','010-3577-7071','19','08-05');"};
		
		String pattern="INSERT INTO CUST_INFO VALUES ({0},{1},{2},{3});";
		MessageFormat mf=new MessageFormat(pattern);
	}
}
