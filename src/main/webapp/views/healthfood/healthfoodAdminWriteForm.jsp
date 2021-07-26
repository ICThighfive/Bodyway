<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- 관리자용 글 등록페이지 -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%@ include file="../common/menubar.jsp" %>
<hr>
<%@ include file="./healthfoodCommon.jsp" %>
<hr>
<h1 align="center">새 제품 등록 페이지</h1>
<br>
<!-- form 에서 입력값들과 파일을 함께 전송하려면
반드시 속성을 추가해야 함 : enctype="multipart/form-data" -->
<form action="" method="post" enctype="multipart/form-data">
<table align="center" width="600" border="1" cellspacing="0" cellpadding="5">
<tr><th>상품명</th><td><input type="text" name="title" size="50"></td></tr>
<tr><th>작성자</th><td><input type="text" name="writer" readonly value=""></td></tr>
<tr><th><label for="healthfood">음식 소분류</label></th><td>
<select name="healthfood" id="healthfood">
	<option vlaue="dak">닭가슴살</option>
	<option vlaue="lunch">간편 도시락</option>
	<option vlaue="protein">프로틴</option>
	<option vlaue="snack">간식</option>
	<option vlaue="supplement">건강보조제품</option>
</select>
</td></tr>
<tr><th>첨부파일</th><td><input type="file" name="ofile"></td></tr>
<tr><th>상세정보</th>
	<td><textarea rows="5" cols="50" name="content"></textarea></td></tr>
<th>상품구매링크</th><td><input type="text" name="itemlink" size="50"></td></tr>
<tr><th colspan="2">
	<input type="submit" value="등록하기">	&nbsp;
	<input type="reset" value="작성취소"> &nbsp;
	<input type="button" value="목록" onclick="javascript:history.go(-1); return false;">
</th></tr>
</table>
</form>
<hr>
<%@ include file="../common/footer.jsp" %>
</body>
</html>