package P19;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;

public class UserDAO {

	Connector c;
	Connection con;
	String sql;
	UserDAO() throws ClassNotFoundException{
		c=new Connector();
	}
	
	public ArrayList<HashMap<String,Object>> getUserList() throws SQLException{
		con=c.getConnection();
		sql="select * from user_info";
		ArrayList<HashMap<String,Object>> userList=new ArrayList<HashMap<String,Object>>();
		PreparedStatement ps=con.prepareStatement(sql);
		ResultSet rs=ps.executeQuery();
		while(rs.next()) {
			HashMap<String,Object> hm=new HashMap<String,Object>();
			hm.put("uiid", rs.getString("uiid"));
			hm.put("uino", rs.getInt("uino"));
			hm.put("uiname", rs.getString("uiname"));
			userList.add(hm);
		}
		con.close();
		return userList;
		
	}
	
	public int insertUser(HashMap<String,Object> hm) throws SQLException {
		con=c.getConnection();
		String sql="INSERT INTO USER_INFO(UINAME,UIAGE,UIID,UIPWD,CINO,uiregdate,address)\r\n" + 
				"VALUES (?,?,?,?,1,NOW(),?)";
		PreparedStatement ps=con.prepareStatement(sql);
		ps.setString(1, (String)hm.get("uiname"));
		ps.setInt(2,(int)hm.get("uiage"));
		ps.setString(3, (String)hm.get("uiid"));
		ps.setString(4, (String)hm.get("uipwd"));
		ps.setString(5, "address");
		int result=ps.executeUpdate();
		con.close();
		return result;
	}
	
	public int updateUser(HashMap<String,Object> hm) {
		return 0;
	}
	
	public int deleteUser(int userNo) throws SQLException {
		con=c.getConnection();
		String sql="delete from user_info where uino=?";
		PreparedStatement ps=con.prepareStatement(sql);
		ps.setInt(1, userNo);
		int result=ps.executeUpdate();
		con.close();
		return result;
	}
}
