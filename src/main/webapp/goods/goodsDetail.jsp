<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="../common/header.jsp"/>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>

<script type="text/javascript">
	$(function(){
		
		$("#cartButton").click(function(){
			location.href="${pageContext.request.contextPath}/front?key=cart&methodName=insert&goodsId="+ ${goodsList.goodsId}+"&quantity="+$("#quantity").val()		
		})
		
	})


</script>


<body>
<section class="product-details spad">
        <div class="container">
            <div class="row">
                <div class="col-lg-6 col-md-6">
                    <div class="product__details__pic">
                        <div class="product__details__pic__item">
                            <img class="product__details__pic__item--large"
                                src="${pageContext.request.contextPath}/img/${goodsList.goodsImg}" alt="굿즈 이미지">
                        </div>
                      
                    </div>
                </div>
                <div class="col-lg-6 col-md-6">
                    <div class="product__details__text">
                        <h3>${goodsList.goodsName}</h3>
                        <div class="product__details__rating">
                            <i class="fa fa-star"></i>
                            <i class="fa fa-star"></i>
                            <i class="fa fa-star"></i>
                            <i class="fa fa-star"></i>
                            <i class="fa fa-star-half-o"></i>
                            <span>(18 reviews)</span>
                        </div>
                        <div class="product__details__price"><fmt:formatNumber>${goodsList.goodsPrice}</fmt:formatNumber></div>
                        <p>${goodsList.goodsDetail}</p>
                        <div class="product__details__quantity">
                            <div class="quantity">
                                <div class="pro-qty">
                                    <input type="text" value="1" id="quantity" name="quantity" min="1" max="99">
                                </div>
                            </div>
                        </div>
                        <c:choose>
                        	<c:when test="${goodsList.goodsStock == 0}">
		                        <input type="button" class="btn btn-secondary" disabled='disabled' value="일시품절">
                        	</c:when>
                        	<c:otherwise>
		                        <a href="#" class="primary-btn" id="cartButton">장바구니</a>
                        	</c:otherwise>
                        </c:choose>
                        <a href="#" class="heart-icon"><span class="icon_heart_alt"></span></a>
                    </div>
                </div>
                <div class="col-lg-12">
                    <div class="product__details__tab">
                        <ul class="nav nav-tabs" role="tablist">
                            <li class="nav-item">
                                <a class="nav-link active" data-toggle="tab" href="#tabs-1" role="tab"
                                    aria-selected="true">상품 설명</a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link" data-toggle="tab" href="#tabs-3" role="tab"
                                    aria-selected="false">상품 후기 <span>(1)</span></a>
                            </li>
                        </ul>
                        
                            </div>
                        </div>
                    </div>
                </div>
    </section>
    <!-- Product Details Section End -->

 <!-- Js Plugins -->
    <script src="js/jquery-3.3.1.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
    <script src="js/jquery.nice-select.min.js"></script>
    <script src="js/jquery-ui.min.js"></script>
    <script src="js/jquery.slicknav.js"></script>
    <script src="js/mixitup.min.js"></script>
    <script src="js/owl.carousel.min.js"></script>
    <script src="js/main.js"></script>


</body>
<jsp:include page="../common/footer.jsp"/>

</html>