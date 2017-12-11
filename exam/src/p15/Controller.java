package p15;

import java.util.ArrayList;

public class Controller {

	private Service server;

	public Controller() {
		server = new Service();
	}

	public ArrayList<User> get(String command, User user) {
		if (command.equals("list")) {
			return getUserList(null);
		} else if (command.equals("add")) {
			boolean isOk = insertUser(user);
			if (isOk) {
				System.out.println(user.getName() + "입력완료");
			} else {
				System.out.println("입력중 에러가 발생했습니다");
			}
		} else if (command.equals("remove")) {
			// String name=server.getUserList("").get(user.getNo()).getName();

			boolean isOk = removeUser(user);

			if (isOk) {
				System.out.println(user + "삭제완료");
			} else {
				System.out.println("삭제중 에러가 발생했습니다");
			}
		} else if (command.equals("search")) {
			return getUserList(user.getName());
		} else if (command.equals("update")) {
			boolean isOk = updateUser(user);
			if (isOk) {
				System.out.println("수정완료");
			} else {
				System.out.println("수정중 에러가 발생했습니다");
			}
		}
		return null;
	}

	public boolean updateUser(User user) {
		return server.updateUser(user);
	}

	public boolean insertUser(User user) {
		return server.insertUser(user);
	}

	public boolean removeUser(User user) {
		return server.removeUser(user);
	}

	public boolean removeUser(int no) {
		return server.removeUser(no);
	}

	public ArrayList<User> getUserList(String str) {
		return server.getUserList(str);
	}
}
