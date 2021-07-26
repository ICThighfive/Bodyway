<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
</tr>

<tr>
	<td>1</td>
	<td><a href="/semi/views/qna/questionDetailView.jsp">123</a></td>
	<td>123</td>
	<td align="center">
		
	</td>
	<td>1234</td>
</tr>

<tr>
	<th>답변</th>
	<td>
	▶
	<a href="/semi/views/qna/answerDetailView.jsp">답변제목</a>
	</td>
	<td>답변작성자</td>
	<td>첨부파일
		
	</td>
	<td>작성일</td>
</tr>
</table>
<br>
<input type="button" value="메인으로" onclick="javascript:history.go(-1); return false;">
<hr>
<%@ include file="../common/footer.jsp" %>
</body>
</html>