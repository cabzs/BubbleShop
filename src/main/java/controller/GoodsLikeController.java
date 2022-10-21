package controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dto.GoodsLike;
import dto.Member;
import exception.AuthenticationException;
import service.GoodsLikeService;
import service.GoodsLikeServiceImpl;

public class GoodsLikeController implements Controller {
	
	private GoodsLikeService service = new GoodsLikeServiceImpl();

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		return null;
	}
	
	/**
	 * 버튼 클릭시 찜하기 누적 (아이디당 한번만 가능)
	 * @throws SQLException 
	 * */
	public ModelAndView insert(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException {
		
		HttpSession session = request.getSession();
		String memberId = null;
		
		Member dbmem = (Member)session.getAttribute("loginUser");
		memberId = dbmem.getMemberId();
		
		String goodsId = request.getParameter("goodsId");
		System.out.println(goodsId);
		
		GoodsLike goodsLike = new GoodsLike(0, Integer.parseInt(goodsId), memberId);
		service.insert(goodsLike);
		
		return new ModelAndView("/front?key=goods&methodName=selectAll", true);
		
	}
	
	/**
	 * 내가 찜한 목록 조회
	 * @throws AuthenticationException 
	 * */
	public ModelAndView selectAll (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, AuthenticationException {
		List<GoodsLike> likeList = null;
		
		HttpSession session = request.getSession();
		
		if(session.getAttribute("loginUser")==null) {
			//인증 안되었음
			throw new AuthenticationException("로그인 후 이용해주세요!");
			
		} else {
			try {
				Member dbmem = (Member)session.getAttribute("loginUser");
				String memberId = dbmem.getMemberId();
				
				likeList = service.selectAll(memberId);
				
			} catch (Exception e) {
				e.printStackTrace();
				return new ModelAndView("error/error.jsp");
			}
		}
		request.setAttribute("likeList", likeList);		
		return new ModelAndView("user/like.jsp");
	}
}
