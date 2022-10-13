<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="../common/header.jsp"/>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<script type="text/javascript">
	const myModal = document.getElementById('myModal')
	const myInput = document.getElementById('myInput')
	
	myModal.addEventListener('shown.bs.modal', () => {
	  myInput.focus()
	})
</script>


</head>
<body>

<div class="container">

<br>
	<h4> 상품 목록 </h4>
	<br>
		<div class="row g-3">
			<div class="col-md-11">
			</div>	
			<div class="col-md-1">
				<input type="button" class="btn btn-primary" id="search" value="등록" data-bs-toggle="modal" data-bs-target="#exampleModal">
			</div>
		</div>
	<br>
	
		
	<table class="table">
	  <thead>
	    <tr>
	      <th scope="col">상품번호</th>
	      <th scope="col">카테고리</th>
	      <th scope="col">상품명</th>
	      <th scope="col">가격</th>
	      <th scope="col">재고량</th>
	      <th scope="col">품절여부</th>
	      <th scope="col">등록일</th>
	    </tr>
	  </thead>
	  <tbody>
	    	<c:forEach var="list" items="${requestScope.list}">
	    <tr>
		      <th scope="row">${list.goodsId}</th>
		      <td>${list.cateId}</td>
		      <td>${list.goodsName}</td>
		      <td>${list.goodsPrice}</td>
		      <td>${list.goodsStock}</td>
		      <td>${list.soldState}</td>
		      <td>${list.goodsDate}</td>
	    </tr>
	    	</c:forEach>
	  </tbody>
	</table>







</div>


</body>

<jsp:include page="../common/footer.jsp"/>
</html>