<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:include page="../common/header.jsp"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>

<!-- 다음 주소 api -->
<script src="//t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js"></script>
<script>
    function Postcode() {
        new daum.Postcode({
            oncomplete: function(data) {
                // 팝업에서 검색결과 항목을 클릭했을때 실행할 코드를 작성하는 부분.

                // 각 주소의 노출 규칙에 따라 주소를 조합한다.
                // 내려오는 변수가 값이 없는 경우엔 공백('')값을 가지므로, 이를 참고하여 분기 한다.
                var addr = ''; // 주소 변수
                var extraAddr = ''; // 참고항목 변수

                //사용자가 선택한 주소 타입에 따라 해당 주소 값을 가져온다.
                if (data.userSelectedType === 'R') { // 사용자가 도로명 주소를 선택했을 경우
                    addr = data.roadAddress;
                } else { // 사용자가 지번 주소를 선택했을 경우(J)
                    addr = data.jibunAddress;
                }
              
                // 우편번호와 주소 정보를 해당 필드에 넣는다.
                document.getElementById('Mypostcode').value = data.zonecode;
                document.getElementById("Myaddress").value = addr;
                // 커서를 상세주소 필드로 이동한다.
                document.getElementById("MydetailAddress").focus();
            }
        }).open();
    }
</script>
<body>
	
<div class="container">

	<br>
	<h4> 회원가입 </h4><br>
	
	<form action="${pageContext.request.contextPath}/front" name="join" method="post">
	<input type="hidden" name="key" value = "member" /> <!-- Controller를 찾는 정보 -->
	<input type="hidden" name="methodName" value = "insert" />  <!-- 메소드이름 -->
	
		<hr>
		<br><br>
		<!-- 아이디 -->
		<div class="mb-3 row">
			<div class="col-sm-3"></div>
		    <label class="col-sm-2 col-form-label">아이디</label>
		    <div class="col-sm-4">
				<input type="text" class="form-control" id="inputPassword" name="memberId">
		    </div>
		    <input class="btn btn-primary" type="button" value="중복체크">
			<div class="col-sm-3"></div>
	    </div>
	    
		<!-- 비밀번호 -->
	    <div class="mb-3 row">
	    	<div class="col-sm-3"></div>
		    <label class="col-sm-2 col-form-label">비밀번호</label>
		    <div class="col-sm-4">
		    	<input type="password" class="form-control" id="inputPassword" name="memberPwd">
		    </div>
		    <div class="col-sm-3"></div>
	    </div>
	    
		<!-- 비밀번호 확인 -->
		<div class="mb-3 row">
	    	<div class="col-sm-3"></div>
		    <label class="col-sm-2 col-form-label">비밀번호 확인</label>
		    <div class="col-sm-4">
		      <input type="password" class="form-control" id="inputPassword" name="pwdCheck">
		    </div>
		    <div class="col-sm-3"></div>
	    </div>
	    
		<!-- 이름 -->
		<div class="mb-3 row">
	    	<div class="col-sm-3"></div>
		    <label class="col-sm-2 col-form-label">이름</label>
		    <div class="col-sm-4">
		      <input type="text" class="form-control" id="inputPassword" name="memberName">
		    </div>
	    	<div class="col-sm-3"></div>
	    </div>
	    
	    <!-- 이메일 -->
	   	<div class="mb-3 row">
	   		<div class="col-sm-3"></div>
		    <label class="col-sm-2 col-form-label">이메일</label>
		    <div class="col-sm-4">
		      <input type="email" class="form-control" id="email" name="email">
		    </div>
		    <div class="col-sm-3"></div>
	    </div>
		
		<!-- 휴대폰 번호 -->
	   	<div class="mb-3 row">
	   		<div class="col-sm-3"></div>
		    <label class="col-sm-2 col-form-label">휴대폰 번호</label>
		    <div class="col-sm-4">
		      <input type="text" class="form-control" id="phone" name="phone">
		    </div>
		    <div class="col-sm-3"></div>
	    </div>
		
		<!-- 주소 (api 활용) -->
	   	<div class="mb-3 row">
	   		<div class="col-sm-3"></div>
		    <label class="col-sm-2 col-form-label">주소</label>
		    <div class="col-sm-4">
		      <input type="text" class="form-control" id="Myaddress" name="address">
		    </div>
		    <input class="btn btn-primary" type="button" onclick="Postcode()" value="주소 검색">
		    
	    </div>
	    
	    <!-- 상세주소 -->
		<div class="mb-3 row">
	   		<div class="col-sm-3"></div>
	   		<label class="col-sm-2 col-form-label"></label>
			<div class="col-sm-2"><!-- 우편번호 -->
				<input type="text" id="Mypostcode" class="form-control" name="addressCode" placeholder="우편번호">
		    </div>
		    <div class="col-sm-2"><!-- 상세주소 -->
				<input type="text" id="MydetailAddress" class="form-control" name="addressDetail" placeholder="상세주소">	    
			</div>
		    <div class="col-sm-3"></div>
	    </div>
	    
	    <br>
	    <div class=".col-6 .col-sm-4 text-center">
	  		<input type="submit" id="joinBtn" class="btn btn-primary" value="회원가입">
	  	</div>
    
	</form>
</div>


</body>
<jsp:include page="../common/footer.jsp"/>
</html>