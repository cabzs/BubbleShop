package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import dto.Qna;
import util.DbUtil;

public class QnaDAOImpl implements QnaDAO {
	
	private Properties proFile = DbUtil.getProFile();
	private Qna qna;

	@Override
	public int insert(Qna qna) throws SQLException {
		Connection con = null;
		PreparedStatement ps =null;
		int result = 0;
		String sql = proFile.getProperty("qna.insert");
		
		try {
			con = DbUtil.getConnection();
			ps = con.prepareStatement(sql);
			ps.setString(1, qna.getMemberId());
			ps.setString(2, qna.getQnaTitle());
			ps.setString(3, qna.getQnaContent());
			ps.setString(4, qna.getQnaSecret());
			
			result = ps.executeUpdate();
			
		}finally {
			DbUtil.dbClose(ps, con);
		}
		
		return result;
	}

	@Override
	public Qna update(Qna qna) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int delete(Qna qna) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Qna> selectAll() throws SQLException {
		Connection con=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		
		List<Qna> list = new ArrayList<Qna>();
		String sql = proFile.getProperty("qna.selectAll");
		
		try {
			con = DbUtil.getConnection();
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			//int qnaId, String memberId, String qnaTitle, 
			//String qnaContent, LocalDate qnaDate, String qnaSecret
			while(rs.next()) {
				qna = new Qna(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getDate(5).toLocalDate(), rs.getString(6));
				list.add(qna);
			}
			
		} finally {
			DbUtil.dbClose(rs, ps, con);
		}
		
		return list;
	}

	@Override
	public List<Qna> selectById(String memberId) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Qna selectByNo(String qnaNo) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateState(String qnaSecret) throws SQLException {
		// TODO Auto-generated method stub

	}

}
