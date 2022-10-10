package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dto.Goods;
import service.GoodsService;
import service.GoodsServiceImpl;

public class GoodsController implements Controller {
	
	private GoodsService service = new GoodsServiceImpl();

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
			list = service.selectAll();
		} catch (Exception e) {
			e.printStackTrace();
			return new ModelAndView("error/error.jsp");
		}
		
		
		request.setAttribute("goodsList", list);
		return new ModelAndView("index.jsp");
	}
	
	/**
	 * 상품 최신 입고순 정렬
	 * */
	public ModelAndView selectNew (HttpServletRequest request, HttpServletResponse response){
		List<Goods> list = null;
		
		try {
			list = service.selectNew();
		} catch (Exception e) {
			e.printStackTrace();
			return new ModelAndView("error/error.jsp");
		}
		
		request.setAttribute("goodsList", list);
		return new ModelAndView("index.jsp");
	}
	
	/**
	 * 상품 찜하기 순 정렬
	 * */
	public ModelAndView selectLike(HttpServletRequest request, HttpServletResponse response){
		List<Goods> list = null;
		
		try {
			list = service.selectLike();
		} catch (Exception e) {
			e.printStackTrace();
			return new ModelAndView("error/error.jsp");
		}
		
		request.setAttribute("goodsList", list);
		return new ModelAndView("index.jsp");
		
	}
	
	/**
	 * 상품 판매순 정렬
	 * */
	public ModelAndView selectSell (HttpServletRequest request, HttpServletResponse response){
		List<Goods> list = null;
		
		try {
			list = service.selectSell();
		} catch (Exception e) {
			e.printStackTrace();
			return new ModelAndView("error/error.jsp");
		}
		
		request.setAttribute("goodsList", list);
		return new ModelAndView("index.jsp");
		
		
	}

}
