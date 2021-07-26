<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.ArrayList, diary.model.vo.Diary, java.sql.Date" %>
<%
	ArrayList<Diary> list = (ArrayList<Diary>)request.getAttribute("list");
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
<h1 align="center">운동일지</h1>
<br>
<table class="table table-striped">
<tr>
	<th>번호</th>
	<th>제목</th>
	<th>첨부파일</th>
	<th>날짜</th>
</tr>
<% for(Diary d : list) { %>
<tr>
	<td><%= d.getDiaryNo() %></td>
	<td><a href="/semi/ddetail?diaryno=<%= d.getDiaryNo() %>"><%= d.getDiaryTitle() %></a></td>
	<td align="center">
		<% if(d.getDiaryOriginalImage() != null) { %>
			◎
		<% } else { %>
			&nbsp;
		<% } %>
	</td>
	<td><%= d.getDiaryDate() %></td>
</tr>
<% } //list : for each %>
</table>
<br>
<input type="button" value="메인으로" onclick="javascript:history.go(-1); return false;">
<input type="button" value="글쓰기" onclick="javascript:location.href='/semi/views/diary/diaryWriteForm.jsp';">
<hr>
<%@ include file="../common/footer.jsp" %>
</body>
</html>