package service;

import java.sql.SQLException;
import java.util.List;

import dao.QnaDAO;
import dao.QnaDAOImpl;
import dto.Qna;

public class QnaServiceImpl implements QnaService {
	
	private QnaDAO dao = new QnaDAOImpl();

	@Override
	public void insert(Qna qna) throws SQLException {
		int result = dao.insert(qna);
		if(result == 0 ) {
			throw new SQLException("게시물 등록에 실패했습니다");
		}
	}

	@Override
	public Qna update(Qna qna) throws SQLException {
		Qna dbqna = dao.update(qna);
		if(dbqna == null) {
			throw new SQLException("게시물 수정에 실패했습니다");
		}
		return dbqna;
	}

	@Override
	public void delete(Qna qna) throws SQLException {
		int result = dao.delete(qna);
		if(result == 0 ) {
			throw new SQLException("게시물 삭제에 실패했습니다");
		}
	}

	@Override
	public List<Qna> selectAll() throws SQLException {
		List<Qna> qnaList = dao.selectAll();
		if(qnaList == null) {
			throw new SQLException("게시물 불러오기에 실패했습니다");
		}
		return qnaList;
	}

	@Override
	public List<Qna> selectById(String memberId) throws SQLException {
		List<Qna> qnaList = dao.selectById(memberId);
		if(qnaList == null) {
			throw new SQLException("게시물 불러오기에 실패했습니다");
		}
		return qnaList;
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
