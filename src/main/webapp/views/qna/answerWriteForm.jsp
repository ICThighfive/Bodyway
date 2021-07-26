<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>BodyWay Admin</title>
</head>
<body>
<%@ include file="../common/menubar.jsp" %>
<hr>
<h1 align="center">새 답변 등록 페이지</h1>
<br>
<!-- form 에서 입력값들과 파일을 함께 전송하려면 
반드시 속성을 추가해야 함 : enctype="multipart/form-data" -->
<form action="" method="post" enctype="multipart/form-data">
<table class="table table-bordered">
<tr><th>제 목</th><td><input type="text" name="title" size="50"></td></tr>
<tr><th>작성자</th><td><input type="text" name="writer" readonly 
	value=""></td></tr>
<tr><th>첨부파일</th><td><input type="file" name="ofile"></td></tr>
<tr><th>내 용</th>
	<td><textarea rows="5" cols="50" name="content"></textarea></td></tr>
<tr><th colspan="2">
<div class="col text-center">
	<input type="submit" class="btn btn-primary" value="등록하기"> &nbsp;
	<input type="reset" class="btn btn-danger" value="작성취소"> &nbsp;
	<input type="button" class="btn btn-outline-primary btn-sm" value="목록" onclick="javascript:history.go(-1); return false;">
</div>
</th></tr>
</table>
</form>
<hr>
<%@ include file="../common/footer.jsp" %>
</body>
</html>