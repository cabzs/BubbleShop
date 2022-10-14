package controller;

import java.io.IOException;
import java.sql.SQLException;

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
	public void insert (HttpServletRequest request, HttpServletResponse response) throws NumberFormatException, SQLException, AuthenticationException {
		
		HttpSession session = request.getSession();
		String memberId = null;
		
		if(session.getAttribute("loginUser")==null) {
			//인증 안되었음
			throw new AuthenticationException("로그인 후 이용해주세요!");
			
		}else {
			
			Member dbmem = (Member)session.getAttribute("loginUser");
			memberId = dbmem.getMemberId();
			
			String goodsId = request.getParameter("goodsId");
			System.out.println("상품 아이디: "+goodsId);
			int goodsId1 = Integer.parseInt(goodsId);
			
//			Goods goods = goodsService.select(Integer.parseInt(memberId));
			
			int count = Integer.parseInt(request.getParameter("quantity"));
			
			Cart cart = new Cart(memberId, goodsId1 , count);
			cartService.insert(cart);
			
//			Cart cart = cartService.selectByMemberId(memberId);
	
//			CartDTO cart = cartService.getCart(userId);
//			cartService.insert(cart, goods, amount);
		}
//		return new ModelAndView("front?key=cart&methodName=select&userId="+userId, true); // 원래의 장바구니넣기한 상세페이지 머물러있어야 함!!
	}

}
