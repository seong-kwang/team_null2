<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
${sessionScope.MEMBER }야 안녕?<br>
<a href="BoardServlet?command=board_list">boardlist gogogo</a>
<a href="ReserveServlet?command=reserve_form">예약 고고</a>
</body>
</html>