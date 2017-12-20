package p20;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class Excute {

	public static void main(String[] args) throws SQLException {
		Service s = new Service();
		LinkedHashMap<String, Object> hm = new LinkedHashMap<String, Object>();
		/*hm.put("cidesc", "정보보안 바꿈");
		hm.put("cino", 3);
		int result = s.updateClassInfo(hm);

		if (result == 1) {
			System.out.println("업데이트 완료");
		}

		// 여기까지 update

		hm = new LinkedHashMap<String, Object>();
		hm.put("uino", 24);
		s.deleteClassInfo(hm);

		// 여기까지 delete

		hm = new LinkedHashMap<String, Object>();
		hm.put("uiname", "test");
		hm.put("uiage", 35);
		hm.put("uiid", "testId4");
		hm.put("uipwd", "testPwd");
		hm.put("cino", 3);
		hm.put("address", "서울");

		s.insertClassInfo(hm);
		//여기까지 insert

		hm = new LinkedHashMap<String, Object>();
		hm.put("uiname", "test이름");
		hm.put("uiage", 35);
		hm.put("uiid", "로 넣은 id3");
		hm.put("uipwd", "testPwd");
		hm.put("cino", 3);
		hm.put("address", "서울");
		String sql = "INSERT INTO user_info(UINAME,UIAGE,UIID,UIPWD,CINO,uiregdate,address) " + "VALUES (?,?,?,?,?,Now(),?)";
		
		s.getExam(hm,sql);*/
		
		
		
		// 여기부터 get
		hm = new LinkedHashMap<String, Object>();
		hm.put("value", "uino,uiname,uiid");
		hm.put("from", "user_info");
		ArrayList<HashMap<String, Object>> List = s.getInfo(hm);

		for (HashMap<String, Object> hms : List) {//userList
			System.out.println(hms);
		}
	}
}
