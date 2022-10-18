package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import dto.Cart;
import dto.Goods;
import util.DbUtil;

public class CartDAOImpl implements CartDAO {
	
	private Properties proFile = DbUtil.getProFile();

	@Override
	public int insert(Cart cart) throws SQLException {
		Connection con = null;
		PreparedStatement ps =null;
		int result = 0;
		String sql = proFile.getProperty("cart.insert");
		
		try {
			con = DbUtil.getConnection();
			ps = con.prepareStatement(sql);
			ps.setString(1, cart.getMemberId());
			ps.setInt(2, cart.getCount());
			ps.setInt(3, cart.getGoodsId());
			
			result = ps.executeUpdate();
			
		}finally {
			DbUtil.dbClose(ps, con);
		}
		
		return result;
	}

	@Override
	public Cart update(Cart cart) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int delete(String cartId) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	
	@Override
	public List<Cart> selectByMemberId(String memberId) throws SQLException {
		Connection con=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		
		Cart cart;
		List<Cart> cartList = new ArrayList<Cart>();
		
		String sql=proFile.getProperty("cart.selectByMemberId");
		
		try {
			con = DbUtil.getConnection();
			ps = con.prepareStatement(sql);
			ps.setString(1, memberId);
			
			rs = ps.executeQuery();
			while(rs.next()) {
				cart = new Cart(0, null, rs.getInt(4), null, null, 0);
				cart.setGoods(new Goods());
				cart.getGoods().setGoodsId(rs.getInt(1));
				cart.getGoods().setGoodsName(rs.getString(2));
				cart.getGoods().setGoodsPrice(rs.getInt(3));
				cart.getGoods().setGoodsImg(rs.getString(5));
				cartList.add(cart);
				
			}
		} finally {
			DbUtil.dbClose(rs, ps, con);
		}
		
		return cartList;
	}

}
