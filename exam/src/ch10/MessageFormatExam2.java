package ch10;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MessageFormatExam2 {

	public static void main(String[]args) throws FileNotFoundException {
		String tableName="CUST_INFO";
		String fileName="data.txt";
		String msg="INSERT INTO "+tableName+" VALUES ({0},{1},{2},{3})";
		
		Scanner s=new Scanner(new File(fileName));
		
		String pattern="{0},{1},{2},{3}";
		
	}
}
