package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dto.Member;
import service.MemberService;
import service.MemberServiceImpl;

public class MemberController implements Controller {
	
	private MemberService service = new MemberServiceImpl();

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		return null;
	}
	
	/**
	 * 회원가입
	 * */
	public ModelAndView insert(HttpServletRequest request, HttpServletResponse response) throws Exception {
		System.out.println("회원가입");
		
		String memberId = request.getParameter("memberId");
		String memberPwd = request.getParameter("memberPwd");
		String memberName = request.getParameter("memberName");
		String email = request.getParameter("email");
		String phone = request.getParameter("phone");
		String address = request.getParameter("address");
		String addressDetail = request.getParameter("addressDetail");
		String addressCode = request.getParameter("addressCode");
		
		System.out.println("아이디:"+memberId);
		
		//id 중복검사
		service.idCheck(memberId);
		
		//회원가입
		service.insert(new Member(memberId, memberPwd, memberName, email, phone, address, addressDetail, addressCode));
		
		request.setAttribute("memberName", memberName);
		request.setAttribute("memberId", memberId);
		
		return new ModelAndView("index.jsp",true);
		
	}
	
	/**
	 * 로그인
	 * */
	public ModelAndView login(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String memberId = request.getParameter("memberId");
		String memberPwd = request.getParameter("memberPwd");
		
		Member member = service.login(memberId, memberPwd);
		
		HttpSession session = request.getSession();
		session.setAttribute("loginUser", member);
		
		return new ModelAndView("index.jsp", true);
	}
	
	/**
	 * 로그아웃
	 * */
	public ModelAndView logout(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		
		//모든 세션의 정보를 삭제
		HttpSession session = request.getSession();
		session.invalidate();
		
		return new ModelAndView("index.jsp", true);
	}

}
