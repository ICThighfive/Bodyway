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
div#sv2{
	width: 25%;
}
div#sv3{
	width: 25%;
}
div#sv4{
	width: 25%;
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
	<div class="button" id="sv1">
		<a href="https://www.youtube.com/watch?v=zjfGs_iIIE8" class="link"><img src="../../resources/images/pt1.PNG"></a>
		<a href="https://www.youtube.com/watch?v=d5FA5IxK74Q" class="link"><img src="../../resources/images/pt3.PNG"></a>
		<a href="https://www.youtube.com/watch?v=pXzEw2D8bds" class="link"><img src="../../resources/images/pt4.PNG"></a>
		<a href="https://www.youtube.com/watch?v=ziG_WyELn3I" class="link"><img src="../../resources/images/pt7.PNG"></a>
		<a href="https://www.youtube.com/watch?v=_TjGTxG7EFE" class="link"><img src="../../resources/images/pt10.PNG"></a>
	</div>
	<div class="button" id="sv2">
		<a href="https://www.youtube.com/watch?v=myNjmnvI6x0" class="link"><img src="../../resources/images/home1.PNG"></a>
		<a href="https://www.youtube.com/watch?v=gMaB-fG4u4g" class="link"><img src="../../resources/images/home2.PNG"></a>
		<a href="https://www.youtube.com/watch?v=cjbrbgbvaeI" class="link"><img src="../../resources/images/home3.PNG"></a>
		<a href="https://www.youtube.com/watch?v=2swcod5RYvU" class="link"><img src="../../resources/images/home4.PNG"></a>
		<a href="https://www.youtube.com/watch?v=4EKo44DUvjg" class="link"><img src="../../resources/images/home5.PNG"></a>
	</div>
	<div class="button" id="sv3">
		<a href="https://www.youtube.com/watch?v=1W9gMxLoW6Q" class="link"><img src="../../resources/images/yoga1.PNG"></a>
		<a href="https://www.youtube.com/watch?v=OBTl49bVk94" class="link"><img src="../../resources/images/yoga2.PNG"></a>
		<a href="https://www.youtube.com/watch?v=ZgBfmJfE1Sk" class="link"><img src="../../resources/images/yoga3.PNG"></a>
		<a href="https://www.youtube.com/watch?v=sb51gF18cYo" class="link"><img src="../../resources/images/yoga5.PNG"></a>
		<a href="https://www.youtube.com/watch?v=gbZwjeX3-hk" class="link"><img src="../../resources/images/yoga6.PNG"></a>
	</div>
	<div class="button" id="sv4">
		<a href="https://www.youtube.com/watch?v=XzFYxbLNApQ" class="link"><img src="../../resources/images/stretch1.PNG"></a>
		<a href="https://www.youtube.com/watch?v=At2RJXtYJKk" class="link"><img src="../../resources/images/stretch2.PNG"></a>
		<a href="https://www.youtube.com/watch?v=1biTV8xgf4c" class="link"><img src="../../resources/images/stretch3.PNG"></a>
		<a href="https://www.youtube.com/watch?v=fpsmtVR3pPo" class="link"><img src="../../resources/images/stretch4.PNG"></a>
		<a href="https://www.youtube.com/watch?v=QjXBDQpzHVc" class="link"><img src="../../resources/images/stretch5.PNG"></a>
	</div>
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