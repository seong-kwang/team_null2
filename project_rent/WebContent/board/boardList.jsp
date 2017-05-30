<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="path" value="<%=request.getContextPath() %>"/><%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="path" value="<%=request.getContextPath() %>"/>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>문의 게시판</title>
<script src="http://code.jquery.com/jquery-2.2.4.js"></script>
</head>
<body>
<input type = "button" value = "글쓰기" onclick="location.href='BoardServlet?command=board_write_form'">
<c:if test="${viewData.isEmpty()}">
		등록된 메시지가 없습니다.
</c:if>

<c:if test="${!viewData.isEmpty()}">
	<table border="1" align="center">
		<tr>
			<th>번호</th>
			<th>제목</th>
			<th>작성자</th>
			<th>조회수</th>
			<th>작성일</th>
		</tr>
		<c:forEach var = "board" items="${viewData.boardList }">
			<tr>
				<td>${board.b_num }</td>
				<td><a href="BoardServlet?command=board_detail&num=${board.b_num }">${board.b_title }</a></td>
				<td>${board.b_id }</td>
				<td>${board.b_readcount }</td>
				<td>${board.b_writedate }</td>
			</tr>
		</c:forEach>
	</table>

<div id="wrap" style="text-align:center">
<%-- <c:if test="${viewData.startPage != 1}"> --%>
<%-- 		</c:if> --%>
<c:choose>
	<c:when test="${viewData.currentPageNumber == 1}">
		<span>[처음]</span>
	</c:when>
	<c:otherwise>
		<a href="BoardServlet?command=board_list&?page=1">[처음]</a>
	</c:otherwise>
</c:choose>
<c:choose>
	<c:when test="${viewData.startPage != 1}">
		
		<a href="BoardServlet?command=board_list&?page=${viewData.startPage-1}">[이전]</a>
	</c:when>
	<c:otherwise>
		<span>[이전]</span>
	</c:otherwise>
</c:choose>

<c:forEach begin="${viewData.startPage}"
	end="${viewData.endPage < viewData.pageTotalCount ? viewData.endPage : viewData.pageTotalCount}"
		var="pageNum">
	<c:choose>
		<c:when test="${pageNum == viewData.currentPageNumber}">
			<b>[${pageNum}]</b>
		</c:when>
		<c:otherwise>
			<a href="BoardServlet?command=board_list&page=${pageNum}">[${pageNum}]</a>
		</c:otherwise>
	</c:choose>
</c:forEach>
		
<c:choose>
	<c:when test="${viewData.endPage < viewData.pageTotalCount}">
		<a href="BoardServlet?command=board_list&page=${viewData.endPage+1}">[다음]</a>
	</c:when>
	<c:otherwise>
		<span>[다음]</span>
		
	</c:otherwise>
</c:choose>
<c:choose>
	<c:when test="${viewData.currentPageNumber == viewData.pageTotalCount }">
		<span>[마지막]</span>
	</c:when>
	<c:otherwise>
		<a href="BoardServlet?command=board_list&page=${viewData.pageTotalCount}">[마지막]</a>
	</c:otherwise>
</c:choose>
	</div>
</c:if>
		
</body>
</html>