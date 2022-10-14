package service;

import java.sql.SQLException;

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
	public Cart selectByMemberId(String memberId) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

}
