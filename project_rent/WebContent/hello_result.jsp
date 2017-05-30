<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="path" value="<%=request.getContextPath() %>"/>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script src="http://code.jquery.com/jquery-2.2.4.js"></script>
</head>
<body>
${msg }<br>
<table>
	<tr>
		<th>번호</th>
		<th>인사</th>
	</tr>
<c:forEach var="h" items="${list }">
	<tr>
		<td>${h.num }</td>
		<td>${h.greeting}</td>
	</tr>
</c:forEach>
</table>
jqueryCDN은 hello_result.jsp에 있음, core태그 디렉티브도..<br>
경로는 절대경로로 받아옵시다.(4번째줄 이용) <br>
절대경로 사용방법 : ${path }/경로~
</body>
</html>