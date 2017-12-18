package P19;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connector {
	public Connection con;
	private String url = "jdbc:mariadb://localhost:3306/iot2";
	private String user = "root";
	private String password = "allprivate1";

	public Connector() throws ClassNotFoundException {
		Class.forName("org.mariadb.jdbc.Driver");
	}

	public Connection getConnection() throws SQLException {
		if (con == null) {
			con = DriverManager.getConnection(url, user, password);
			con.setAutoCommit(false);
		}
		return con;
	}

	public void close() throws SQLException {
		System.out.println("con닫습니다\n"+con);
		if (con != null) {
			con.close();
		}
		con = null;
	}
	
	public static void main(String[] args){

	}
}
