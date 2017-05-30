<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<c:set var="path" value="<%=request.getContextPath() %>"/>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script src="http://code.jquery.com/jquery-2.2.4.js"></script>
<script src="http://dmaps.daum.net/map_js_init/postcode.v2.js"></script>
<script type="text/javascript" src="${path }/script/addr.js"></script>
</head>
<body>
	<input type="text" id="sample4_postcode" placeholder="우편번호">
	<input type="button" onclick="sample4_execDaumPostcode()" value="우편번호 찾기"><br>
	<input type="text" id="sample4_roadAddress" placeholder="도로명주소">
	<input type="text" id="sample4_jibunAddress" placeholder="지번주소">
	<span id="guide" style="color:#999"></span>
</body>
</html>