package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

import dto.Member;
import util.DbUtil;

public class MemberDAOImpl implements MemberDAO {
	
	private Properties proFile = DbUtil.getProFile();

	@Override
	public int insert(Member member) throws SQLException {
		System.out.println("insert!!");
		Connection con = null;
		PreparedStatement ps =null;
		int result = 0;
		String sql = proFile.getProperty("member.insert");
		
		try {
			con = DbUtil.getConnection();
			ps = con.prepareStatement(sql);
			ps.setString(1, member.getMemberId());
			ps.setString(2, member.getMemberPwd());
			ps.setString(3, member.getMemberName());
			ps.setString(4, member.getEmail());
			ps.setString(5, member.getPhone());
			ps.setString(6, member.getAddress());
			ps.setString(7, member.getAddressDetail());
			ps.setString(8, member.getAddressCode());
			
			result = ps.executeUpdate();
			
		}finally {
			DbUtil.dbClose(ps, con);
		}
		
		return result;

	}

	@Override
	public boolean idCheck(String memberId) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Member login(String memberId, String memberPwd) throws SQLException {
		Connection con = null;
		PreparedStatement ps =null;
		ResultSet rs = null;
		
		Member member = null;
		
		String sql = proFile.getProperty("member.login");
		
		try {
			con = DbUtil.getConnection();
			ps = con.prepareStatement(sql);
			ps.setString(1, memberId);
			ps.setString(2, memberPwd);
			
			rs = ps.executeQuery();
			if(rs.next()) {
				member = new Member(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getDate(6).toLocalDate()
						, rs.getString(7), rs.getString(8), rs.getString(9));
			}
			
		} finally {
			DbUtil.dbClose(rs, ps, con);
		}
		return member;
		
		
	}

	@Override
	public Member update(Member member) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public void withdrawal(String memberId, String memberPwd) throws SQLException {
		// TODO Auto-generated method stub

	}

}
