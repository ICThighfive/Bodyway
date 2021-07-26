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
div#sv4{
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
	<div class="button" id="sv4">
		<a href="https://www.youtube.com/watch?v=XzFYxbLNApQ" class="link"><img src="../../resources/images/stretch1.PNG"></a>
		<a href="https://www.youtube.com/watch?v=At2RJXtYJKk" class="link"><img src="../../resources/images/stretch2.PNG"></a>
		<a href="https://www.youtube.com/watch?v=1biTV8xgf4c" class="link"><img src="../../resources/images/stretch3.PNG"></a>
		<a href="https://www.youtube.com/watch?v=fpsmtVR3pPo" class="link"><img src="../../resources/images/stretch4.PNG"></a>
		<a href="https://www.youtube.com/watch?v=QjXBDQpzHVc" class="link"><img src="../../resources/images/stretch5.PNG"></a>
	</div>
</div>
<hr>
<%@ include file="../common/footer.jsp" %>
</body>
</html>