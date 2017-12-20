package p20;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;

public class Test {

	public Test(Object object) throws Exception {
		/*
		 * Class cls=object.getClass(); System.out.println(object.toString());
		 * 
		 * Method invoke= cls.getMethod("append", new String().getClass());
		 * 
		 * invoke.invoke(object, "ㅁ야호"); System.out.println(object.toString());
		 * 
		 * invoke=cls.getMethod("toString",null);
		 * System.out.println(invoke.invoke(object, null));
		 */

	}

	public static void main(String[] args) throws Exception {
		Test t = new Test(new StringBuffer());
		Class cls = t.getClass();
		System.out.println(t.vv());

		System.out.println(t.toString());

		Method invo = cls.getMethod("vv");
		System.out.println(invo.invoke(t, args));

		invo = cls.getMethod("vvv");
		invo.invoke(t, args);

		ArrayList<HashMap<String, Object>> ar = new ArrayList<HashMap<String, Object>>();
		ar = null;

		String sws = "test tesdsa";
		if (sws.contains("tesd")) {
			System.out.println("있다");
		}

	}

	public static String vv() {
		int i = 0;
		String sql = "";
		switch (i) {
		case 1:
			sql = "1";
			return sql;
		case 2:
			sql = "2";
			return sql;
		case 3:
			sql = "3";
			return sql;
		case 4:
			sql = "4";
			return sql;
		default:
			return sql;
		}
	}

	public static void vvv() {
		System.out.println("sss");
	}
}
