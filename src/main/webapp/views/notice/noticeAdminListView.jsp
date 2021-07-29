<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.ArrayList, notice.model.vo.Notice"%>
<%
	ArrayList<Notice> list = (ArrayList<Notice>)request.getAttribute("list");
	int listCount = ((Integer)request.getAttribute("listCount")).intValue();
	int startPage = ((Integer)request.getAttribute("startPage")).intValue();
	int endPage = ((Integer)request.getAttribute("endPage")).intValue();
	int maxPage = ((Integer)request.getAttribute("maxPage")).intValue();
	int currentPage = ((Integer)request.getAttribute("currentPage")).intValue();
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>BodyWay Admin</title>
</head>
<body>
<%@ include file="../common/menubar.jsp" %>
<hr>
<h1 align="center">공지사항</h1>
<div style="text-align: center;">
	<button onclick="javascript:location.href='/semi/views/notice/noticeWriteForm.jsp';">새 공지글 등록</button>
</div>
<br>
<table class="table table-striped">
<tr>
	<th>번호</th>
	<th>제목</th>
	<th>작성자</th>
	<th>첨부파일</th>
	<th>날짜</th>
	<th>내용</th>
</tr>
<% for(Notice n : list) { %>
<tr>
	<td><%= n.getNoticeNo() %></td>
	<td><a href="/semi/ndetail.ad?noticeno=<%= n.getNoticeNo() %>"><%= n.getNoticeTitle() %></a></td>
	<td><%= n.getAdminId() %></td>
	<td align="center">
		<% if(n.getNoticeOriginalImage() != null) { %>
			◎
		<% } else { %>
			&nbsp;
		<% } %>
	</td>
	<td><%= n.getNoticeDate() %></td>
	<td><%= n.getNoticeContent() %></td>
</tr>
<% } %>
</table>
<br>
<input type="button" value="메인으로" onclick="javascript:history.go(-1); return false;">
<div style="text-align:center;">
	<% if(currentPage <= 1) { %>
		[맨처음]&nbsp;
	<% } else { %>
		<a href="/semi/nlist.ad?page=1">[맨처음]</a>&nbsp;
	<% } %>
	
	<!-- 이전 페이지 그룹으로 이동 -->
	<% if((currentPage - 10) < startPage && 
			(currentPage - 10) > 1) { %>
		<a href="/semi/nlist.ad?page=<%= startPage - 10 %>">[이전그룹]</a> &nbsp;
	<% } else { %>
		[이전그룹] &nbsp;
	<% } %>
	
	<!-- 현재 페이지 그룹의 페이지 숫자 출력 -->
	<% for(int p = startPage; p <= endPage; p++) { 
		if(p == currentPage) { %>
		
		<font color="red" size="4"><b>[<%= p %>]</b></font>
		<% } else { %>
			<a href="/semi/nlist.ad?page=<%= p %>"><%= p %></a>
			
	<% }} %>
	
	<!-- 다음 페이지 그룹으로 이동 -->
	<% if((currentPage + 10) > endPage && 
			(currentPage + 10 < maxPage)) { %>
		<a href="/semi/nlist.ad?page=<%= endPage + 10 %>">[다음그룹]</a> &nbsp;
	<% } else { %>
		[다음그룹] &nbsp;
	<% } %>
	
	<% if(currentPage >= maxPage) { %>
		[맨끝]&nbsp;
	<% } else { %>
		<a href="/semi/nlist.ad?page=<%= maxPage %>">[맨끝]</a>&nbsp;
	<% } %>
</div>
<hr>
<%@ include file="../common/footer.jsp" %>
</body>
</html>