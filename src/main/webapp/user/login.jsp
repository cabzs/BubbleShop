<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<jsp:include page="../common/header.jsp"/>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<div class="container">

	<br>
	<h4> 로그인 </h4><br>

	<form action="${pageContext.request.contextPath}/front" name="login" method="post">
		<input type="hidden" name="key" value = "member" /> <!-- Controller를 찾는 정보 -->
		<input type="hidden" name="methodName" value = "login" />  <!-- 메소드이름 -->
	
	<hr>
	<br><br>
	<!-- 아이디 -->
	<div class="mb-3 row">
		<div class="col-sm-3"></div>
	    <label class="col-sm-2 col-form-label">아이디</label>
	    <div class="col-sm-4">
			<input type="text" class="form-control" id="inputPassword" name="memberId">
	    </div>
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
    
    <br>
    <div class=".col-6 .col-sm-4 text-center">
  		<input type="submit" id="joinBtn" class="btn btn-primary" value="로그인">
  	</div>
  		<a href="${pageContext.request.contextPath}/user/join.jsp">회원가입</a>
    
	</form>
</div>


</body>

<jsp:include page="../common/footer.jsp"/>
</html>