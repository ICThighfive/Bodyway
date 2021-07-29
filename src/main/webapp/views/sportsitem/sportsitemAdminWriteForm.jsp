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
<%@ include file="./sportsitemCommon.jsp" %>
<hr>
<h1 align="center">새 제품 등록 페이지</h1>
<br>
<!-- form 에서 입력값들과 파일을 함께 전송하려면
반드시 속성을 추가해야 함 : enctype="multipart/form-data" -->
<form action="/semi/siinsert.ad" method="post" enctype="multipart/form-data">
<table align="center" width="600" border="1" cellspacing="0" cellpadding="5">
<tr><th>상품명</th><td><input type="text" name="title" size="50"></td></tr>
<tr><th width="140">운동용품 소분류</th>
      <td>
            <input type="radio" name="category" value="헬스기구"> 헬스기구 &nbsp;
            <input type="radio" name="category" value="운동소품"> 운동소품 &nbsp;
            <input type="radio" name="category" value="악세사리"> 악세사리
      </td></tr>
<tr><th>첨부파일</th><td><input type="file" name="ofile"></td></tr>
<tr><th>상세정보</th>
	<td><textarea rows="5" cols="50" name="detail"></textarea></td></tr>
<tr><th>상품구매링크</th><td><input type="text" name="url" size="50"></td></tr>
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