<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Bodyway</title>
<style type="text/css">
h1 a { 
	text-decoration: none;
	color: #333333;
	font: sans-serif;
	font-weight: bold;
}
table.cmlist{ 
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

</style>
</head>
<body>
<%@ include file="../common/menubar.jsp" %>
<hr>
<center>
<br>
<h1><a href="communityMain.jsp">커뮤니티 👬</a></h1>
<br>

<!-- 테이블 안에 있는 <a>의 href와 <img>의src 속성은 추후 DB에서 샘플데이터 연결 후 자동으로 가져올수 있도록 수정하겠습니다. -->

<table class="cmlist" cellspacing="10" cellpadding="10" align="center">
	<tr class="imgtag">
		<td><a href="communityDetailView.jsp"><img src="../../resources/images/community_1.jpg" width="300" height="180"></a></td>
		<td><a href="communityDetailView.jsp"><img src="../../resources/images/community_2.jpg" width="300" height="180"></a></td>
		<td><a href="communityDetailView.jsp"><img src="../../resources/images/community_3.jpg" width="300" height="180"></a></td>
	</tr>
	<tr>
		<td><a href="communityDetailView.jsp">한강 조깅/런닝메이트 해요!!</a></td>
		<td><a href="communityDetailView.jsp">릴렉스 릴렉스~ 함께해요 요가! :)</a></td>
		<td><a href="communityDetailView.jsp">3대 500!! 나와라!! 도전!</a></td>
	</tr>
	<tr>
		<td><a href="communityDetailView.jsp"><img src="../../resources/images/community_4.jpg" width="300" height="180"></a></td>
		<td><a href="communityDetailView.jsp"><img src="../../resources/images/community_5.jpg" width="300" height="180"></a></td>
		<td><a href="communityDetailView.jsp"><img src="../../resources/images/community_6.jpg" width="300" height="180"></a></td>
	</tr>
	<tr>
		<td><a href="communityDetailView.jsp">건강한 식단 공유 모임입니다~</a></td>
		<td><a href="communityDetailView.jsp">나를 따르라~!! 등산 원정대</a></td>
		<td><a href="communityDetailView.jsp">헬스/PT 정보 공유합니당:)</a></td>
	</tr>
	<tr>
		<td><a href="communityDetailView.jsp"><img src="../../resources/images/community_7.jpg" width="300" height="180"></a></td>
		<td><a href="communityDetailView.jsp"><img src="../../resources/images/community_8.jpg" width="300" height="180"></a></td>
		<td><a href="communityDetailView.jsp"><img src="../../resources/images/community_9.jpg" width="300" height="180"></a></td>
	</tr>
	<tr>
		<td><a href="communityDetailView.jsp">키즈 축구교실</a></td>
		<td><a href="communityDetailView.jsp">해안길따라 자전거여행</a></td>
		<td><a href="communityDetailView.jsp">박태환 저리가라!</a></td>
	</tr>
</table>


</center>
<hr>
<%@ include file="../common/footer.jsp" %>


</body>
</html>