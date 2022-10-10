package dto;

import java.time.LocalDate;

public class Goods {
	private int goodsId;
	private int cateId;
	private String goodsName;
	private int goodsPrice;
	private int goodsStock;
	private String goodsDetail;
	private String goodsImg;
	private String soldState;
	private LocalDate goodsDate;
	
	
	
	public Goods(int cateId, String goodsName, int goodsPrice, int goodsStock, String goodsDetail, String soldState) {
		super();
		this.cateId = cateId;
		this.goodsName = goodsName;
		this.goodsPrice = goodsPrice;
		this.goodsStock = goodsStock;
		this.goodsDetail = goodsDetail;
		this.soldState = soldState;
	}

	public Goods(int goodsId, int cateId, String goodsName, int goodsPrice, int goodsStock, String goodsDetail,
			String goodsImg, String soldState, LocalDate goodsDate) {
		super();
		this.goodsId = goodsId;
		this.cateId = cateId;
		this.goodsName = goodsName;
		this.goodsPrice = goodsPrice;
		this.goodsStock = goodsStock;
		this.goodsDetail = goodsDetail;
		this.goodsImg = goodsImg;
		this.soldState = soldState;
		this.goodsDate = goodsDate;
	}

	public int getGoodsId() {
		return goodsId;
	}

	public void setGoodsId(int goodsId) {
		this.goodsId = goodsId;
	}

	public int getCateId() {
		return cateId;
	}

	public void setCateId(int cateId) {
		this.cateId = cateId;
	}

	public String getGoodsName() {
		return goodsName;
	}

	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}

	public int getGoodsPrice() {
		return goodsPrice;
	}

	public void setGoodsPrice(int goodsPrice) {
		this.goodsPrice = goodsPrice;
	}

	public int getGoodsStock() {
		return goodsStock;
	}

	public void setGoodsStock(int goodsStock) {
		this.goodsStock = goodsStock;
	}

	public String getGoodsDetail() {
		return goodsDetail;
	}

	public void setGoodsDetail(String goodsDetail) {
		this.goodsDetail = goodsDetail;
	}

	public String getGoodsImg() {
		return goodsImg;
	}

	public void setGoodsImg(String goodsImg) {
		this.goodsImg = goodsImg;
	}

	public String getSoldState() {
		return soldState;
	}

	public void setSoldState(String soldState) {
		this.soldState = soldState;
	}

	public LocalDate getGoodsDate() {
		return goodsDate;
	}

	public void setGoodsDate(LocalDate goodsDate) {
		this.goodsDate = goodsDate;
	}
	
	

}
