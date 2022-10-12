package service;

import java.sql.SQLException;
import java.util.List;

import dao.GoodsDAO;
import dao.GoodsDAOImpl;
import dto.Goods;

public class GoodsServiceImpl implements GoodsService {
	
	private GoodsDAO dao = new GoodsDAOImpl();

	@Override
	public int insert(Goods goods) throws SQLException {
		int result = dao.insert(goods);
		if(result > 0) {
			System.out.println("상품 등록 성공");
		}
		return result;
	}

	@Override
	public int delete(int goodsNo) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(int goodsNo) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Goods> selectAll() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Goods> selectNew() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Goods> selectLike() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Goods> selectSell() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

}
