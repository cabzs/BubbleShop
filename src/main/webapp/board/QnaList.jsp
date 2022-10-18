<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<jsp:include page="../common/header.jsp"/>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<div class="container">

<div class="col-12">
	<div class="product__discount">
		<div class="section-title product__discount__title">
			<h2>Qna</h2>
			<br><br><br>
			
			<div class="row g-3">
				<div class="col-md-11">
				</div>	
				<div class="col-md-1">
					<input type="button" class="btn btn-primary" id="search" value="글쓰기">
				</div>
			</div>
			<br>
			<table class="table" style="text-align: center;">
			 <thead>
			    <tr>
			      <th scope="col">글번호</th>
			      <th scope="col" colspan="3">글제목</th>
			      <th scope="col">작성자</th>
			      <th scope="col">답변여부</th>
			      <th scope="col">작성일</th>
			    </tr>
			  </thead>
			  <tbody>
			    <tr>
			      <th scope="row">1</th>
			      <td colspan="3">Mark</td>
			      <td>Otto</td>
			      <td>@mdo</td>
			      <td>@mdo</td>
			    </tr>
			  </tbody>
			</table>
		</div>
	
	</div>
</div>


</div>

</body>
<jsp:include page="../common/footer.jsp"/>

</html>