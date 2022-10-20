package controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dto.Cart;
import dto.Goods;
import dto.Member;
import exception.AuthenticationException;
import service.CartService;
import service.CartServiceImpl;
import service.GoodsService;
import service.GoodsServiceImpl;


public class CartController implements Controller {
	
	private GoodsService goodsService = new GoodsServiceImpl();
	private CartService cartService = new CartServiceImpl();

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		return null;
	}
	
	/**
	 * 장바구니에 담기
	 * @throws SQLException 
	 * @throws NumberFormatException 
	 * @throws AuthenticationException 
	 * */
	public ModelAndView insert (HttpServletRequest request, HttpServletResponse response) throws NumberFormatException, SQLException, AuthenticationException {
		
		HttpSession session = request.getSession();
		String memberId = null;
		String goodsId = null;
		
		if(session.getAttribute("loginUser")==null) {
			//인증 안되었음
			throw new AuthenticationException("로그인 후 이용해주세요!");
			
		}else {
			
			Member dbmem = (Member)session.getAttribute("loginUser");
			memberId = dbmem.getMemberId();
			
			goodsId = request.getParameter("goodsId");
			System.out.println("상품 아이디: "+goodsId);
			int goodsId1 = Integer.parseInt(goodsId);
			
			int count = Integer.parseInt(request.getParameter("quantity"));
			
			Cart cart = new Cart(memberId, goodsId1 , count);
			cartService.insert(cart);
			
		}
		return new ModelAndView("front?key=goods&methodName=goodsView&goodsId="+goodsId, true); // 원래의 장바구니넣기한 상세페이지 머물러있어야 함!!
	}
	
	/**
	 * 장바구니 조회하기
	 * @throws SQLException 
	 * */
	public ModelAndView selectAll (HttpServletRequest request, HttpServletResponse response) throws AuthenticationException, SQLException {
		
		HttpSession session = request.getSession();
		String memberId = null;
		List<Cart> cartList = new ArrayList<Cart>();
		
		if(session.getAttribute("loginUser")==null) {
			//인증 안되었음
			throw new AuthenticationException("로그인 후 조회 가능합니다.");
			
		}else {
			Member dbmem = (Member)session.getAttribute("loginUser");
			memberId = dbmem.getMemberId();
			
			cartList = cartService.selectByMemberId(memberId);
			
		}
		
		request.setAttribute("cartList", cartList);
		return new ModelAndView("cart/shoppingCart.jsp");
		
	}
	
	/**
	 * 장바구니에서 주문 폼으로 이동
	 * @throws SQLException 
	 * */
	public ModelAndView cartOrder(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException {
		HttpSession session = request.getSession();
		List<Cart> cartList = new ArrayList<Cart>();
		

		
		Member dbmem = (Member)session.getAttribute("loginUser");
		String memberId = dbmem.getMemberId();

		cartList = cartService.selectInfoById(memberId);
		
		session.setAttribute("cartList", cartList);

		return new ModelAndView("cart/cartOrder.jsp" , true);
	}
	
	
}
