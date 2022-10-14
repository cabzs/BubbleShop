package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import dto.Goods;
import util.DbUtil;

public class GoodsDAOImpl implements GoodsDAO {
	
	private Properties proFile = DbUtil.getProFile();
	private Goods goods;

	@Override
	public int insert(Goods goods) throws SQLException {
		Connection con = null;
		PreparedStatement ps =null;
		int result = 0;
		String sql = proFile.getProperty("goods.insert");
		
		try {
			con = DbUtil.getConnection();
			ps = con.prepareStatement(sql);
			ps.setInt(1, goods.getCateId());
			ps.setString(2,goods.getGoodsName());
			ps.setInt(3, goods.getGoodsPrice());
			ps.setInt(4, goods.getGoodsStock());
			ps.setString(5, goods.getGoodsDetail());
			ps.setString(6, goods.getGoodsImg());
			ps.setString(7, goods.getSoldState());
			
			result = ps.executeUpdate();
			
		}finally {
			DbUtil.dbClose(ps, con);
		}
		
		return result;
	}

	@Override
	public int delete(int goodsNo) throws SQLException {
		Connection con = null;
		PreparedStatement ps =null;
		int result = 0;
		String sql = proFile.getProperty("goods.delete");
		
		try {
			con = DbUtil.getConnection();
			ps = con.prepareStatement(sql);
			ps.setInt(1, goods.getGoodsId());
			result = ps.executeUpdate();
			
		}finally {
			DbUtil.dbClose(ps, con);
		}
		
		return result;
	}

	@Override
	public int update(Goods goods) throws SQLException {
		Connection con = null;
		PreparedStatement ps =null;
		int result = 0;
		String sql = proFile.getProperty("goods.update");
		
		try {
			con = DbUtil.getConnection();
			con.setAutoCommit(false);
			ps = con.prepareStatement(sql);
			
			ps.setInt(1, goods.getCateId());
			ps.setString(2, goods.getGoodsName());
			ps.setInt(3, goods.getGoodsPrice());
			ps.setInt(4, goods.getGoodsStock());
			ps.setString(5, goods.getGoodsDetail());
			ps.setString(6, goods.getGoodsImg());
			ps.setString(6, goods.getSoldState());
			
			result = ps.executeUpdate(); //수정되면 1
			
			if(result==0) {
				   con.rollback();
				   throw new SQLException("상품 수정 실패");
			}
			
			con.commit();
			
		} finally {
			con.rollback();
			DbUtil.dbClose(ps, con);
		}
		return result;
	}
	
	@Override
	public Goods select(int goodsNo) throws SQLException {
		Connection con=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		
		String sql=proFile.getProperty("goods.selectByGoodsCode");
		
		try {
			con = DbUtil.getConnection();
			ps = con.prepareStatement(sql);
			ps.setInt(1, goodsNo);
			
			rs = ps.executeQuery();
			while(rs.next()) {
				goods = new Goods(rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getInt(4),
						rs.getInt(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getDate(9).toLocalDate());
				
			}
		} finally {
			DbUtil.dbClose(rs, ps, con);
		}
		
		return goods;
	}

	@Override
	public List<Goods> selectAll() throws SQLException {
		Connection con=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		
		List<Goods> list = new ArrayList<Goods>();
		String sql=proFile.getProperty("goods.selectAll");
		
		try {
			con = DbUtil.getConnection();
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()) {
				goods = new Goods(rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getInt(4),
						rs.getInt(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getDate(9).toLocalDate());
				
				list.add(goods);
			}
		} finally {
			DbUtil.dbClose(rs, ps, con);
		}

		
		return list;
	}

	@Override
	public List<Goods> selectNew() throws SQLException {
		Connection con=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		
		List<Goods> list = new ArrayList<Goods>();
		
		String sql=proFile.getProperty("goods.selectNew");
		
		try {
			con = DbUtil.getConnection();
			ps = con.prepareStatement(sql);
			
			rs = ps.executeQuery();
			while(rs.next()) {
				goods = new Goods(rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getInt(4),
						rs.getInt(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getDate(9).toLocalDate());
				list.add(goods);
			}
		} finally {
			DbUtil.dbClose(rs, ps, con);
		}
		
		return list;
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

	@Override
	public List<Goods> selectByCate(int cateId) throws SQLException {
		Connection con=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		
		List<Goods> list = new ArrayList<Goods>();
		
		String sql=proFile.getProperty("goods.selectByCate");
		
		try {
			con = DbUtil.getConnection();
			ps = con.prepareStatement(sql);
			ps.setInt(1, cateId);
			
			rs = ps.executeQuery();
			while(rs.next()) {
				goods = new Goods(rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getInt(4),
						rs.getInt(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getDate(9).toLocalDate());
				list.add(goods);
			}
		} finally {
			DbUtil.dbClose(rs, ps, con);
		}
		
		return list;
	}


}
