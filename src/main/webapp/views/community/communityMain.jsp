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
table tr#id1 {
	font-weight: bold;
	font-size: 25pt;
	color: #333333;
}
table#tb1 tr td button{
	color: white;
	background-color: rgb(52, 152, 219);
	border: none;
	font-size: 15pt;
	line-height: 40px;
	padding: 3px 115px;
	border-radius: 10px;
}
table#tb2 tr td h3{
	font-weight: bold;
	color: #333333;
}
table#tb2 tr td a {
	text-decoration: none;
	color: #333333;
	font-weight: bold;
	font-size: 13pt;
	width: 300;
	height: 50;
	text-align: center;
}
table#tb2 tr td button{
	color: white;
	background-color: rgb(52, 152, 219);
	border: none;
	font-size: 12pt;
	line-height: 35px;
	padding: 0px 35px;
	border-radius: 10px;
}
</style>
</head>
<body>
<%@ include file="../common/menubar.jsp" %>
<hr>
<br>
<h1 align="center"><a href="communityMain.jsp">커뮤니티 👬</a></h1>
<br>
<table align="center" width="950" height="250" id="tb1">
	<tr align="center" id="id1">
		<td>함께 운동할 메이트를<br>찾아보아요!<br>
			<button onclick="javascript:location.href='/semi/views/community/communityListView.jsp';">모임 보기</button></td>
		<td>원하는 모임이 없다면?<br>직접 만들어봐요!<br>
			<button onclick="javascript:location.href='/semi/views/community/communityApplication.jsp';">모임 만들기</button></td>
	</tr>
</table>
<br>
<hr>
<br>

<!-- 임의로 이미지 삽입 정렬. user 관심사에 따라 맞춤형 모임 정렬 코드로 변경 예정 -->
<table align="center" width="950" height="280" id="tb2">
	<tr>
		<td><h3 align="left">이런 모임은 어떠세요?</h3></td>
		<td>&nbsp;</td>
		<td align="right" class="bt"><button>내 취향에 맞는 모임 더보기</button></td>
	</tr>
	<tr align="center">
		<td><a href="communityDetailView.jsp"><img src="../../resources/images/community_4.jpg" width="300" height="180"></a></td>
		<td><a href="communityDetailView.jsp"><img src="../../resources/images/community_6.jpg" width="300" height="180"></a></td>
		<td><a href="communityDetailView.jsp"><img src="../../resources/images/community_2.jpg" width="300" height="180"></a></td>
	</tr>
	<tr align="center">
		<td><a href="communityDetailView.jsp">건강한 식단 공유 모임입니다~</a></td>
		<td><a href="communityDetailView.jsp">헬스/PT 정보 공유합니당:)</a></td>
		<td><a href="communityDetailView.jsp">릴렉스 릴렉스~ 함께해요 요가! :)</a></td>
	</tr>
</table>


<!-- 페이징 처리 영역 -->







<br> <!-- br은 추후 삭제 예정 ↓ -->
<br>
<br>


<hr>
<%@ include file="../common/footer.jsp" %>
</body>
</html>