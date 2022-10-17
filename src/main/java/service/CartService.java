package service;

import java.sql.SQLException;
import java.util.List;

import dto.Cart;

public interface CartService {
	
	/**
	 * 장바구니 등록
	 * */
	void insert(Cart cart) throws SQLException; 
	
	/**
	 * 장바구니 일부 품목 삭제
	 * */
	
	
	/**
	 * 장바구니 전체 삭제
	 * */
	
	
	/**
	 * 장바구니 정보 확인
	 * */
	Cart selectAll(String cartId) throws SQLException;
	
	/**
	 * 사용자 아이디로 장바구니 가져오기
	 * */
	List<Cart> selectByMemberId(String memberId) throws SQLException;

}
