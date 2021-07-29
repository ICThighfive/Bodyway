<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="sportsitem.model.vo.SportsItem"%>
 <!-- 관리자용 상품 상세정보 페이지 -->
 <%
 	SportsItem sportsitem = (SportsItem)request.getAttribute("sportsitem");
 %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
<!-- 관리자용 상세정보 페이지에서 글 수정하기 및 삭제 페이지로 넘어감 -->
function moveUpdatePage(){
	location.href = "/semi/simoveup.ad?si_board_no=<%= sportsitem.getSiBoardNo() %>";
}

function requestDelete(){
	location.href = "/semi/sidelete.ad?si_board_no=<%= sportsitem.getSiBoardNo() %>&rfile=<%= sportsitem.getSiRenameImage() %>";
}
</script>
</head>
<body>
<%@ include file="../common/menubar.jsp" %>
<hr>
<%@ include file="./sportsitemCommon.jsp" %>
<hr>
<h2 align="center"><%= sportsitem.getSiBoardNo() %>상품 상세보기</h2>
<br>
<table align="center" width="1000" border="1" cellspacing="0" cellpadding="5">
<tr><th>상품명</th><td><%= sportsitem.getSiTitle() %></td></tr>
<tr><th>소분류</th><td><%= sportsitem.getSiSubCategory() %></td></tr>
<tr><th>상세정보</th><td><%= sportsitem.getSiDetail() %></td></tr>
<tr><th>상품구매링크</th><td><a href="<%= sportsitem.getSiUrl() %>"><%= sportsitem.getSiUrl() %></a></td></tr>
<tr><th>첨부파일</th><td><img src="/semi/resources/images/<%= sportsitem.getSiOriginalImage() %>"></td></tr>

<tr><th colspan="2">
	<button onclick="moveUpdatePage(); return false;">수정페이지로 이동</button> &nbsp;
	<button onclick="requestDelete(); return false;">삭제하기</button>	&nbsp;
	<button onclick="javascript:history.go(-1);">목록</button>
</th></tr>
</table>
<hr>
<hr>
<%@ include file="../common/footer.jsp" %>
</body>
</html>