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
                 <h2>내가 찜한 상품</h2>

             </div>

		<div class="filter__item">
             <div class="row">
                  		<div class="col-md-8"></div>
					    <div class="col-6 col-md-2"></div>
					    <div class="col-6 col-md-2">
	                     <!-- 상품 정렬 -->
						<div class="filter__sort">
	                    </div>
					</div>
                 </div>
             </div>
         </div>

	<div class="row">
	 <c:forEach items="${requestScope.likeList}" var="likeList">
             <div class="col-lg-4 col-md-6 col-sm-6">
                 <div class="product__item">
                     <div class="product__item__pic set-bg" 
                     		style="background-image : url(${pageContext.request.contextPath}/img/${likeList.goods.goodsImg}); 
                     		background-size: contain; 
                     		background-repeat: no-repeat; cursor: pointer;" 
                     		onclick="location.href='${pageContext.request.contextPath}/front?key=goods&methodName=goodsView&goodsId=${likeList.goods.goodsId}'">
	                         <ul class="product__item__pic__hover">
                             <li><a href="${pageContext.request.contextPath}/front?key=like&methodName=insert&goodsId=${likeList.goods.goodsId}"><i class="fa fa-heart"></i></a></li>
                             <li><a href="${pageContext.request.contextPath}/front?key=cart&methodName=insert&goodsId=${likeList.goods.goodsId}&quantity=1"><i class="fa fa-shopping-cart"></i></a></li>
                         </ul>
                     </div>
                     <div class="product__item__text">
                         <h6><a href="${pageContext.request.contextPath}/front?key=goods&methodName=goodsView&goodsId=${likeList.goods.goodsId}">${likeList.goods.goodsName}</a></h6>
                         <h5><fmt:formatNumber>${likeList.goods.goodsPrice}</fmt:formatNumber></h5><br>
                        	<c:if test="${likeList.goods.goodsStock == 0}">
		                        <input type="button" class="btn btn-secondary btn-sm" disabled='disabled' value="일시품절" style="cursor: default;">
                        	</c:if>
                     </div>
                 </div>
             </div>
             </c:forEach>
	</div>
</div>
</div>
</div>

</body>

<jsp:include page="../common/footer.jsp"/>
</html>