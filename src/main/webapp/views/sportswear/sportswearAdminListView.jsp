<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- 관리자용 상품 리스트 전체 페이지 -->    
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
.sw1, .sw2, .sw3{
	width: 25%;
}
</style>
<script type="text/javascript">
<!-- 관리자용 상품 리스트 전체 페이지에서 글 등록하기 페이지로 넘어감. 글의 등록은 전체 리스트 페이지에서만 가능 -->
function goWriteForm(){
	location.href = "sportswearAdminWriteForm.jsp";
}
</script>
</head>
<body>
<%@ include file="../common/menubar.jsp" %>
<hr>
<%@ include file="./sportswearCommon.jsp" %>
<hr>
<div style="align:center;text-align:center;">
	<button onclick="goWriteForm();">글 등록하기</button>
</div>
<div class="sportswear">
	<div class="sw1">
		<a href="sportswearAdminDetailView.jsp"><img src="../../resources/images/men1.PNG"></a>
		<a href="sportswearAdminDetailView.jsp"><img src="../../resources/images/men5.PNG"></a>
		<a href="sportswearAdminDetailView.jsp"><img src="../../resources/images/women2.PNG"></a>
		<a href="sportswearAdminDetailView.jsp"><img src="../../resources/images/women5.PNG"></a>
		<a href="sportswearAdminDetailView.jsp"><img src="../../resources/images/kids1.PNG"></a>
	</div>
	<div class="sw2">
		<a href="sportswearAdminDetailView.jsp"><img src="../../resources/images/kids5.PNG"></a>
		<a href="sportswearAdminDetailView.jsp"><img src="../../resources/images/kids8.PNG"></a>
		<a href="sportswearAdminDetailView.jsp"><img src="../../resources/images/women8.PNG"></a>
		<a href="sportswearAdminDetailView.jsp"><img src="../../resources/images/men3.PNG"></a>
		<a href="sportswearAdminDetailView.jsp"><img src="../../resources/images/women9.PNG"></a>
	</div>
	<div class="sw3">
		<a href="sportswearAdminDetailView.jsp"><img src="../../resources/images/women3.PNG"></a>
		<a href="sportswearAdminDetailView.jsp"><img src="../../resources/images/kids4.PNG"></a>
		<a href="sportswearAdminDetailView.jsp"><img src="../../resources/images/men8.PNG"></a>
		<a href="sportswearAdminDetailView.jsp"><img src="../../resources/images/men9.PNG"></a>
		<a href="sportswearAdminDetailView.jsp"><img src="../../resources/images/kids7.PNG"></a>
	</div>
</div>
<hr>
<%@ include file="../common/footer.jsp" %>
</body>
</html>