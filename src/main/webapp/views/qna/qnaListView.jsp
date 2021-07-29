<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.ArrayList, qna.model.vo.Question, qna.model.vo.Answer" %>
<%
	ArrayList<Question> list = (ArrayList<Question>)request.getAttribute("list");
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
<h1 align="center">QnA</h1>
<div style="text-align: center;">
	<button onclick="javascript:location.href='/semi/views/qna/questionWriteForm.jsp';">질문하기</button>
</div>
<br>
<table class="table table-striped">
<tr>
	<th>번호</th>
	<th>제목</th>
	<th>작성자</th>
	<th>첨부파일</th>
	<th>날짜</th>
	<th>조회수</th>
</tr>

<% for(Question q : list) { %>
<tr>
	<th><%= q.getQnaNo() %></th>
	<td>
	<a href="/semi/qdetail?qqno=<%= q.getQnaNo() %>"><%= q.getQqTitle() %></a>
	</td>
	<td><%= q.getUserId() %></td>
	<td>
		<% if(q.getQqOriginalImage() != null) { %>
			◎
		<% } else { %>
			&nbsp;
		<% } %>
	</td>
	<td><%= q.getQqDate() %></td>
	<td><%= q.getQqReadCount() %></td>
</tr>
<% } %>
</table>
<br>
<input type="button" value="메인으로" onclick="javascript:history.go(-1); return false;">
<hr>
<%@ include file="../common/footer.jsp" %>
</body>
</html>