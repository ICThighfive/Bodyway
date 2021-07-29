<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<!-- jQuery 사용 명시 -->
    <script src="https://code.jquery.com/jquery-3.2.1.min.js"></script>
    <head>
        <title>아이디 비밀번호 찾기</title>
        <h1>아이디/비밀번호 찾기 </h1>
    </head>
    <style>
    #id_form{
        font-size: 1.3em;
        width: 50%;
        display: inline-block;
    }
    #pwd_form{
        font-size: 1.3em;
        width: 50%;
        display: inline-block;
    }
    </style>
    <script>
        function mysubmit(index){
            
            <!--아이디 찾기-->
            if(index == 1){
 
                <!--이름을 입력하지 않았다면-->
                if($('#name').val()==""){
 
                    alert("이름을 입력하세요.");
 
                <!--전화번호를 입력하지 않았다면-->
                }else if($('#phone1').val()==""){
 
                    alert("전화번호를 입력하세요.");
                }
 
                <!--서버로 폼 데이터 보내기-->>
                $('#id_form').submit();
 
            <!--비번 찾기-->
            }else if(index ==2){
 
                if($('#id').val()==""){
 
                    alert("아이디를 입력하세요.");
 
                }else if($('#phone2').val()==""){
 
                    alert("전화번호를 입력하세요.");
                }
 
                $('#pwd_form').submit(); 
 
            }
        }
    </script>
    <body>
        <div id="loginer">
            <form id = "id_form" action="/test/FindAccount/FindLook" method="POST">
                <fieldset>
                    <legend>아이디 찾기</legend>
                    이름 : <input type="text" id ="name" name ="data" placeholder="Enter Your Name">
                    <br>
                    전화번호: <input type="text" id ="phone1" name ="phone" placeholder="Enter Your phone">
                    <br><br>
                    <input type="hidden" value="0" name = "check"><!--서버에서 아이디 찾기인지 비번찾기 인지 구별하기 위한 속성-->
                    <input type="button" value="아이디 찾기" onclick="mysubmit(1)">
                    <br>
                </fieldset>
            </form>
            <form id = "pwd_form" action="/test/FindAccount/FindLook" method="POST">
                <fieldset>
                    <legend>비밀번호 찾기</legend>
                    아이디 : <input type="text" id ="id" name ="data" placeholder="Enter Your ID">
                    <br>
                    전화번호: <input type="text" id ="phone2"  name ="phone" placeholder="Enter Your phone">
                    <br><br>
                    <input type="hidden" value="1" name = "check">
                    <input type="button" value="비밀번호 찾기" onclick="mysubmit(2)">
                    <br>
                </fieldset>
            </form>
        </div>
    </body>
 <a href="./Login.jsp">로그인 페이지로 이동</a>
</html>