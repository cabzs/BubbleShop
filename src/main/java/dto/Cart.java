package dto;

import java.time.LocalDate;

public class Cart {
	private int cartId;
	private String memberId;
	private int count;
	private String cartState;
	private LocalDate cartDate;
	private int goodsId;
	
	private Goods goods;
	private Member member;
	
	public Cart(String memberId, int goodsId, int count) {
		super();
		this.memberId = memberId;
		this.goodsId = goodsId;
		this.count = count;
	}
	
	

	public Cart(int count, Goods goods) {
		super();
		this.count = count;
		this.goods = goods;
	}



	public Cart(int cartId, String memberId, int count, String cartState, LocalDate cartDate, int goodsId) {
		super();
		this.cartId = cartId;
		this.memberId = memberId;
		this.count = count;
		this.cartState = cartState;
		this.cartDate = cartDate;
		this.goodsId = goodsId;
	}
	
	

	//goods_id , goods_name, goods_price, count, goods_img
	/*public Cart(int goodsId, String goodsName, int goodsPrice, int count, String goodsImg) {
		this.goodsId = goodsId;
		this.goods.getGoodsName();
		this.goods.getGoodsPrice();
		this.count = count;
		this.goods.getGoodsImg();
		
	}*/

	public Cart(int cartId, String memberId, int count, String cartState, LocalDate cartDate, int goodsId,
			Goods goods) {
		super();
		this.cartId = cartId;
		this.memberId = memberId;
		this.count = count;
		this.cartState = cartState;
		this.cartDate = cartDate;
		this.goodsId = goodsId;
		this.goods = goods;
	}

	
	
	public Member getMember() {
		return member;
	}

	public void setMember(Member member) {
		this.member = member;
	}

	public Goods getGoods() {
		return goods;
	}

	public void setGoods(Goods goods) {
		this.goods = goods;
	}
	
	public int getCartId() {
		return cartId;
	}
	public void setCartId(int cartId) {
		this.cartId = cartId;
	}
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public int getGoodsId() {
		return goodsId;
	}
	public void setGoodsId(int goodsId) {
		this.goodsId = goodsId;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public String getCartState() {
		return cartState;
	}
	public void setCartState(String cartState) {
		this.cartState = cartState;
	}
	public LocalDate getCartDate() {
		return cartDate;
	}
	public void setCartDate(LocalDate cartDate) {
		this.cartDate = cartDate;
	}
	
	

}
