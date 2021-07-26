<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- 키즈웨어 리스트 페이지 -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
.sportswear{
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
.sportswear img{
	width: 300px;
	height: 300px;
}
.sw1{
	width: 25%;
}
</style>
</head>
<body>
<%@ include file="../common/menubar.jsp" %>
<hr>
<%@ include file="./sportswearCommon.jsp" %>
<hr>
<div class="sportswear">
	<div class="sw1">
		<a href="sportswearDetailView.jsp"><img src="../../resources/images/kids1.PNG"></a>
		<a href="sportswearDetailView.jsp"><img src="../../resources/images/kids4.PNG"></a>
		<a href="sportswearDetailView.jsp"><img src="../../resources/images/kids5.PNG"></a>
		<a href="sportswearDetailView.jsp"><img src="../../resources/images/kids7.PNG"></a>
		<a href="sportswearDetailView.jsp"><img src="../../resources/images/kids8.PNG"></a>
	</div>
</div>
<hr>
<%@ include file="../common/footer.jsp" %>
</body>
</html>