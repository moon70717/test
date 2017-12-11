package p15;

import java.util.ArrayList;

public class Excute {

	public static void main(String[] args) {
		User us=new User("유저",3);
		
		ArrayList<User> userList=new ArrayList<User>();
		userList.add(us);
		us=new User("us1",4);
		userList.add(us);
		
		userList.add(new User("sd",34));
		
		for(User s:userList) {
			System.out.println(s);
		}
	}
}
