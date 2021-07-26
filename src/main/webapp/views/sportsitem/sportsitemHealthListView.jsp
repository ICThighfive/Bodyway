<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- 헬스기구 리스트 페이지 -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
.sportsitem{
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
.sportsitem img{
	width: 300px;
	height: 300px;
}
.si1{
	width: 25%;
}
</style>
</head>
<body>
<%@ include file="../common/menubar.jsp" %>
<hr>
<%@ include file="./sportsitemCommon.jsp" %>
<hr>
<div class="sportsitem">
	<div class="si1">
		<a href="sportsitemDetailView.jsp"><img src="../../resources/images/health1.PNG"></a>
		<a href="sportsitemDetailView.jsp"><img src="../../resources/images/health2.PNG"></a>
		<a href="sportsitemDetailView.jsp"><img src="../../resources/images/health4.PNG"></a>
		<a href="sportsitemDetailView.jsp"><img src="../../resources/images/health6.PNG"></a>
		<a href="sportsitemDetailView.jsp"><img src="../../resources/images/health8.PNG"></a>
	</div>
</div>
<hr>
<%@ include file="../common/footer.jsp" %>
</body>
</html>