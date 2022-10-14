package dto;

import java.time.LocalDate;

public class Cart {
	private int cartId;
	private String memberId;
	private int goodsId;
	private int count;
	private String cartState;
	private LocalDate cartDate;
	
	
	public Cart(String memberId, int goodsId, int count) {
		super();
		this.memberId = memberId;
		this.goodsId = goodsId;
		this.count = count;
	}

	public Cart(int cartId, String memberId, int goodsId, int count, String cartState, LocalDate cartDate) {
		super();
		this.cartId = cartId;
		this.memberId = memberId;
		this.goodsId = goodsId;
		this.count = count;
		this.cartState = cartState;
		this.cartDate = cartDate;
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
