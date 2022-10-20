package service;

import java.sql.SQLException;
import java.util.List;

import dto.Qna;

public interface QnaService {
	/**
	 * Qna 등록
	 * */
	void insert (Qna qna) throws SQLException;
	
	/**
	 * Qna 수정
	 * */
	Qna update(Qna qna) throws SQLException;
	
	/**
	 * Qna 삭제
	 * */
	void delete(Qna qna) throws SQLException;
	
	/**
	 * Qna 목록 조회
	 * */
	List<Qna> selectAll() throws SQLException;
	
	/**
	 * Qna 내가 쓴 글 조회
	 * */
	List<Qna> selectById(String memberId) throws SQLException;
	
	/**
	 * Qna 글번호로 검색
	 * */
	Qna selectByNo(String qnaNo) throws SQLException;
	
	/**
	 * Qna 상태변경 (비밀글 여부)
	 * */
	void updateState(String qnaSecret) throws SQLException;

}
