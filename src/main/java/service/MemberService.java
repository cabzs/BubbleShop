package service;

import java.sql.SQLException;

import dto.Member;
import exception.AuthenticationException;

public interface MemberService {
	/**
	 * 회원가입
	 * */
	public void insert(Member member) throws SQLException, AuthenticationException ;
	
	/**
	 * 아이디 중복체크
	 * */
	public boolean idCheck(String memberId) throws SQLException;
	
	/**
	 * 로그인
	 * */
	public Member login(String memberId, String memberPwd) throws SQLException, AuthenticationException ;
	
	/**
	 * 회원 정보 수정
	 * */
	public Member update(Member member) throws SQLException;
	

	/**
	 * 회원 탈퇴
	 * */
	public void withdrawal(String memberId, String memberPwd) throws SQLException;

}
