<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="sportsitem.model.vo.SportsItem"%>
<!-- 관리자용 글 수정페이지 -->
<%
	SportsItem sportsitem = (SportsItem)request.getAttribute("sportsitem");
%>
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
<h1 align="center"><%= sportsitem.getSiBoardNo() %>번 수정</h1>
<!-- form 에서 입력값들과 파일을 함께 전송하려면
반드시 속성을 추가해야 함 : enctype="multipart/form-data" -->
<form action="/semi/siupdate.ad" method="post" enctype="multipart/form-data">

<input type="hidden" name="no" value="<%= sportsitem.getSiBoardNo()%>">
<input type="hidden" name="ofile" value="<%= sportsitem.getSiOriginalImage() %>">
<input type="hidden" name="rfile" value="<%= sportsitem.getSiRenameImage() %>">

<table align="center" width="600" border="1" cellspacing="0" cellpadding="5">
<tr><th>상품명</th>
<td><input type="text" name="title" size="50" value="<%= sportsitem.getSiTitle() %>"></td></tr>
<tr><th width="140">운동용품 소분류</th>
	<td>
            <input type="radio" name="category" value="헬스기구"> 헬스기구 &nbsp;
            <input type="radio" name="category" value="운동소품"> 운동소품 &nbsp;
            <input type="radio" name="category" value="악세사리"> 악세사리
      </td></tr>
	<th>첨부파일</th>
	<td>
		<% if(sportsitem.getSiOriginalImage() != null){ %>
			<%= sportsitem.getSiOriginalImage() %>	&nbsp;
			<input type="checkbox" name="deleteFlag" value="yes"> 
			파일삭제 <br>
			변경 : <input type="file" name="upfile">
		<% }else{ %>
			첨부된 파일 없음 <br>
			추가 : <input type="file" name="upfile">
		<% } %>
	</td>
</tr>
<tr><th>상세정보</th>
	<td><textarea rows="5" cols="50" name="detail"><%= sportsitem.getSiDetail() %></textarea></td></tr>
<tr><th>상품구매링크</th>
<td><input type="text" name="url" size="50" value="<%= sportsitem.getSiUrl() %>"></td></tr>
<tr><th colspan="2">
	<input type="submit" value="수정하기">	&nbsp;
	<input type="reset" value="수정취소"> &nbsp;
	<input type="button" value="이전페이지로 이동" onclick="javascript:history.go(-1); return false;">		&nbsp;
	<input type="button" value="목록" onclick="javascript:location.href='/semi/silist.ad'; return false;">		&nbsp;
</th></tr>
</table>
</form>
<br>
<hr>
<%@ include file="../common/footer.jsp" %>
</body>
</html>