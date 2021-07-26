<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <!-- 관리자용 상품 상세정보 페이지 -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
<!-- 관리자용 상세정보 페이지에서 글 수정하기 페이지로 넘어감 -->
function goUpdateWriteForm(){
	location.href = "healthfoodAdminUpdate.jsp";
}
</script>
</head>
<body>
<%@ include file="../common/menubar.jsp" %>
<hr>
<%@ include file="./healthfoodCommon.jsp" %>
<div style="align:center;text-align:center;">
	<button onclick="goUpdateWriteForm();">글 수정하기</button>
</div>
<hr>
<%@ include file="../common/footer.jsp" %>
</body>
</html>