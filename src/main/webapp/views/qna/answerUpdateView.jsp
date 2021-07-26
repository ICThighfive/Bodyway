<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>BodyWay Admin</title>
</head>
<body>
<hr>
<%@ include file="../common/menubar.jsp" %>
<h1 align="center">답변 수정 페이지</h1>
<br>
<!-- form 에서 입력값들과 파일을 함께 전송하려면 
반드시 속성을 추가해야 함 : enctype="multipart/form-data" -->
<form action="" method="post" enctype="multipart/form-data">
<input type="hidden" name="no" value="">
<input type="hidden" name="ofile" value="">
<input type="hidden" name="rfile" value="">
<table class="table table-bordered">
<tr><th>제 목</th><td><input type="text" name="title" size="50" 
	value=""></td></tr>
<tr><th>작성자</th><td><input type="text" name="writer" readonly 
	value=""></td></tr>
<tr><th>첨부파일</th>
	<td>
		첨부된 파일 없음 <br>
	</td></tr>
<tr><th>내 용</th>
	<td><textarea rows="5" cols="50" name="content">1234</textarea></td></tr>
<tr><th colspan="2">
<div class="col text-center">
	<input type="submit" class="btn btn-outline-primary btn-sm" value="수정하기"> &nbsp;
	<input type="reset" class="btn btn-outline-primary btn-sm" value="수정취소"> &nbsp;
	<input type="button" class="btn btn-outline-primary btn-sm" value="이전페이지로 이동" onclick="javascript:history.go(-1); return false;"> &nbsp;
	<input type="button" class="btn btn-outline-primary btn-sm" value="목록" onclick="javascript:location.href='/semi/views/qna/qnaListView.jsp'; return false;"> &nbsp;
</div>
</th></tr>
</table>
</form>
<hr>
<%@ include file="../common/footer.jsp" %>
</body>
</html>