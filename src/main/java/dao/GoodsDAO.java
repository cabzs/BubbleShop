package dao;

import java.sql.SQLException;
import java.util.List;

import dto.Goods;

public interface GoodsDAO {
	
	/**
	 * 상품 등록
	 * @return : -1: 성공, 0: 실패
	 * */
	int insert(Goods goods) throws SQLException;
	
	/**
	 * 상품 코드로 상품 삭제
	 * */
	int delete(int goodsNo) throws SQLException;
	
	/**
	 * 상품 코드로 상품 수정
	 * */
	int update(int goodsNo) throws SQLException;
	
	/**
	 * 상품 전체 검색
	 * */
	List<Goods> selectAll() throws SQLException;
	
	/**
	 * 최신 입고순으로 4개 가져오기
	 * */
	List<Goods> selectNew() throws SQLException;
	
	/**
	 * 찜하기 높은 순 정렬
	 * */
	List<Goods> selectLike() throws SQLException;
	
	/**
	 * 인기순 (판매순) 정렬
	 * */
	List<Goods> selectSell() throws SQLException;
	
	
}
