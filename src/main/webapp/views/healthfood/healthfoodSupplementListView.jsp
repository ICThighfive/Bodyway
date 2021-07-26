<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- 건강보조제품 리스트 페이지 -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
.healthfood{
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
.healthfood img{
	width: 300px;
	height: 300px;
}
.hf1{
	width: 25%;
}
</style>
</head>
<body>
<%@ include file="../common/menubar.jsp" %>
<hr>
<%@ include file="./healthfoodCommon.jsp" %>
<hr>
<div class="healthfood">
	<div class="hf1">
		<a href="healthfoodDetailView.jsp"><img src="../../resources/images/supplement2.PNG"></a>
		<a href="healthfoodDetailView.jsp"><img src="../../resources/images/supplement3.PNG"></a>
		<a href="healthfoodDetailView.jsp"><img src="../../resources/images/supplement5.PNG"></a>
		<a href="healthfoodDetailView.jsp"><img src="../../resources/images/supplement7.PNG"></a>
		<a href="healthfoodDetailView.jsp"><img src="../../resources/images/supplement10.PNG"></a>
	</div>
</div>
<hr>
<%@ include file="../common/footer.jsp" %>
</body>
</html>