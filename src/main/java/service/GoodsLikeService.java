package service;

import java.sql.SQLException;
import java.util.List;

import dto.GoodsLike;

public interface GoodsLikeService {
	
	/**
	 * 찜하기 목록 추가
	 * */
	void insert(GoodsLike goodsLike) throws SQLException;
	
	/**
	 * 내가 찜한 목록 조회
	 * */
	List<GoodsLike> selectAll() throws SQLException;
	

}
