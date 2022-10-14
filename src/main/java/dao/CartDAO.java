package dao;

import java.sql.SQLException;

import dto.Cart;

public interface CartDAO {
	/**
	 * 장바구니 등록
	 * */
	int insert(Cart cart) throws SQLException;
	
	
	/**
	 * 장바구니 수정
	 * */
	Cart update(Cart cart) throws SQLException;
	
	
	/**
	 * 장바구니 삭제
	 * */
	int delete(String cartId) throws SQLException;
	
	
	/**
	 * 사용자 아이디로 장바구니 가져오기
	 * */
	Cart selectByMemberId(String memberId) throws SQLException;
	

}
