package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

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
	 * 상품 등록 , 이미지 넣기 insertGoodsImg
	 * */
	public ModelAndView insert(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		
		String saveDir = request.getServletContext().getRealPath("/img");
		int maxSize = 1024 * 1024 * 100;// 100M
		String encoding = "UTF-8";
		
		MultipartRequest m = 
				new MultipartRequest(request, saveDir, maxSize, encoding, new DefaultFileRenamePolicy());
		
		String cateId = m.getParameter("cateId");
		String goodsName = m.getParameter("goodsName");
		String goodsPrice = m.getParameter("goodsPrice");
		String goodsStock = m.getParameter("goodsStock");
		String goodsDetail = m.getParameter("goodsDetail");
		String soldState = m.getParameter("soldState");
		
		//파일명 구해오기
		System.out.println(m.getFilesystemName("goodsImg"));

		Goods goods = new Goods(Integer.parseInt(cateId), goodsName, Integer.parseInt(goodsPrice), Integer.parseInt(goodsStock),
			    goodsDetail, m.getFilesystemName("goodsImg"), soldState);
		  
		service.insert(goods);
		
		request.setAttribute("goods", goods);
		
		return new ModelAndView("front?key=goods&methodName=selectAllAdmin",true);
	}
	
	
	
	
	/**
	 * 상품 전체 검색 - 회원
	 * */
	public ModelAndView selectAll(HttpServletRequest request, HttpServletResponse response){
		response.setContentType("text/html;charset=UTF-8");
		
		List<Goods> list = null;
		try {
			list = service.selectAll();
		} catch (Exception e) {
			e.printStackTrace();
			return new ModelAndView("error/error.jsp");
		}
		
		
		request.setAttribute("goodsList", list);
		return new ModelAndView("/goods/goodsList.jsp");
	}
	
	
	/**
	 * 상품 전체 검색 - 관리자
	 * */
	public ModelAndView selectAllAdmin (HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		response.setContentType("text/html;charset=UTF-8");
		
		List<Goods> list = null;
		
		list = service.selectAll();
		
		request.setAttribute("list", list);
		
		return new ModelAndView("/admin/adminGoods.jsp");
	
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
	 * 상품 상세페이지
	 * */
	public ModelAndView goodsView(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String goodsId = request.getParameter("goodsId");
		System.out.println(goodsId);
		
		//상품 번호로 상품 객체구해온다
		Goods goods = service.select(Integer.parseInt(goodsId));
		System.out.println(goods);
		request.setAttribute("goodsList", goods);
		ModelAndView mv = new ModelAndView("goods/goodsDetail.jsp");
		return mv;
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
	
	/**
	 * 상품 카테고리별 정렬
	 * */
	public ModelAndView selectByCate (HttpServletRequest request, HttpServletResponse response) {
		List<Goods> list = null;
		
		String cateId = request.getParameter("cateId");
		
		try {
			list = service.selectByCate(Integer.parseInt(cateId));
		} catch (Exception e) {
			e.printStackTrace();
			return new ModelAndView("error/error.jsp");
		}
		
		request.setAttribute("goodsList", list);
		return new ModelAndView("/goods/goodsList.jsp");
	}
	
	

}
