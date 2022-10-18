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


<body>

<!-- Shoping Cart Section Begin -->
    <section class="shoping-cart spad">
        <div class="container">
            <div class="row">
	            <div class="section-title">
	            	<h2>장바구니</h2>
	            </div>
	            <br><br>
                <div class="col-lg-12">
                    <div class="shoping__cart__table">
                        <table>
                            <thead>
                                <tr>
                                    <th class="shoping__product">상품명</th>
                                    <th>가격</th>
                                    <th>수량</th>
                                    <th>총 가격</th>
                                    <th></th>
                                </tr>
                            </thead>
                            <tbody>
                            	<c:forEach items="${requestScope.cartList}" var="cartList">
                                <tr>
                                    <td class="shoping__cart__item">
                                        <img src="${pageContext.request.contextPath}/img/${cartList.goods.goodsImg}" alt="" 
                                        onclick="location.href='${pageContext.request.contextPath}/front?key=goods&methodName=goodsView&goodsId=${cartList.goods.goodsId}'"
                                        style="width:150px; height:150px; cursor: pointer; border-radius: 20px;">
                                        <h5><a href="${pageContext.request.contextPath}/front?key=goods&methodName=goodsView&goodsId=${cartList.goods.goodsId}"> &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp ${cartList.goods.goodsName } </a></h5>
                                    </td>
                                    <td class="shoping__cart__price">
                                        <fmt:formatNumber>${cartList.goods.goodsPrice}</fmt:formatNumber>
                                    </td>
                                    <td class="shoping__cart__quantity">
                                        <div class="quantity">
                                            <div class="pro-qty">
                                                <input type="text" value=${cartList.count}>
                                            </div>
                                        </div>
                                    </td>
                                    <td class="shoping__cart__total">
                                        <fmt:formatNumber>${cartList.goods.goodsPrice * cartList.count} </fmt:formatNumber> 원
                                    </td>
                                    <td class="shoping__cart__item__close">
                                        <span class="icon_close"></span>
                                    </td>
                                </tr>
                                </c:forEach>
                            </tbody>
                        </table>
                    </div>
                </div>
            </div>
            <div class="row">
                <div class="col-lg-12">
                </div>
                <div class="col-lg-6">
                    <div class="shoping__continue">
                        <div class="shoping__discount">
                        </div>
                    </div>
                </div>
                <div class="col-lg-6">
                    <div class="shoping__checkout">
                     <h5>금액 합계</h5>
					<c:set var = "total" value = "0" scope="session" />
					<c:set var = "fee" value = "0" scope="session" />
					<c:forEach items="${requestScope.cartList}" var="cartList">
					<c:set var = "total" value = "${total + cartList.goods.goodsPrice * cartList.count}" />
	                </c:forEach>
                        <ul>
                            <li>상품 총 금액 
                            	<span><fmt:formatNumber> ${total} </fmt:formatNumber> 원</span></li>
                            <li>배송비 
	                            <span>
	                            <c:choose>
	                            	<c:when test="${total >= 50000}">
	                            		0 원 <c:set var="fee" value="0"/>
	                            	</c:when>
	                            	<c:otherwise>
	                            		<fmt:formatNumber>2500</fmt:formatNumber> 원
	                            		<c:set var="fee" value="2500"/>
	                            	</c:otherwise>
	                            </c:choose>
	                            </span>
                            </li>
                            <hr>
                            <li>총 결제 금액 <span><fmt:formatNumber> ${total+fee} </fmt:formatNumber> 원</span></li>
                        </ul>
                        <a href="#" class="primary-btn">주문하기</a>
                    </div>
                </div>
            </div>
        </div>
    </section>
    <!-- Shoping Cart Section End -->

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