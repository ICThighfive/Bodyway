<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Bodyway</title>
<style type="text/css">
	table th { background-color: #AFEEEE; }
</style>
<script type="text/javascript" src="/semi/resources/js/jquery-3.6.0.min.js"></script>
<script type="text/javascript">
function dupNameCheck() {
	// 모임 이름 중복확인하는 메소드
	$.ajax({
		url: "/semi/capinsert",
		type: "post",
		data: {communityid: $("#cmname").val()},
		success: function(data){
			console.log("success : " + data);
			if(data == "ok"){
				alert("사용 가능한 이름입니다.");
				$("#cmintro").focus();		//사용가능한 이름이면 소개글 입력칸에 커서를 둬라
			}else {
				alert("이미 사용중인 이름입니다.");
				$("#cmname").select();		//이미 사용중인 이름이면 모임이름 입력칸에 커서를 둬라
			}
		},
		error: function(jqXHR, textStatus, errorThrown){
			console.log("error : " + jqXHR + ", " + textStatus + ", " + errorThrown);
		}
	});
	
	// 버튼 클릭이벤트 취소 (submit 으로 클릭 전달 막기 위함)
	return false;
}
</script>
</head>
<body>
<%@ include file="../common/menubar.jsp" %>
<hr>
<center>
<h2 align="center">모임 신청서 작성하기</h2>
<br>
<form action="/semi/capinsert" method="post" onsubmit="return validate();" enctype="multipart/form-data">
<table id="upper" align="center" width="700" cellspacing="3" cellpadding="0">
	<tr><th colspan="2">모임정보를 입력하세요. (* 표시는 필수 입력 항목입니다.)</th></tr>
	<tr><th width="150" readonly="true">모임 ID(자동생성)</th>
		<td><input type="text" name="cmid" required></td></tr>
	<tr><th width="150">* 모임 이름</th>
		<td><input type="text" name="cmname" id="cmname" placeholder="필수입력 항목입니다." required> &nbsp; 
			<input type="button" value="중복체크" onclick="return dupNameCheck();"></td></tr>
	<tr><th width="150">* 모임 소개글을<br> 작성해보세요:)</th>
		<td><textarea name="cmintro" rows="4" cols="60" placeholder="필수입력 항목입니다."></textarea></td></tr>
	<tr><th width="150">* 최소인원</th>
		<td><input type="number" min="1" name="cpctmin" id="cpctmin" required></td></tr>
	<tr><th width="150">* 최대인원</th>
		<td><input type="number" name="cpctmax" id="cpctmax" required></td></tr>	
	<tr><th width="300">개설하시는 모임과 관련된<br>단어 선택해주세요!<br>(복수선택 가능)</th>
		<td>
			<table width="500">
			<tr>
				<td><input type="checkbox" name="interests" value="pt"> PT</td>
				<td><input type="checkbox" name="interests" value="health"> 헬스</td>
				<td><input type="checkbox" name="interests" value="climbing"> 클라이밍</td>
				<td><input type="checkbox" name="interests" value="hiking"> 등산</td>
			</tr>
			<tr>
				<td><input type="checkbox" name="interests" value="yoga"> 요가</td>
				<td><input type="checkbox" name="interests" value="pilates"> 필라테스</td>
				<td><input type="checkbox" name="interests" value="stretching"> 스트레칭</td>
				<td><input type="checkbox" name="interests" value="poledance"> 폴댄스</td>
			</tr>
			<tr>
				<td><input type="checkbox" name="interests" value="badminton"> 배드민턴</td>
				<td><input type="checkbox" name="interests" value="tennis"> 테니스</td>
				<td><input type="checkbox" name="interests" value="pingpong"> 탁구</td>
				<td><input type="checkbox" name="interests" value="jogging"> 조깅</td>
			</tr>
			<tr>
				<td><input type="checkbox" name="interests" value="running"> 런닝</td>
				<td><input type="checkbox" name="interests" value="crossfit"> 크로스핏</td>
				<td><input type="checkbox" name="interests" value="cycle"> 자전거</td>
				<td><input type="checkbox" name="interests" value="surfing"> 서핑</td>
			</tr>
			<tr>
				<td><input type="checkbox" name="interests" value="zumba"> 줌바댄스</td>
				<td><input type="checkbox" name="interests" value="aerobic"> 에어로빅</td>
				<td><input type="checkbox" name="interests" value="food"> 식단</td>
				<td><input type="checkbox" name="interests" value="friendship"> 친목</td>
			</tr>
			<tr>
				<td><input type="checkbox" name="interests" value="etc" onclick="this.form.etctext.disabled=false"> 기타</td>
				<td colspan="3">
				<input type="text" name=etctext placeholder="찾으시는 운동이 없다면 이곳에 직접 작성해보세요:)">
				</td>
			</tr>
			</table>
		</td></tr>
	<tr><th width="150">* 모임 사진 등록</th>
		<td><input type="text" name="originname" id="originname" placeholder="찾아보기 버튼을 눌러 사진을 등록하세요" required> &nbsp; 
			<input type="button" value="찾아보기" onclick="return dupIDCheck();"></td></tr>
</table>
<br>
<br>
<table id="lower" align="center" width="700" cellspacing="3" cellpadding="0">
	<tr><th colspan="2">더 자세한 정보를 입력해보세요! :)</th></tr>
	<tr><th width="150">모임 날짜</th>
		<td><input type="date" name="mtdate" id=mtdate""></td></tr>
	<tr><th width="150">모임 장소</th>
		<td><input type="text" name="mtplace" id="mtplace"> &nbsp;
		<input type="button" value="장소찾기" onclick="#"></td></tr>
	<tr><th width="150">모임 회비</th>
		<td>
			<input type="radio" name="mtfeeyn" value="Y" onclick="this.form.mtfee.disabled=false"> 있음 &nbsp;
			<input type="radio" name="mtfeeyn" value="N" onclick="this.form.mtfee.disabled=true"> 없음
		</td></tr>
	<tr><th width="150">금액</th>
		<td><input type="number" min=0 name="mtfee" id="mtfee" step="1000"></td></tr>		
	<tr><th colspan="2">
		<br>
		<input type="reset" value="작성취소"> &nbsp;
		<input type="submit" value="작성완료">
	</th></tr>
</table>
</form>
</center>
<hr>
<%@ include file="../common/footer.jsp" %>
</body>
</html>