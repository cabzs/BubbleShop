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
	<h4> Qna 등록 </h4><br>

	<form action="${pageContext.request.contextPath}/front?key=qnaBoard&methodName=insert" name="qna" method="post">
		<hr>
		<br><br>
		
		
		<!-- 글 제목 -->
		<div class="mb-3 row">
	    	<div class="col-sm-1"></div>
		    <label class="col-sm-2 col-form-label" style="text-align: center;">제목</label>
		    <div class="col-sm-9">
				<input type="text" class="form-control" id="qnaTitle" name="qnaTitle">
		    </div>
	    </div>
	    
		<!-- 글 내용 -->
		<div class="mb-3 row">
	    	<div class="col-sm-1"></div>
		    <label class="col-sm-2 col-form-label" style="text-align: center;">내용</label>
		    <div class="col-sm-9">
		      <textarea class="form-control" id="qnaContent" name="qnaContent" cols="50" rows="20"></textarea>
		    </div>
	    </div>
	    
	    <!-- 비밀글 체크 -->
	   	<div class="mb-3 row">
	   		<div class="col-sm-1"></div>
		    <label class="col-sm-2 col-form-label"></label>
		    <div class="col-sm-4">
			    <div class="form-check">
				  <input class="form-check-input" type="checkbox" value="Y" id="qnaSecret" name="qnaSecret" checked>
				  <label class="form-check-label" for="flexCheckDefault">
				   	<i class="fa fa-lock" aria-hidden="true"></i>
				   	비밀글
				  </label>
				</div>
		    </div>
		    <div class="col-sm-3"></div>
	    </div>
	    
	    <br>
	    <div class=".col-6 .col-sm-4 text-center">
	  		<input type="submit" id="insertBtn" class="btn btn-primary" value="등록">
	  		<input type="submit" id="insertBtn" class="btn btn-danger" value="취소">
	  	</div>
    
	</form>
</div>
</body>
<jsp:include page="../common/footer.jsp"/>

</html>