<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<c:choose>
	<c:when test="${sessionScope.MEMBER ne board.b_id }">
		<span>작성자만 확인할 수 있습니다.</span>
	</c:when>
	<c:otherwise>
		<input type="hidden" value="${board.b_id }">
		<table style="width: 80%">
			<tr>
				<td>
					제목 : ${board.b_title }
				</td>
				<td style="text-align: right">
					작성자 : ${board.b_id } | 조회수 : ${board.b_readcount } | 작성일 : ${board.b_writedate }
				</td>
			</tr>
			<tr>
				<td align="right" colspan="2">
					<input type="button" value="수정" onclick="location.href='BoardServlet?command=board_update_form&num=${board.b_num}'">
					<input type="button" value="삭제" onclick="location.href='BoardServlet?command=board_delete&num=${board.b_num}'">
				</td>
			</tr>
			<tr>
				<td colspan="2">${board.b_content }</td>
			</tr>
		</table>
	</c:otherwise>
</c:choose>
</body>
</html>