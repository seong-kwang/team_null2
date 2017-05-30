<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="MemberServlet">
	<input type="hidden" name="command" value="login_attempt">
	<input type="text" name="id"><br>
	<input type="password" name="pass"><br>
	<input type="submit" value="로그인"><br>
	<a href="#">아이디 찾기</a>/<a href="#">비밀번호 찾기</a>
</form>
</body>
</html>