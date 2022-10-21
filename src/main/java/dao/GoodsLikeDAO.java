package dao;

import java.sql.SQLException;
import java.util.List;

import dto.GoodsLike;

public interface GoodsLikeDAO {
	/**
	 * 찜하기 목록 추가
	 * */
	int insert(GoodsLike goodsLike) throws SQLException;
	
	/**
	 * 내가 찜한 목록 조회
	 * */
	List<GoodsLike> selectAll(String memberId) throws SQLException;

}
