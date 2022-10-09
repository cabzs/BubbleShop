package dto;

public class OrderLine {
	private int orderLineId;
	private int orderId;
	private int goodsId;
	private int orderQty;
	private String orderLineState;
	
	public OrderLine(int orderLineId, int orderId, int goodsId, int orderQty, String orderLineState) {
		super();
		this.orderLineId = orderLineId;
		this.orderId = orderId;
		this.goodsId = goodsId;
		this.orderQty = orderQty;
		this.orderLineState = orderLineState;
	}
	
	public int getOrderLineId() {
		return orderLineId;
	}
	public void setOrderLineId(int orderLineId) {
		this.orderLineId = orderLineId;
	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public int getGoodsId() {
		return goodsId;
	}
	public void setGoodsId(int goodsId) {
		this.goodsId = goodsId;
	}
	public int getOrderQty() {
		return orderQty;
	}
	public void setOrderQty(int orderQty) {
		this.orderQty = orderQty;
	}
	public String getOrderLineState() {
		return orderLineState;
	}
	public void setOrderLineState(String orderLineState) {
		this.orderLineState = orderLineState;
	}
	
	

}
