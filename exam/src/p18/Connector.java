package p18;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Connector {
	
	public static void main(String[]args) {
		String url="jdbc:mariadb://localhost:3306/iot2";
		String user="root";
		String password="allprivate1";
		Connection con=null;
		
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			con=DriverManager.getConnection(url,user,password);
			String sql="select ui.*, ci.* from user_info ui, class_info ci ";
			sql+="where ui.cino=ci.cino and ui.uino<5";
			PreparedStatement ps= con.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			List<UserInfo> userList=new ArrayList<UserInfo>();
			
			while(rs.next()) {
				UserInfo ui=new UserInfo();
				ui.setUiNo(rs.getInt("uino"));
				ui.setUiName(rs.getString("uiname"));
				ui.setUiId(rs.getString("uiid"));
				ui.setUiAge(rs.getInt("uiage"));
				ui.setUiPwd(rs.getString("uipwd"));
				ui.setUiRegDate(rs.getString("uiregdate"));
				ui.setCiNo(rs.getInt("cino"));
				ui.setAddress(rs.getString("address"));
					
				System.out.println(ui);
			}
			
		}catch (SQLException e) {
			System.out.println("SQL에러인듯");
			e.printStackTrace();
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
