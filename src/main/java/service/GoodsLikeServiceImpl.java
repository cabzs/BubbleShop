package service;

import java.sql.SQLException;
import java.util.List;

import dao.GoodsLikeDAO;
import dao.GoodsLikeDAOImpl;
import dto.GoodsLike;

public class GoodsLikeServiceImpl implements GoodsLikeService {
	
	private GoodsLikeDAO dao = new GoodsLikeDAOImpl();

	@Override
	public void insert(GoodsLike goodsLike) throws SQLException {
		int result = dao.insert(goodsLike);
		if(result == 0) {
			throw new SQLException("좋아요 입력 실패");
		}

	}

	@Override
	public List<GoodsLike> selectAll(String memberId) throws SQLException {
		List<GoodsLike> likeList = dao.selectAll(memberId);
		if(likeList == null) {
			throw new SQLException("목록을 불러오지 못했습니다.");
		}
		return likeList;
	}

}
