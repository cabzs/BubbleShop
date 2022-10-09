package dto;

import java.time.LocalDate;

public class Orders {
	private int orderId;
	private String memberId;
	private LocalDate orderDate;
	
	public Orders(int orderId, String memberId, LocalDate orderDate) {
		super();
		this.orderId = orderId;
		this.memberId = memberId;
		this.orderDate = orderDate;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public LocalDate getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(LocalDate orderDate) {
		this.orderDate = orderDate;
	}
	
	

}
