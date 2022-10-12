<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<jsp:include page="../common/header.jsp"/>

<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>

<div class="container">


	<br>
	<h4> ��ǰ ��� </h4><br>

	<form action="${pageContext.request.contextPath}/front?key=goods&methodName=insert" name="goods" method="post" enctype="multipart/form-data">
		<hr>
		<br><br>
		<!-- ��ǰ�� -->
		<div class="mb-3 row">
			<div class="col-sm-3"></div>
		    <label class="col-sm-2 col-form-label">ī�װ� �з�</label>
		    <div class="col-sm-4">
		    	<select class="form-control" id="cateId" name="cateId">
		    		<option value="">�������ּ���</option>
		    		<option value="1">���</option>
		    		<option value="2">�ٵ�</option>
		    		<option value="3">����</option>
		    		<option value="4">������Ʈ</option>
		    		<option value="5">��ǰ</option>
		    	</select>
		    </div>
			<div class="col-sm-3"></div>
	    </div>
		
		
		
		<!-- ��ǰ�� -->
		<div class="mb-3 row">
			<div class="col-sm-3"></div>
		    <label class="col-sm-2 col-form-label">��ǰ��</label>
		    <div class="col-sm-4">
				<input type="text" class="form-control" id="goodsName" name="goodsName">
		    </div>
			<div class="col-sm-3"></div>
	    </div>
	    
		<!-- ���� -->
	    <div class="mb-3 row">
	    	<div class="col-sm-3"></div>
		    <label class="col-sm-2 col-form-label">����</label>
		    <div class="col-sm-4">
		    	<input type="text" class="form-control" id="goodsPrice" name="goodsPrice">
		    </div>
		    <div class="col-sm-3"></div>
	    </div>
	    
		<!-- ��� -->
		<div class="mb-3 row">
	    	<div class="col-sm-3"></div>
		    <label class="col-sm-2 col-form-label">���</label>
		    <div class="col-sm-4">
		      <input type="text" class="form-control" id="goodsStock" name="goodsStock">
		    </div>
		    <div class="col-sm-3"></div>
	    </div>
	    
		<!-- ��ǰ �� -->
		<div class="mb-3 row">
	    	<div class="col-sm-3"></div>
		    <label class="col-sm-2 col-form-label">�� ����</label>
		    <div class="col-sm-4">
		      <textarea class="form-control" id="goodsDetail" name="goodsDetail"></textarea>
		    </div>
	    	<div class="col-sm-3"></div>
	    </div>
	    
	    <!-- ��ǰ �̹��� -->
	   	<div class="mb-3 row">
	   		<div class="col-sm-3"></div>
		    <label class="col-sm-2 col-form-label">�̹���</label>
		    <div class="col-sm-4">
		      <input type="file" id="goodsImg" name="goodsImg">
		    </div>
		    <div class="col-sm-3"></div>
	    </div>
		
		<!-- ǰ�� ���� -->
	   	<div class="mb-3 row">
	   		<div class="col-sm-3"></div>
		    <label class="col-sm-2 col-form-label">ǰ�� ����</label>
		    <div class="col-sm-4">
		      <input type="text" class="form-control" id="soldState" name="soldState">
		    </div>
		    <div class="col-sm-3"></div>
	    </div>
		
	    
	    <br>
	    <div class=".col-6 .col-sm-4 text-center">
	  		<input type="submit" id="insertBtn" class="btn btn-primary" value="��ǰ���">
	  	</div>
    
	</form>
</div>
</body>
<jsp:include page="../common/footer.jsp"/>
</html>