<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!-- 모임 전체 리스트 조회 페이지 -->
<%@ page import="community.model.vo.Community, java.util.ArrayList"%>
<%
   ArrayList<Community> list = (ArrayList<Community>)request.getAttribute("list");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Bodyway</title>

<!-- 부트스트랩 // 이거 3줄 없으면 컨테이너 태그 안먹음 -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>

<style type="text/css">
h1 a {
	text-decoration: none;
	color: #333333;
	font: sans-serif;
	font-weight: bold;
}

.tb thead {
	border: 1px;
	font-weight: bolder;
	color: #4D5B67;
}

<!--
table.cmlisttb {
	position: relative;
	text-align: center;
}

table tr td a {
	text-decoration: none;
	color: #333333;
	font: sans-serif;
	font-weight: bold;
	font-size: 15pt;
	width: 300;
	height: 50;
}
-->
</style>
</head>
<body>
	<%@ include file="../common/menubar.jsp"%>
	<hr>
	<center>
		<br>
		<h1>
			<a href="communityMain.jsp">커뮤니티 👬</a>
		</h1>
		<br>
		<div class="container-fluid w-100">
			<div class="row">
				<% for(Community cm : list){ %>		<!-- 리스트 받아오는 for each문 작성 -->
				<div class="col-lg-4">	<!-- img 1개 = 4/12 -->
					<a href="/semi/cmdetail?=" class="thumbnail"> <!-- detail 서블릿 매핑한 이름 -->
						<img src="/semi/resources/images/<%= cm.getcOriginalImage() %>" style="width: 100%"> <!-- 이미지 -->
						<p style="font-size: x-large"><%= cm.getCommunityName() %></p> <!-- 모임 제목 -->
					</a>
				</div>
				<% } %>
			</div>
		</div>
	</center>
	<hr>
	<%@ include file="../common/footer.jsp"%>
</body>
</html>