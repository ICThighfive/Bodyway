<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="notice.model.vo.Notice"%>
<%
	Notice notice = (Notice)request.getAttribute("notice");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>BodyWay</title>
</head>
<body>
<%@ include file="../common/menubar.jsp" %>
<hr>
<h2 align="center"><%= notice.getNoticeNo() %>번 공지글 상세보기</h2>
<br>

<table class="table table-bordered" border=1>
<tr>
<th>제 목</th>
<td><%= notice.getNoticeTitle() %></td>
</tr>
<tr>
<th>작성자</th>
<td><%= notice.getAdminId() %></td>
</tr>
<tr>
<th>등록날짜</th>
<td><%= notice.getNoticeDate() %></td>
</tr>
<tr>
<th>첨부파일</th>
	<td>
		<% if(notice.getNoticeOriginalImage() != null) { %>
			<%-- <a href="/first/nfdown?ofile=<%= diary.getDiaryOriginalImage() %>&rfile=<%= diary.getDiaryRenameImage() %>"><%= diary.getDiaryOriginalImage() %></a> --%>
		<% } else { %>
			&nbsp;
		<% } %>
	</td>
</tr>
<tr>
<th>내용</th>
<td><%= notice.getNoticeContent() %></td>
</tr>
<tr>
<td colspan="2"><button onclick="javascript:history.go(-1);">목록</button>
</td>
</tr>
</tbody>
</table>
<hr>
<%@ include file="../common/footer.jsp" %>
</body>
</html>