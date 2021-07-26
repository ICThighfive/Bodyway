<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- 운동용품 공통 상단바 -->    
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
	width: 100px;
}

a{
	text-decoration:none;
	color:#000000;
}
</style>
</head>
<body>
<h2 align="left">운동용품</h2>
<ul id="sportsitem">
	<li><a href="sportsitemListView.jsp">전체</a></li>
	<li><a href="sportsitemHealthListView.jsp">헬스기구</a></li>
	<li><a href="sportsitemPropsListView.jsp">운동소품</a></li>
	<li><a href="sportsitemAccessoryListView.jsp">악세사리</a></li>
</ul>
</body>
</html>