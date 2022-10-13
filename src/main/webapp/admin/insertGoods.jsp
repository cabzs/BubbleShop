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
	<h4> 상품 등록 </h4><br>

	<form action="${pageContext.request.contextPath}/front?key=goods&methodName=insert" name="goods" 
	method="post" enctype="multipart/form-data" accept-charset="utf-8">
		<hr>
		<br><br>
		<!-- 상품명 -->
		<div class="mb-3 row">
			<div class="col-sm-3"></div>
		    <label class="col-sm-2 col-form-label">카테고리 분류</label>
		    <div class="col-sm-4">
		    	<select class="form-control" id="cateId" name="cateId">
		    		<option value="">선택해주세요</option>
		    		<option value="1">헤어</option>
		    		<option value="2">바디</option>
		    		<option value="3">리빙</option>
		    		<option value="4">선물세트</option>
		    		<option value="5">소품</option>
		    	</select>
		    </div>
			<div class="col-sm-3"></div>
	    </div>
		
		
		
		<!-- 상품명 -->
		<div class="mb-3 row">
			<div class="col-sm-3"></div>
		    <label class="col-sm-2 col-form-label">상품명</label>
		    <div class="col-sm-4">
				<input type="text" class="form-control" id="goodsName" name="goodsName">
		    </div>
			<div class="col-sm-3"></div>
	    </div>
	    
		<!-- 가격 -->
	    <div class="mb-3 row">
	    	<div class="col-sm-3"></div>
		    <label class="col-sm-2 col-form-label">가격</label>
		    <div class="col-sm-4">
		    	<input type="text" class="form-control" id="goodsPrice" name="goodsPrice">
		    </div>
		    <div class="col-sm-3"></div>
	    </div>
	    
		<!-- 재고 -->
		<div class="mb-3 row">
	    	<div class="col-sm-3"></div>
		    <label class="col-sm-2 col-form-label">재고량</label>
		    <div class="col-sm-4">
		      <input type="text" class="form-control" id="goodsStock" name="goodsStock">
		    </div>
		    <div class="col-sm-3"></div>
	    </div>
	    
		<!-- 상품 상세 -->
		<div class="mb-3 row">
	    	<div class="col-sm-3"></div>
		    <label class="col-sm-2 col-form-label">상세 설명</label>
		    <div class="col-sm-4">
		      <textarea class="form-control" id="goodsDetail" name="goodsDetail"></textarea>
		    </div>
	    	<div class="col-sm-3"></div>
	    </div>
	    
	    <!-- 상품 이미지 -->
	   	<div class="mb-3 row">
	   		<div class="col-sm-3"></div>
		    <label class="col-sm-2 col-form-label">이미지</label>
		    <div class="col-sm-4">
		      <input type="file" id="goodsImg" name="goodsImg">
		    </div>
		    <div class="col-sm-3"></div>
	    </div>
		
		<!-- 품절 여부 -->
	   	<div class="mb-3 row">
	   		<div class="col-sm-3"></div>
		    <label class="col-sm-2 col-form-label">품절 여부</label>
		    <div class="col-sm-4">
		    	<select class="form-control" id="soldState" name="soldState">
		    		<option value="1">N</option>
		    		<option value="2">Y</option>
		    	</select>
		    </div>
		    <div class="col-sm-3"></div>
	    </div>
		
	    
	    <br>
	    <div class=".col-6 .col-sm-4 text-center">
	  		<input type="submit" id="insertBtn" class="btn btn-primary" value="상품등록">
	  	</div>
    
	</form>
</div>
</body>
<jsp:include page="../common/footer.jsp"/>
</html>