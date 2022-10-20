package controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dto.Member;
import dto.Qna;
import exception.AuthenticationException;
import service.QnaService;
import service.QnaServiceImpl;

public class QnaController implements Controller {
	
	private QnaService qnaService = new QnaServiceImpl();

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		return null;
	}
	
	/**
	 * 글쓰기
	 * */
	public ModelAndView insert (HttpServletRequest request, HttpServletResponse response) throws AuthenticationException, SQLException {
		
		HttpSession session = request.getSession();
		String memberId = null;
		
		if(session.getAttribute("loginUser")==null) {
			//인증 안되었음
			throw new AuthenticationException("로그인 후 이용해주세요!");
			
		}else {
			Member dbmem = (Member)session.getAttribute("loginUser");
			memberId = dbmem.getMemberId();
			System.out.println("회원 아이디: " + memberId);
			
			String qnaTitle = request.getParameter("qnaTitle");
			String qnaContent = request.getParameter("qnaContent");
			String qnaSecret = request.getParameter("qnaSecret");
			
			System.out.println("비밀글=" + qnaSecret);
			
			Qna qna = new Qna(memberId, qnaTitle, qnaContent, qnaSecret);
			qnaService.insert(qna);
		}
		
		return new ModelAndView("front?key=qnaBoard&methodName=selectAll",true);
	}
	
	/**
	 * 목록 보기
	 * */
	public ModelAndView selectAll (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Qna> list = null;
		
		try {
			list = qnaService.selectAll();
		} catch (Exception e) {
			e.printStackTrace();
			return new ModelAndView("error/error.jsp");
		}
		
		request.setAttribute("qnaList", list);
		return new ModelAndView("/board/QnaList.jsp");
	}
	
	/**
	 * 회원별 내가 쓴 문의 목록 보기
	 * */
	public ModelAndView selectById (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession();
		String memberId = null;
		
		List<Qna> list = null;
		
		try {
			Member dbmem = (Member)session.getAttribute("loginUser");
			memberId = dbmem.getMemberId();

			list = qnaService.selectById(memberId);
		} catch (Exception e) {
			e.printStackTrace();
			return new ModelAndView("error/error.jsp");
		}
		
		request.setAttribute("qnaList", list);
		return new ModelAndView("/board/qnaList.jsp");
	}

}
