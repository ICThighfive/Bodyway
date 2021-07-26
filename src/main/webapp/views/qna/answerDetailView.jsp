<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>BodyWay</title>
<script type="text/javascript">
function moveUpdatePage(){
	location.href = "/semi/views/qna/answerUpdateView.jsp";
}

function requestDelete(){
	location.href = "";
}
</script>
</head>
<body>
<%@ include file="../common/menubar.jsp" %>
<hr>
<h2 align="center"> 답변 상세보기</h2>
<br>

<table class="table table-bordered" border=1>
<tr>
<th>답변</th>
<td>  </td>
</tr>
<tr>
<th>작성자</th>
<td>  </td>
</tr>
<tr>
<th>등록날짜</th>
<td> 2021-07-22 </td>
</tr>
<tr>
<th>첨부파일</th>
<td>  </td>
</tr>
<tr>
<th>내용</th>
<td></td>
</tr>
<tr>
<td colspan="2">
	<%-- 관리자일 경우에만 보이도록 처리 --%>
	<button onclick="moveUpdatePage(); return false;">수정페이지로 이동</button> &nbsp;
	<button onclick="requestDelete(); return false;">삭제하기</button> &nbsp;
	
	<button onclick="javascript:history.go(-1);">목록</button>
</td>
</tr>
</tbody>
</table>
<hr>
<%@ include file="../common/footer.jsp" %>
</body>
</html>