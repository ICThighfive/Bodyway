<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <!-- import 추가 예정 (로그인 확인 session 객체를 위함) -->
<!DOCTYPE html>
<html>
<head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js" integrity="sha384-IQsoLXl5PILFhosVNubq5LC7Qb9DXgDA9i+tQ8Zj3iwWAwPtgFTxbJ8NT4GN1R8p" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.min.js" integrity="sha384-cVKIPhGWiC2Al4u+LWgxfKTRIcfu0JTxR+EQDz/bgldoEyl4H0zUF0QKbrJ0EcQF" crossorigin="anonymous"></script>
<meta charset="UTF-8">
<title>menubar</title>
<style type = "text/css">
a.logo{
text-decoration : none;
}
</style>
</head>
<body>
<a class = "logo" href = "/semi/index.jsp"><h1 align = "center">BodyWay<img src = "/semi/resources/images/bodyway_logo.png" height="50" width= "50"></h1></a>

<ul class="nav justify-content-center">
  <li class="nav-item1">
    <a class="nav-link" href="/semi/views/healthfood/healthfoodListView.jsp">헬스 푸드</a>
  </li>
  <li class="nav-item2">
    <a class="nav-link" href="/semi/views/sportswear/sportswearListView.jsp">스포츠 웨어</a>
  </li>
  <li class="nav-item3">
    <a class="nav-link" href="/semi/views/sportsitem/sportsitemListView.jsp">운동 용품</a>
  </li>
  <li class="nav-item4">
    <a class="nav-link" href="/semi/views/sportsvideo/sportsvideoListView.jsp">운동 영상</a>
  </li>
  <li class="nav-item5">
    <a class="nav-link" href="/semi/views/community/communityListView.jsp">커뮤니티</a>
  </li>
  <li class="nav-item">
    <a class="nav-link" href="/semi/views/notice/noticeListView.jsp">공지사항</a>
  </li>
  <li class="nav-item">
    <a class="nav-link" href="/semi/views/qna/qnaListView.jsp">QNA</a>
  </li>
  <li class="nav-item">
    <a class="nav-link" href="#"></a>
  </li>
  <li class="login">
    <a class="nav-link" href="/semi/views/member/login.jsp">로그인하기</a>
  </li>
  <!-- <li class="nav-item">
    <a class="nav-link disabled" href="#" tabindex="-1" aria-disabled="true">Disabled</a>
  </li>-->
</ul>

</body>
</html>