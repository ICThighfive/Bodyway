<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- 관리자용 상품 리스트 전체 페이지 -->    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
.healthfood{
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
.healthfood img{
	width: 300px;
	height: 300px;
}
.hf1, .hf2, .hf3, .hf4, .hf5{
	width: 25%;
}
</style>
<script type="text/javascript">
<!-- 관리자용 상품 리스트 전체 페이지에서 글 등록하기 페이지로 넘어감 
 	글의 등록은 전체 리스트 페이지에서만 가능 -->
function goWriteForm(){
	location.href = "healthfoodAdminWriteForm.jsp";
}
</script>
</head>
<body>
<%@ include file="../common/menubar.jsp" %>
<hr>
<%@ include file="./healthfoodCommon.jsp" %>
<hr>
<div style="align:center;text-align:center;">
	<button onclick="goWriteForm();">글 등록하기</button>
</div>
<div class="healthfood">
	<div class="hf1">
		<a href="healthfoodAdminDetailView.jsp"><img src="../../resources/images/heodak1.PNG"></a>
		<a href="healthfoodAdminDetailView.jsp"><img src="../../resources/images/lunch1.jpg"></a>
		<a href="healthfoodAdminDetailView.jsp"><img src="../../resources/images/lunch3.jpg"></a>
		<a href="healthfoodAdminDetailView.jsp"><img src="../../resources/images/protein3.PNG"></a>
		<a href="healthfoodAdminDetailView.jsp"><img src="../../resources/images/supplement2.PNG"></a>
	</div>
	<div class="hf2">
		<a href="healthfoodAdminDetailView.jsp"><img src="../../resources/images/protein1.PNG"></a>
		<a href="healthfoodAdminDetailView.jsp"><img src="../../resources/images/heodak5.PNG"></a>
		<a href="healthfoodAdminDetailView.jsp"><img src="../../resources/images/protein11.PNG"></a>
		<a href="healthfoodAdminDetailView.jsp"><img src="../../resources/images/supplement3.PNG"></a>
		<a href="healthfoodAdminDetailView.jsp"><img src="../../resources/images/lunch12.jpg"></a>
	</div>
	<div class="hf3">
		<a href="healthfoodAdminDetailView.jsp"><img src="../../resources/images/snack3.PNG"></a>
		<a href="healthfoodAdminDetailView.jsp"><img src="../../resources/images/snack4.PNG"></a>
		<a href="healthfoodAdminDetailView.jsp"><img src="../../resources/images/supplement10.PNG"></a>
		<a href="healthfoodAdminDetailView.jsp"><img src="../../resources/images/heodak7.PNG"></a>
		<a href="healthfoodAdminDetailView.jsp"><img src="../../resources/images/lunch8.jpg"></a>
	</div>
	<div class="hf4">
		<a href="healthfoodAdminDetailView.jsp"><img src="../../resources/images/supplement7.PNG"></a>
		<a href="healthfoodAdminDetailView.jsp"><img src="../../resources/images/snack7.jpg"></a>
		<a href="healthfoodAdminDetailView.jsp"><img src="../../resources/images/protein5.PNG"></a>
		<a href="healthfoodAdminDetailView.jsp"><img src="../../resources/images/heodak9.PNG"></a>
		<a href="healthfoodAdminDetailView.jsp"><img src="../../resources/images/lunch5.jpg"></a>
	</div>
	<div class="hf5">
		<a href="healthfoodAdminDetailView.jsp"><img src="../../resources/images/supplement5.PNG"></a>
		<a href="healthfoodAdminDetailView.jsp"><img src="../../resources/images/snack5.PNG"></a>
		<a href="healthfoodAdminDetailView.jsp"><img src="../../resources/images/snack6.jpg"></a>
		<a href="healthfoodAdminDetailView.jsp"><img src="../../resources/images/heodak10.PNG"></a>
		<a href="healthfoodAdminDetailView.jsp"><img src="../../resources/images/protein8.PNG"></a>
	</div>
</div>
<hr>
<%@ include file="../common/footer.jsp" %>
</body>
</html>