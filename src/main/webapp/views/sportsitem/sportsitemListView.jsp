<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- 사용자용 상품 리스트 전체 페이지 -->
<%@ page import="sportsitem.model.vo.SportsItem, java.util.ArrayList" %>    
<%
   ArrayList<SportsItem> list = (ArrayList<SportsItem>)request.getAttribute("list");
	int listCount = ((Integer)request.getAttribute("listCount")).intValue();
	int startPage = ((Integer)request.getAttribute("startPage")).intValue();
	int endPage = ((Integer)request.getAttribute("endPage")).intValue();
	int maxPage = ((Integer)request.getAttribute("maxPage")).intValue();
	int currentPage = ((Integer)request.getAttribute("currentPage")).intValue();
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%@ include file="../common/menubar.jsp" %>
<hr>
<%@ include file="./sportsitemCommon.jsp" %>
<hr>
<br>
<table align="center" width="1000" border="1" cellspacing="0" cellpadding="0">
   <tr>
      <th align="center">상품명</th>
      <th align="center">대표사진</th>
   </tr>
<% for(SportsItem si : list){ %>
<tr>
   <td align="center"><%= si.getSiTitle() %></td>
   <td align="center"><a href="/semi/sidetail?si_board_no=<%= si.getSiBoardNo() %>"><img src="/semi/resources/images/<%= si.getSiOriginalImage() %>"></a></td>
</tr>
<% } %>
</table>
<br>
<%-- 페이징 처리 --%>
<div style="text-align:center;">
   <% if(currentPage <= 1) { %>
      [맨처음] &nbsp;
   <% }else { %>
      <a href="/semi/silist?page=1">[맨처음]</a> &nbsp;
   <% } %>
   
   <!-- 이전 페이지 그룹으로 이동 -->
   <% if((currentPage - 10) < startPage && (currentPage - 10) > 1) { %>
      <a href="/semi/silist?page=<%= startPage - 10 %>">[이전그룹]</a> &nbsp;
   <% }else { %>
      [이전그룹] &nbsp;
   <% } %>
   
   <!-- 현재 페이지 그룹의 페이지 숫자 출력 -->
   <%for(int p = startPage; p <= endPage; p++) { 
         if(p == currentPage){ %>
      <font color="red" size="4"><b>[<%= p %>]</b></font>
      <% }else { %>
         <a href="/semi/silist?page=<%= p %>"><%= p %></a>
   <% }} %>
   
   
   <!-- 다음 페이지 그룹으로 이동 -->
   <% if((currentPage + 10) > endPage && (currentPage + 10) < maxPage) { %>
      <a href="/semi/silist?page=<%= endPage + 10 %>">[다음그룹]</a> &nbsp;
   <% }else { %>
      [다음그룹] &nbsp;
   <% } %>
   
   
   <% if(currentPage >= maxPage) { %>
      [맨끝] &nbsp;
   <% }else { %>
      <a href="/semi/silist?page=<%= maxPage %>">[맨끝]</a> &nbsp;
   <% } %>
   
</div>
<hr>

<%@ include file="../common/footer.jsp" %>
</body>
</html>