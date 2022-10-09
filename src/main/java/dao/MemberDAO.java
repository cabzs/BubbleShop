package dao;

import java.sql.SQLException;

import dto.Member;

public interface MemberDAO {
	/**
	 * 회원가입
	 * */
	public int insert(Member member) throws SQLException;
	
	/**
	 * 아이디 중복체크
	 * */
	public boolean idCheck(String memberId) throws SQLException;
	
	/**
	 * 로그인
	 * */
	public Member login(String memberId, String memberPwd) throws SQLException;
	
	/**
	 * 회원 정보 수정
	 * */
	public Member update(Member member) throws SQLException;
	
	
	/**
	 * 회원 탈퇴
	 * */
	public void withdrawal(String memberId, String memberPwd) throws SQLException;

}
