<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- 관리자용 상품 리스트 전체 페이지 -->    
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
.si1, .si2, .si3{
	width: 25%;
}
</style>
<script type="text/javascript">
<!-- 관리자용 상품 리스트 전체 페이지에서 글 등록하기 페이지로 넘어감. 글의 등록은 전체 리스트 페이지에서만 가능 -->
function goWriteForm(){
	location.href = "sportsitemAdminWriteForm.jsp";
}
</script>
</head>
<body>
<%@ include file="../common/menubar.jsp" %>
<hr>
<%@ include file="./sportsitemCommon.jsp" %>
<hr>
<div style="align:center;text-align:center;">
	<button onclick="goWriteForm();">글 등록하기</button>
</div>
<div class="sportsitem">
	<div class="si1">
		<a href="sportsitemAdminDetailView.jsp"><img src="../../resources/images/health1.PNG"></a>
		<a href="sportsitemAdminDetailView.jsp"><img src="../../resources/images/health4.PNG"></a>
		<a href="sportsitemAdminDetailView.jsp"><img src="../../resources/images/props1.PNG"></a>
		<a href="sportsitemAdminDetailView.jsp"><img src="../../resources/images/props4.PNG"></a>
		<a href="sportsitemAdminDetailView.jsp"><img src="../../resources/images/accessory1.PNG"></a>
	</div>
	<div class="si2">
		<a href="sportsitemAdminDetailView.jsp"><img src="../../resources/images/accessory6.jpg"></a>
		<a href="sportsitemAdminDetailView.jsp"><img src="../../resources/images/accessory4.jpg"></a>
		<a href="sportsitemAdminDetailView.jsp"><img src="../../resources/images/props6.PNG"></a>
		<a href="sportsitemAdminDetailView.jsp"><img src="../../resources/images/health6.PNG"></a>
		<a href="sportsitemAdminDetailView.jsp"><img src="../../resources/images/health8.PNG"></a>
	</div>
	<div class="si3">
		<a href="sportsitemAdminDetailView.jsp"><img src="../../resources/images/health2.PNG"></a>
		<a href="sportsitemAdminDetailView.jsp"><img src="../../resources/images/props2.PNG"></a>
		<a href="sportsitemAdminDetailView.jsp"><img src="../../resources/images/props10.PNG"></a>
		<a href="sportsitemAdminDetailView.jsp"><img src="../../resources/images/accessory2.PNG"></a>
		<a href="sportsitemAdminDetailView.jsp"><img src="../../resources/images/accessory5.jpg"></a>
	</div>
</div>
<hr>
<%@ include file="../common/footer.jsp" %>
</body>
</html>