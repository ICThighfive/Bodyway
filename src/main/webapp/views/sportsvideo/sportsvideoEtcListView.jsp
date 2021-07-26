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
div#sv5{
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
	<div class="button" id="sv5">
		<a href="https://www.youtube.com/watch?v=d1EE-2n_86w" class="link"><img src="../../resources/images/etc1.PNG"></a>
		<a href="https://www.youtube.com/watch?v=8UXHFVSJeh8" class="link"><img src="../../resources/images/etc2.PNG"></a>
		<a href="https://www.youtube.com/watch?v=vfgvVcxV3lA" class="link"><img src="../../resources/images/etc5.PNG"></a>
		<a href="https://www.youtube.com/watch?v=bPWqO20Xzco" class="link"><img src="../../resources/images/etc6.PNG"></a>
		<a href="https://www.youtube.com/watch?v=O0sU2ob6tpY" class="link"><img src="../../resources/images/etc8.PNG"></a>
	</div>
</div>
<hr>
<%@ include file="../common/footer.jsp" %>
</body>
</html>