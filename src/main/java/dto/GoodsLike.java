package dto;

public class GoodsLike {
	private int goodsLikeId;
	private int goodsId;
	private String memberId;
	
	private Goods goods;
	
	public GoodsLike() {}
	
	public GoodsLike(int goodsLikeId, int goodsId, String memberId) {
		super();
		this.goodsLikeId = goodsLikeId;
		this.goodsId = goodsId;
		this.memberId = memberId;
	}
	
	public Goods getGoods() {
		return goods;
	}

	public void setGoods(Goods goods) {
		this.goods = goods;
	}


	public int getGoodsLikeId() {
		return goodsLikeId;
	}

	public void setGoodsLikeId(int goodsLikeId) {
		this.goodsLikeId = goodsLikeId;
	}

	public int getGoodsId() {
		return goodsId;
	}

	public void setGoodsId(int goodsId) {
		this.goodsId = goodsId;
	}

	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	
	

}
