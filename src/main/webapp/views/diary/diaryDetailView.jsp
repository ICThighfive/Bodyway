<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="diary.model.vo.Diary" %>
<%
	Diary diary = (Diary)request.getAttribute("diary");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>BodyWay</title>
<script type="text/javascript">
function moveUpdatePage(){
	location.href = "/semi/dupdateview?diaryno=<%= diary.getDiaryNo() %>";
}

function requestDelete(){
	location.href = "";
}
</script>
</head>
<body>
<%@ include file="../common/menubar.jsp" %>
<hr>
<h2 align="center"><%= diary.getDiaryNo() %>번 운동일지 상세보기</h2>
<br>

<table class="table table-bordered" border=1>
<tr>
<th>제 목</th>
<td><%= diary.getDiaryTitle() %></td>
</tr>
<tr>
<th>등록날짜</th>
<td><%= diary.getDiaryDate() %></td>
</tr>
<tr>
<th>첨부파일</th>
	<td>
		<% if(diary.getDiaryOriginalImage() != null) { %>
			<a href="/first/nfdown?ofile=<%= diary.getDiaryOriginalImage() %>&rfile=<%= diary.getDiaryRenameImage() %>"><%= diary.getDiaryOriginalImage() %></a>
		<% } else { %>
			&nbsp;
		<% } %>
	</td>
</tr>
<tr>
<th>내용</th>
<td><%= diary.getDiaryContent() %></td>
</tr>
<tr>
<td colspan="2">  
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