<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<!-- jQuery ��� ��� -->
    <script src="https://code.jquery.com/jquery-3.2.1.min.js"></script>
    <head>
        <title>���̵� ��й�ȣ ã��</title>
        <h1>���̵�/��й�ȣ ã�� </h1>
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
            
            <!--���̵� ã��-->
            if(index == 1){
 
                <!--�̸��� �Է����� �ʾҴٸ�-->
                if($('#name').val()==""){
 
                    alert("�̸��� �Է��ϼ���.");
 
                <!--��ȭ��ȣ�� �Է����� �ʾҴٸ�-->
                }else if($('#phone1').val()==""){
 
                    alert("��ȭ��ȣ�� �Է��ϼ���.");
                }
 
                <!--������ �� ������ ������-->>
                $('#id_form').submit();
 
            <!--��� ã��-->
            }else if(index ==2){
 
                if($('#id').val()==""){
 
                    alert("���̵� �Է��ϼ���.");
 
                }else if($('#phone2').val()==""){
 
                    alert("��ȭ��ȣ�� �Է��ϼ���.");
                }
 
                $('#pwd_form').submit(); 
 
            }
        }
    </script>
    <body>
        <div id="loginer">
            <form id = "id_form" action="/test/FindAccount/FindLook" method="POST">
                <fieldset>
                    <legend>���̵� ã��</legend>
                    �̸� : <input type="text" id ="name" name ="data" placeholder="Enter Your Name">
                    <br>
                    ��ȭ��ȣ: <input type="text" id ="phone1" name ="phone" placeholder="Enter Your phone">
                    <br><br>
                    <input type="hidden" value="0" name = "check"><!--�������� ���̵� ã������ ���ã�� ���� �����ϱ� ���� �Ӽ�-->
                    <input type="button" value="���̵� ã��" onclick="mysubmit(1)">
                    <br>
                </fieldset>
            </form>
            <form id = "pwd_form" action="/test/FindAccount/FindLook" method="POST">
                <fieldset>
                    <legend>��й�ȣ ã��</legend>
                    ���̵� : <input type="text" id ="id" name ="data" placeholder="Enter Your ID">
                    <br>
                    ��ȭ��ȣ: <input type="text" id ="phone2"  name ="phone" placeholder="Enter Your phone">
                    <br><br>
                    <input type="hidden" value="1" name = "check">
                    <input type="button" value="��й�ȣ ã��" onclick="mysubmit(2)">
                    <br>
                </fieldset>
            </form>
        </div>
    </body>
 <a href="./Login.jsp">�α��� �������� �̵�</a>
</html>