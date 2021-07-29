<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="notice.model.vo.Notice"%>
<%
	Notice notice = (Notice)request.getAttribute("notice");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>BodyWay Admin</title>
</head>
<body>
<hr>
<%@ include file="../common/menubar.jsp" %>
<h1 align="center"><%= notice.getNoticeNo() %>번 공지글 수정 페이지</h1>
<br>
<!-- form 에서 입력값들과 파일을 함께 전송하려면 
반드시 속성을 추가해야 함 : enctype="multipart/form-data" -->
<form action="/semi/nupdate" method="post" enctype="multipart/form-data">
<input type="hidden" name="no" value="<%= notice.getNoticeNo() %>">
<input type="hidden" name="ofile" value="<%= notice.getNoticeOriginalImage() %>">
<input type="hidden" name="rfile" value="<%= notice.getNoticeRenameImage() %>">
<table class="table table-bordered">
<tr><th>제 목</th><td><input type="text" name="title" size="50" 
	value="<%= notice.getNoticeTitle() %>"></td></tr>
<tr><th>첨부파일</th>
	<td>
		<% if(notice.getNoticeOriginalImage() != null) { %>
			<%= notice.getNoticeOriginalImage() %> &nbsp;
			<input type="checkbox" name="deleteFlag" value="yes"> 파일삭제 <br>
			변경 : <input type="file" name="upfile">
		<% } else { %>
			첨부된 파일 없음 <br>
			추가 : <input type="file" name="upfile">
		<% } %>
	</td>
</tr>
<tr><th>내 용</th>
	<td><textarea rows="5" cols="50" name="content"><%= notice.getNoticeContent() %></textarea></td></tr>
<tr><th colspan="2">
<div class="col text-center">
	<input type="submit" class="btn btn-outline-primary btn-sm" value="수정하기"> &nbsp;
	<input type="reset" class="btn btn-outline-primary btn-sm" value="수정취소"> &nbsp;
	<input type="button" class="btn btn-outline-primary btn-sm" value="이전페이지로 이동" onclick="javascript:history.go(-1); return false;"> &nbsp;
	<input type="button" class="btn btn-outline-primary btn-sm" value="목록" onclick="javascript:location.href='/semi/nlist.ad'; return false;"> &nbsp;
</div>
</th></tr>
</table>
</form>
<hr>
<%@ include file="../common/footer.jsp" %>
</body>
</html>