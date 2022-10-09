package service;

import java.sql.SQLException;

import dao.MemberDAO;
import dao.MemberDAOImpl;
import dto.Member;
import exception.AuthenticationException;

public class MemberServiceImpl implements MemberService {
	
	private MemberDAO dao = new MemberDAOImpl();

	@Override
	public void insert(Member member) throws SQLException, AuthenticationException {
		int result = dao.insert(member);
		if(result ==0 )
			throw new AuthenticationException("회원 가입에 실패했습니다.");
	}

	@Override
	public boolean idCheck(String memberId) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Member login(String memberId, String memberPwd) throws SQLException,  AuthenticationException {
		Member member = dao.login(memberId, memberPwd);
		if(member ==null) 
			throw new AuthenticationException("회원 정보를 다시 입력해주세요.");
		
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
