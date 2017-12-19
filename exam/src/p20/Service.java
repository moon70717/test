package p20;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class Service {
	DBCon dbCon;
	String sql;

	Service() {
		dbCon = new DBCon();
	}

	public ArrayList<HashMap<String, Object>> getClassInfo() throws SQLException {
		sql = "select * from class_info";
		return dbCon.executeQuery(sql, null);
	}

	public ArrayList<HashMap<String, Object>> getUserInfo() throws SQLException {
		sql = "select * from user_info";
		return dbCon.executeQuery(sql, null);
	}

	public int updateClassInfo(LinkedHashMap<String, Object> hm) {
		int result = 0;
		sql = "update class_info set cidesc=? where cino=?";

		try {
			result = dbCon.executeUpdate(sql, hm);
			dbCon.commit();
		} catch (SQLException e) {
			try {
				dbCon.rollback();
			} catch (SQLException e1) {
				System.out.println("rollback중 에러발생");
			}
			e.printStackTrace();
		} finally {
			try {
				dbCon.closeAll();
			} catch (SQLException e) {
				System.out.println("connection 종료중 에러발생");
			}
		}
		return result;
	}
	
	public int deleteClassInfo(LinkedHashMap<String, Object> hm) {
		int result = 0;
		sql = "delete from user_info where uino=?";
		try {
			dbCon.executeUpdate(sql, hm);
			dbCon.commit();
		} catch (SQLException e) {
			try {
				dbCon.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			e.printStackTrace();
		} finally {
			try {
				dbCon.closeAll();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return result;
	}

	public int insertClassInfo(LinkedHashMap<String, Object> hm) {
		int result = 0;
		sql = "INSERT INTO USER_INFO(UINAME,UIAGE,UIID,UIPWD,CINO,uiregdate,address) " + "VALUES (?,?,?,?,?,Now(),?);";
		try {
			dbCon.executeUpdate(sql, hm);
			dbCon.commit();
		} catch (SQLException e) {
			try {
				dbCon.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			e.printStackTrace();
		} finally {
			try {
				dbCon.closeAll();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return result;
	}
	
	public ArrayList<HashMap<String, Object>> getInfo(LinkedHashMap<String, Object> hm) throws SQLException {
		sql = "select ? from ?";
		return dbCon.executeQuery(sql, hm);
	}
	
	public int getExam(LinkedHashMap<String, Object> hm, String sql) {
		int result = 0;
		try {
			dbCon.executeUpdate(sql, hm);
			dbCon.commit();
		} catch (SQLException e) {
			try {
				dbCon.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			e.printStackTrace();
		} finally {
			try {
				dbCon.closeAll();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return result;
	}

}
