package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

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
	public List<GoodsLike> selectAll() throws SQLException {
		Connection con=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		
		List<GoodsLike> list = new ArrayList<GoodsLike>();
		String sql = proFile.getProperty("goodsLike.selectAll");
		
		try {
			con = DbUtil.getConnection();
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()) {
				goodsLike = new GoodsLike(rs.getInt(1), rs.getInt(2), rs.getString(3));
				list.add(goodsLike);
			}
			
		} finally {
			DbUtil.dbClose(rs, ps, con);
		}
		
		return list;
	}

}
