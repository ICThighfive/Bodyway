<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- 헬스푸드 공통 상단바 -->    
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
<h2 align="left">헬스푸드</h2>
<ul id="healthfood">
	<li><a href="healthfoodListView.jsp">전체</a></li>
	<li><a href="healthfoodDakListView.jsp">닭가슴살</a></li>
	<li><a href="healthfoodLunchListView.jsp">간편 도시락</a></li>
	<li><a href="healthfoodProteinListView.jsp">프로틴</a></li>
	<li><a href="healthfoodSnackListView.jsp">간식</a></li>
	<li><a href="healthfoodSupplementListView.jsp">건강보조제품</a></li>
</ul>
</body>
</html>