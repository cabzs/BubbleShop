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

<!-- Checkout Section Begin -->
    <section class="checkout spad">
        <div class="container">
            <div class="row">
            </div>
            <div class="checkout__form">
                <h4>주문자 정보</h4>
                <form action="#">
				<c:forEach items="${sessionScope.cartList}" var="cartList" begin="1" end="1">
                    <div class="row">
                        <div class="col-lg-8 col-md-6">
                            <div class="row">
                                <div class="col-lg-6">
                                    <div class="checkout__input">
                                        <p>이름<span>*</span></p>
                                        <input type="text" value="${cartList.member.memberName }" readonly="readonly">
                                    </div>
                                </div>
                                <div class="col-lg-6">
                                </div>
                            </div>
                            <div class="checkout__input">
                                <p>연락처<span>*</span></p>
                                <input type="text" value="${cartList.member.phone }">
                            </div>
                            <div class="checkout__input">
                                <p>주소<span>*</span></p>
                                <input type="text" value="${cartList.member.address }" class="checkout__input__add">
	                            <div class="row">
		                            <div class="col-lg-6">
			                            <div class="checkout__input">
			                                <input type="text" value="${cartList.member.addressDetail }" readonly="readonly">
			                            </div>
		                            </div>
		                            <div class="col-lg-6">
		                            	<div class="checkout__input">
			                                <input type="text" value="${cartList.member.addressCode }" readonly="readonly">
			                            </div>
		                            </div>
	                            </div>
                            </div>
                            <div class="checkout__input">
                            </div>
                            <div class="checkout__input">
                            </div>
                            <div class="checkout__input">
                            </div>
                            <div class="row">
                                <div class="col-lg-6">
                                    <div class="checkout__input">
                                    </div>
                                </div>
                                <div class="col-lg-6">
                                    <div class="checkout__input">
                                    </div>
                                </div>
                            </div>
                            <div class="checkout__input__checkbox">
                            </div>
                            <div class="checkout__input">
                            </div>
                            <div class="checkout__input__checkbox">
                            </div>
                            <div class="checkout__input">
                            </div>
                        </div>
                        <div class="col-lg-4 col-md-6">
                            <div class="checkout__order">
                                <h4>주문 정보</h4>
                                <div class="checkout__order__products">상품 <span>합계</span></div>
                                <ul>
                                	<c:forEach items="${sessionScope.cartList}" var="cartList">
	                                    <li>
	                                    ${cartList.goods.goodsName } &nbsp (${cartList.count}개) <span><fmt:formatNumber>${cartList.goods.goodsPrice * cartList.count} </fmt:formatNumber> 원</span></li>
                                	
                                	</c:forEach>
                                </ul>
                               
                                <div class="checkout__order__total">총 합계 <span><fmt:formatNumber> ${all} </fmt:formatNumber> 원</span></div>
                                <div class="checkout__input__checkbox">
                                </div>
                                <div class="checkout__input__checkbox">
                                </div>
                                <div class="checkout__input__checkbox">
                                </div>
                                <button type="submit" class="site-btn">결제하기</button>
                            </div>
                        </div>
                    </div>
                    </c:forEach>
                </form>
            </div>
        </div>
    </section>
    <!-- Checkout Section End -->

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