<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="notice.model.vo.Notice"%>
<%
	Notice notice = (Notice)request.getAttribute("notice");
%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>BodyWay Admin</title>
<script type="text/javascript">
function moveUpdatePage(){
	location.href = "/semi/nupdateview?noticeno=<%= notice.getNoticeNo() %>";
}

function requestDelete(){
	location.href = "/semi/ndelete?noticeno=<%= notice.getNoticeNo() %>&rfile=<%= notice.getNoticeRenameImage() %>";
}
</script>
</head>
<body>
<%@ include file="../common/menubar.jsp" %>
<hr>
<h2 align="center"><%= notice.getNoticeNo() %>번 공지글 상세보기</h2>
<br>

<table class="table table-bordered" border=1>
<tr>
<th>제 목</th>
<td><%= notice.getNoticeTitle() %></td>
</tr>
<tr>
<th>작성자</th>
<td><%= notice.getAdminId() %></td>
</tr>
<tr>
<th>등록날짜</th>
<td><%= notice.getNoticeDate() %></td>
</tr>
<tr>
<th>첨부파일</th>
	<td>
		<% if(notice.getNoticeOriginalImage() != null) { %>
			<%-- <a href="/first/nfdown?ofile=<%= diary.getDiaryOriginalImage() %>&rfile=<%= diary.getDiaryRenameImage() %>"><%= diary.getDiaryOriginalImage() %></a> --%>
		<% } else { %>
			&nbsp;
		<% } %>
	</td>
</tr>
<tr>
<th>내용</th>
<td><%= notice.getNoticeContent() %></td>
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