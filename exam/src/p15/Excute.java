package p15;

import java.util.ArrayList;

public class Excute {

	public static void main(String[] args) {
		Controller ct = new Controller();
		ArrayList<User> userList = ct.get("list", null);
		for (int i = 1; i <= 5; i++) {
			User user = new User("이름" + i, i, i);
			ct.get("add", user);
		}
		for (User u : userList) {
			System.out.println(u);
		}
//		
//		User ru = new User(3);
//		ct.get("remove", ru);
//		for (User u : userList) {
//			System.out.println(u);
//		}
		
//		ru.setName("이름1");
//		ct.get("search",ru);
//		System.out.println("검색결과");
//		for (User u : userList) {
//			System.out.println(u);
//		}
		User user=new User("모모",20,2);
		ct.get("update", user);
		for(User u:userList) {
			System.out.println(u);
		}
		
	}
}
