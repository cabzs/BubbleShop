<%@ page language="java" contentType="text/html; charset=UTF-8" isELIgnored="false"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

    
<!DOCTYPE html>

<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

    <!-- Google Font -->
    <link href="https://fonts.googleapis.com/css2?family=Cairo:wght@200;300;400;600;900&display=swap" rel="stylesheet">

	<script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
	<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
    <script src="js/mixitup.min.js"></script>
    <script src="js/main.js"></script>
    
    <!-- Css Styles -->
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/bootstrap.min.css" type="text/css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/font-awesome.min.css" type="text/css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/elegant-icons.css" type="text/css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/nice-select.css" type="text/css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/jquery-ui.min.css" type="text/css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/owl.carousel.min.css" type="text/css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/slicknav.min.css" type="text/css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/style.css?after" type="text/css">


</head>


<script type="text/javascript">
	$(function(){
		$("a[name=category]").click(function(){
			let cateId = $(this).attr("id");
			location.href="${pageContext.request.contextPath}/front?key=goods&methodName=selectByCate&cateId="+cateId;
		})
	});
</script>


<body>

 <!-- Header Section Begin -->
     <header class="header">
	<div class="container">
 
           	<div class="row">
                <div class="col-lg-3">
                    <div class="header__logo">
                        <a href="${pageContext.request.contextPath}/index.jsp">로고<img src="img/logo.png" alt=""></a>
                    </div>
                </div>
                <div class="col-lg-6">
                    <nav class="header__menu">
                        <ul>
                            <li class="active"><a href="${pageContext.request.contextPath}/index.jsp">버블버블 이야기</a></li>
                            <li><a href="${pageContext.request.contextPath}/front?key=goods&methodName=selectAll">쇼핑하기</a>
                                <ul class="header__menu__dropdown">
                                    <li><a href="#" name="category" id="1" >헤어</a></li>
                                    <li><a href="#" name="category" id="2" >바디</a></li>
                                    <li><a href="#" name="category" id="3" >리빙</a></li>
                                    <li><a href="#" name="category" id="4" >선물세트</a></li>
                                    <li><a href="#" name="category" id="5" >소품</a></li>
                                </ul>
                            </li>
                            <li><a href="./blog.html">게시판</a></li>
                            <li><a href="./contact.html">리뷰</a></li>
                        </ul>
                    </nav>
                </div>
                <div class="col-lg-3">
                    <div class="header__cart">
                        <ul>
                        <c:choose>
                        	<c:when test="${loginUser.memberId == 'admin'}">
                        		<li>${loginUser.memberName}&nbsp&nbsp&nbsp<a href="${pageContext.request.contextPath}/admin/insertGoods.jsp"><i class="fa fa-cog fa-xl"></i></a></li>
                        	</c:when>
	                      	<c:otherwise>
	                        	<c:if test="${loginUser != null}">
                            	<li>${loginUser.memberId}&nbsp&nbsp&nbsp<a href="${pageContext.request.contextPath}/"><i class="fa fa-user fa-xl" aria-hidden="true"></i></a></li>
	                        	</c:if>
	                        </c:otherwise>
                        </c:choose>
                        
                        <c:if test="${empty loginUser}">
							<li><a href="${pageContext.request.contextPath}/user/login.jsp"><i class="fa fa-user fa-xl" aria-hidden="true"></i></a></li>
						</c:if>
                            <li><a href="#"><i class="fa fa-heart fa-xl"></i> <span>1</span></a></li>
                            <li><a href="${pageContext.request.contextPath}/cart/shoppingCart.jsp"><i class="fa fa-shopping-cart fa-xl" aria-hidden="true"></i><span>3</span></a></li>
                        </ul>
                        
                        <c:if test="${loginUser ne null}">
							<ul class="nav navbar-nav">
								<li><a href="${pageContext.request.contextPath}/front?key=member&methodName=logout"><i class="fa fa-sign-out fa-xl" aria-hidden="true"></i>
								</a></li>
							</ul>
						</c:if>
                    </div>
                </div>
            </div>
            <div class="humberger__open">
                <i class="fa fa-bars"></i>
            </div>

	</div>
    </header>
    <!-- Header Section End -->
    
    <!--
    <div id= "header" class="bb-header">

		<div class="left_menu">
			<ul>
	           <li class="active"><a href="./index.jsp">버블버블 이야기</a></li>
	           <li><a href="#">쇼핑하기</a>
	               <ul class="header__menu__dropdown">
	                   <li><a href="./shop-details.html">헤어</a></li>
	                   <li><a href="./shoping-cart.html">바디</a></li>
	                   <li><a href="./checkout.html">리빙</a></li>
	                   <li><a href="./blog-details.html">선물세트</a></li>
	                   <li><a href="./blog-details.html">소품</a></li>
	               </ul>
	           </li>
	           <li><a href="./blog.html">게시판</a></li>
	           <li><a href="./contact.html">리뷰</a></li>
	       </ul>
		</div>
		
		<h1 class="logo"><a></a></h1>
		
		<div class="right_menu">
			<ul>
	            <c:choose>
	            	<c:when test="${loginUser.memberId == 'admin'}">
	            		<li><a href="${pageContext.request.contextPath}/"><i class="fa fa-cog fa-xl"></i> 관리자</a></li>
	            	</c:when>
	           	<c:otherwise>
	             	<c:if test="${loginUser != null}">
	                	<li><a href="${pageContext.request.contextPath}/"><i class="fa fa-user fa-xl" aria-hidden="true">&nbsp ${loginUser.memberId} 님</i></a></li>
	             	</c:if>
	             </c:otherwise>
	            </c:choose>
	            
	            <c:if test="${empty loginUser}">
					<li><a href="${pageContext.request.contextPath}/user/login.jsp"><i class="fa fa-user fa-xl" aria-hidden="true"></i></a></li>
				</c:if>
	                <li><a href="#"><i class="fa fa-heart fa-xl"></i> <span>1</span></a></li>
	                <li><a href="#"><i class="fa fa-shopping-cart fa-xl" aria-hidden="true"></i><span>3</span></a></li>
	            </ul>
					            
           		<c:if test="${loginUser ne null}">
					<ul class="nav navbar-nav">
						<li><a href="${pageContext.request.contextPath}/front?key=member&methodName=logout"><i class="fa fa-sign-out fa-xl" aria-hidden="true"></i>
						</a></li>
					</ul>
				</c:if>
		</div>
	</div>

	-->
</body>
</html>