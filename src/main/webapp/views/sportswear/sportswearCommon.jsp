<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- 스포츠웨어 공통 상단바 -->    
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
<h2 align="left">스포츠웨어</h2>
<ul id="sportswear">
	<li><a href="sportswearListView.jsp">전체</a></li>
	<li><a href="sportswearMenListView.jsp">남성</a></li>
	<li><a href="sportswearWomenListView.jsp">여성</a></li>
	<li><a href="sportswearKidsListView.jsp">키즈</a></li>
</ul>
</body>
</html>