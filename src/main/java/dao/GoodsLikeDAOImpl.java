package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import dto.Goods;
import dto.GoodsLike;
import util.DbUtil;

public class GoodsLikeDAOImpl implements GoodsLikeDAO {
	
	private Properties proFile = DbUtil.getProFile();
	private GoodsLike goodsLike;

	@Override
	public int insert(GoodsLike goodsLike) throws SQLException {
		Connection con = null;
		PreparedStatement ps =null;
		int result = 0;
		String sql = proFile.getProperty("goodsLike.insert");
		
		try {
			con = DbUtil.getConnection();
			ps = con.prepareStatement(sql);
			ps.setInt(1, goodsLike.getGoodsId());
			ps.setString(2, goodsLike.getMemberId());
			
			result = ps.executeUpdate();
			
		}finally {
			DbUtil.dbClose(ps, con);
		}
		
		return result;
	}

	@Override
	public List<GoodsLike> selectAll(String memberId) throws SQLException {
		Connection con=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		
		GoodsLike goodsLike;
		List<GoodsLike> list = new ArrayList<GoodsLike>();
		String sql = proFile.getProperty("goodsLike.selectAll");
		
		try {
			con = DbUtil.getConnection();
			ps = con.prepareStatement(sql);
			ps.setString(1, memberId);
			
			rs = ps.executeQuery();
			while(rs.next()) {
				goodsLike = new GoodsLike();
				goodsLike.setGoods(new Goods());
				goodsLike.getGoods().setGoodsId(rs.getInt(1));
				goodsLike.getGoods().setGoodsName(rs.getString(2));
				goodsLike.getGoods().setGoodsPrice(rs.getInt(3));
				goodsLike.getGoods().setGoodsImg(rs.getString(4));
				goodsLike.getGoods().setGoodsStock(rs.getInt(5));
				
				list.add(goodsLike);
			}
			
		} finally {
			DbUtil.dbClose(rs, ps, con);
		}
		
		return list;
	}

}
