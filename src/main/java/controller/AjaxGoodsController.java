package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dto.Goods;
import service.GoodsService;
import service.GoodsServiceImpl;

public class AjaxGoodsController implements AjaxController {
	
	private GoodsService service = new GoodsServiceImpl();

	@Override
	public void handleRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub

	}
	
	/**
	 * 상품 등록
	 * */
	/*
	public void insert(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		
		int result =0 ;
		
		//goodsDTO에 들어갈 내용
		String cateId = request.getParameter("cateId");
		String goodsName = request.getParameter("goodsName");
		String goodsPrice = request.getParameter("goodsPrice");
		String goodsStock = request.getParameter("goodsStock");
		String goodsDetail = request.getParameter("goodsDetail");
		String soldState = request.getParameter("soldState");

	    Goods goods = new Goods(Integer.parseInt(cateId), goodsName, Integer.parseInt(goodsPrice), Integer.parseInt(goodsStock),
	    goodsDetail, soldState); 
	    
	    result =service.insert(goods); 

	    PrintWriter out = response.getWriter(); 
	    out.print(result); //0,1
	    
	} */
	
	/**
	 * 상품 수정
	 * */
	
	/**
	 * 상품 삭제
	 * */
	
	/**
	 * 상품 조회
	 * */

}
