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


<section class="product spad">
 <div class="container">
	<div class="col-12">
         <div class="product__discount">
             <div class="section-title product__discount__title">
                 <h2>전체 상품</h2>
             </div>
                 
         <div class="filter__item">
             <div class="row">
                  		<div class="col-md-8"></div>
					    <div class="col-6 col-md-2"></div>
					    <div class="col-6 col-md-2">
	                     <!-- 상품 정렬 -->
						<div class="filter__sort">
	                         <select class="form-control">
								<option value="">정렬기준</option>
								<option value="1">판매순</option>
								<option value="2">인기순</option>
								<option value="3">신상품순</option>
								<option value="4">낮은가격순</option>
								<option value="5">높은가격순</option>
	                         </select>
	                     </div>
					</div>
                 </div>
             </div>
         </div>
         <div class="row">
             <c:forEach items="${requestScope.goodsList}" var="goodsList">
             <div class="col-lg-4 col-md-6 col-sm-6">
                 <div class="product__item">
                     <div class="product__item__pic set-bg" 
                     		style="background-image : url(${pageContext.request.contextPath}/img/${goodsList.goodsImg}); 
                     		background-size: contain; 
                     		background-repeat: no-repeat; cursor: pointer;" 
                     		onclick="location.href='${pageContext.request.contextPath}/front?key=goods&methodName=goodsView&goodsId=${goodsList.goodsId}'">
<%--                      <img alt="" src="${pageContext.request.contextPath}/img/${goodsList.goodsImg}">
 --%>                         <ul class="product__item__pic__hover">
                             <li><a href="#"><i class="fa fa-heart"></i></a></li>
                             <li><a href="#"><i class="fa fa-shopping-cart"></i></a></li>
                         </ul>
                     </div>
                     <div class="product__item__text">
                         <h6><a href="${pageContext.request.contextPath}/front?key=goods&methodName=goodsView&goodsId=${goodsList.goodsId}">${goodsList.goodsName}</a></h6>
                         <h5><fmt:formatNumber>${goodsList.goodsPrice}</fmt:formatNumber></h5><br>
                        	<c:if test="${goodsList.goodsStock == 0}">
		                        <input type="button" class="btn btn-secondary btn-sm" disabled='disabled' value="일시품절" style="cursor: default;">
                        	</c:if>
                     </div>
                 </div>
             </div>
             </c:forEach>
     	</div>
     <!-- 페이지 버튼 -->
         <br>
         <div class="product__pagination">
             <a href="#">1</a>
             <a href="#">2</a>
             <a href="#">3</a>
             <a href="#"><i class="fa fa-long-arrow-right"></i></a>
         </div>
     </div>
     </div>
    </section>
    <!-- Product Section End -->

</body>

<jsp:include page="../common/footer.jsp"/>

</html>