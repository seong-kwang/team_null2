<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="path" value="<%=request.getContextPath() %>"/>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script src="http://code.jquery.com/jquery-2.2.4.js"></script>
<script type="text/javascript" src="${path }/smarteditor/js/HuskyEZCreator.js" charset="utf-8"></script>
<script type="text/javascript" src="${path }/script/editor.js"></script>
</head>
<body>

<div id="wrap" align="center">
<form action="BoardServlet" method="get" id="frm">
	<h1>문의 하기</h1>
	<input type="hidden" name = "command"value = "board_write">	
	<table style="width: 100%">
		<tr>
			<th>제목</th>
			<td>
				<input type="text" id="title" name="title" style="width:754px">
			</td>
		</tr>
		<tr>
			<th>내용</th>
			<td>
				<!-- 크기는 알아서 설정하기. -->
	    		<textarea name="content" id="smarteditor" rows="10" cols="100" style="width:756px; height:412px;">
		    	</textarea>
	    	</td>
	    </tr>
    </table>
    <br>
	<input type="button" id="savebutton" value="글쓰기"/>
	<input type= "reset" value = "다시 작성">
	<input type = "button" value = "목록" onclick="location.href='${path}/BoardServlet?command=board_list'">
</form>
</div>
</body>
</html>