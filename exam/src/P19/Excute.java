package P19;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;

public class Excute {

	public static void main(String[]args) {
		try {
			UserDAO udao=new UserDAO();
			HashMap<String,Object>hm=new HashMap<String,Object>();
			hm.put("uiname", "ttest");
			hm.put("uiage",30);
			hm.put("uiid", "ttest");
			hm.put("uipwd", "ttest");
			hm.put("adress", "서울");
//			udao.insertUser(hm);
//			udao.deleteUser(33);
			ArrayList<HashMap<String,Object>> userList=udao.getUserList();
			for(HashMap<String,Object> user:userList) {
				System.out.println(user);
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
