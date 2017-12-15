package p18;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connector {
	
	public static void main(String[]args) {
		String url="jdbc:mariadb://localhost:3306/iot2";
		String user="moon";
		String password="allprivate1";
		
		
		try {
			Connection con=DriverManager.getConnection(url,user,password);
		}catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
