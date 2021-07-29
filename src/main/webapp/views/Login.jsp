<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Bodyway Main</title>
<link rel="stylesheet" href="style.css">
<script src="jquery-3.6.1.js"></script>
</head>
<body>
	<section class="login-form">
		<h1>BODY WAY</h1>
		<form action="/semi/login" method="post">
			<label>아이디 : <input type="text" name="userid" id="uid"
				class="pos"></label> <br> <label>암 호 : <input
				type="password" name="userpwd" id="upwd" class="pos"></label> <br>
			<input type="submit" value="로그인">
		</form>
		<div class="caption">
			<a href="./find.jsp"> 아이디/비밀번호찾기 </a> <br> <a
				href="./enrollPage.html"> 회원가입하기 </a>
	</section>

</body>
</html>