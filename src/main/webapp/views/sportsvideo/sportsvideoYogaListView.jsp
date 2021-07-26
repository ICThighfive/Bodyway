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
div#sv3{
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
	<div class="button" id="sv3">
		<a href="https://www.youtube.com/watch?v=1W9gMxLoW6Q" class="link"><img src="../../resources/images/yoga1.PNG"></a>
		<a href="https://www.youtube.com/watch?v=OBTl49bVk94" class="link"><img src="../../resources/images/yoga2.PNG"></a>
		<a href="https://www.youtube.com/watch?v=ZgBfmJfE1Sk" class="link"><img src="../../resources/images/yoga3.PNG"></a>
		<a href="https://www.youtube.com/watch?v=sb51gF18cYo" class="link"><img src="../../resources/images/yoga5.PNG"></a>
		<a href="https://www.youtube.com/watch?v=gbZwjeX3-hk" class="link"><img src="../../resources/images/yoga6.PNG"></a>
	</div>
</div>
<hr>
<%@ include file="../common/footer.jsp" %>
</body>
</html>