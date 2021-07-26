<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- 관리자용 상품 리스트 전체 페이지 -->    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
.sportsvideo{
	display: flex;
	justify-content: center;
	align-content: space-around;
	flex-wrap:wrap;
	padding-top:30px;
	padding-bottom:20px;
	margin:10px;
	text-align:center;
	font-size:13px;
}
.sportsvideo img{
	width: 300px;
	height: 300px;
}
div#sv1{
	width: 25%;
}
</style>
</head>
<body>
<%@ include file="../common/menubar.jsp" %>
<hr>
<%@ include file="./sportsvideoCommon.jsp" %>
<hr>

<div class="sportsvideo">
	<div class="button" id="sv1">
		<a href="https://www.youtube.com/watch?v=zjfGs_iIIE8" class="link"><img src="../../resources/images/pt1.PNG"></a>
		<a href="https://www.youtube.com/watch?v=d5FA5IxK74Q" class="link"><img src="../../resources/images/pt3.PNG"></a>
		<a href="https://www.youtube.com/watch?v=pXzEw2D8bds" class="link"><img src="../../resources/images/pt4.PNG"></a>
		<a href="https://www.youtube.com/watch?v=ziG_WyELn3I" class="link"><img src="../../resources/images/pt7.PNG"></a>
		<a href="https://www.youtube.com/watch?v=_TjGTxG7EFE" class="link"><img src="../../resources/images/pt10.PNG"></a>
	</div>
</div>
<hr>
<%@ include file="../common/footer.jsp" %>
</body>
</html>