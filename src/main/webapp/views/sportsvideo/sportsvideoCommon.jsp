<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- 운동영상 공통 상단바 -->    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
ul li{
	list-style:none;
	float:left;
	margin-left:20px;
	width: 120px;
}

a{
	text-decoration:none;
	color:#000000;
}
</style>
</head>
<body>
<h2 align="left">운동영상</h2>
<ul id="sportsvideo">
	<li><a href="sportsvideoListView.jsp">전체</a></li>
	<li><a href="sportsvideoPtListView.jsp">헬스/PT</a></li>
	<li><a href="sportsvideoHomeListView.jsp">홈트레이닝</a></li>
	<li><a href="sportsvideoYogaListView.jsp">요가/필라테스</a></li>
	<li><a href="sportsvideoStretchListView.jsp">스트레칭</a></li>
	<li><a href="sportsvideoEtcListView.jsp">기타</a></li>
</ul>
</body>
</html>