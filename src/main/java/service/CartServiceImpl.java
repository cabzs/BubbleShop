package service;

import java.sql.SQLException;
import java.util.List;

import dao.CartDAO;
import dao.CartDAOImpl;
import dto.Cart;

public class CartServiceImpl implements CartService {
	
	private CartDAO dao = new CartDAOImpl(); 
	

	@Override
	public void insert(Cart cart) throws SQLException {
		dao.insert(cart);
	}

	@Override
	public Cart selectAll(String cartId) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Cart> selectByMemberId(String memberId) throws SQLException {
		
		return dao.selectByMemberId(memberId);
	}

	@Override
	public List<Cart> selectInfoById(String memberId) throws SQLException {
		if(memberId == null) {
			throw new SQLException("아이디를 확인해주세요");
		}
		List<Cart> cartList = dao.selectInfoById(memberId);
		
		if(cartList == null) {
			throw new SQLException("장바구니를 가져올 수 없습니다.");
		}
		
		return cartList;
	}

}
