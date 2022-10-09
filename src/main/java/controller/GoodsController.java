package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dto.Goods;

public class GoodsController implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		return null;
	}
	
	/**
	 * 상품 전체 검색
	 * */
	public ModelAndView searchSelectAll(HttpServletRequest request, HttpServletResponse response){
		response.setContentType("text/html;charset=UTF-8");
		
		List<Goods> list = null;
		try {
			
		} catch (Exception e) {
			e.printStackTrace();
			return new ModelAndView("error/error.jsp");
		}
		
		
		request.setAttribute("goodsList", list);
		return new ModelAndView("index.jsp");
	}
	

}
