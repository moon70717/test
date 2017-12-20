<%@page import="java.util.HashMap"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.test.iot.common.DBCon"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		DBCon dbCon = new DBCon();
		String sql = "select * from user_info";
		ArrayList<HashMap<String, Object>> userList = dbCon.executeQuery(sql, null);
		
		for(HashMap<String, Object> hm: userList){
			out.println(hm+"<br> ");
		}
	%>
</body>
</html>