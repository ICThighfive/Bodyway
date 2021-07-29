<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>내 정보 수정</title>
</head>
<body>
<center>
<h1 align="center">회원 정보 수정</h1>
<br>
<form action="/first/enroll" method="post" onsubmit="return validate();">
<table id="outer" align="center" width="500" cellspacing="5" 
cellpadding="0">
<tr><th colspan="2">회원정보를 입력해 주세요. 
(* 표시는 수정불가.)</th></tr>
<tr><th width="120">*이름</th>
	<td><input type="text" name="username" readonly></td></tr>
<tr><th width="120">아이디</th>
	<td><input type="text" name="userid" id="userid" required> &nbsp; 
		<input type="button" value="중복체크" onclick="return dupIDCheck();"></td></tr>
<tr><th width="120">암호</th>
	<td><input type="password" name="userpwd" id="upwd" required></td></tr>
<tr><th width="120">암호확인</th>
	<td><input type="password" id="upwd2" required></td></tr>
<tr><th width="120">*성별</th>
	<td>
		<input type="radio" name="gender" value="M"> 남자 &nbsp;
		<input type="radio" name="gender" value="F"> 여자
	</td></tr>
<tr><th width="120">나이</th>
	<td><input type="number" name="age" min="1" value="20" required></td></tr>
<tr><th width="120">*전화번호</th>
	<td><input type="tel" name="phone" readonly></td></tr>
<tr><th width="120">*이메일</th>
	<td><input type="email" name="email" readonly></td></tr>

</th></tr>
</table>
 <input type="submit" value="수정하기"> &nbsp;
 <br>
 <a href="./Login.jsp">로그인 페이지로 이동</a>
</form>
</center>
</body>
</html>
