package dto;

import java.time.LocalDate;

public class Member {
	private String memberId;
	private String memberPwd;
	private String memberName;
	private String email;
	private String phone;
	private String memberState;
	private LocalDate joinDate;
	private String address;
	private String addressDetail;
	private String addressCode;
	
	public Member() {}
	
	
	
	public Member(String memberId, String memberPwd, String memberName, String email, String phone, String address,
			String addressDetail, String addressCode) {
		super();
		this.memberId = memberId;
		this.memberPwd = memberPwd;
		this.memberName = memberName;
		this.email = email;
		this.phone = phone;
		this.address = address;
		this.addressDetail = addressDetail;
		this.addressCode = addressCode;
	}



	public Member(String memberId, String memberPwd, String memberName, String email, String phone,
			LocalDate joinDate, String address, String addressDetail, String addressCode) {
		super();
		this.memberId = memberId;
		this.memberPwd = memberPwd;
		this.memberName = memberName;
		this.email = email;
		this.phone = phone;
		this.joinDate = joinDate;
		this.address = address;
		this.addressDetail = addressDetail;
		this.addressCode = addressCode;
	}



	public Member(String memberId, String memberPwd, String memberName, String email, String phone, String memberState,
			LocalDate joinDate, String address, String addressDetail, String addressCode) {
		super();
		this.memberId = memberId;
		this.memberPwd = memberPwd;
		this.memberName = memberName;
		this.email = email;
		this.phone = phone;
		this.memberState = memberState;
		this.joinDate = joinDate;
		this.address = address;
		this.addressDetail = addressDetail;
		this.addressCode = addressCode;
	}


	public String getMemberId() {
		return memberId;
	}


	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}


	public String getMemberPwd() {
		return memberPwd;
	}


	public void setMemberPwd(String memberPwd) {
		this.memberPwd = memberPwd;
	}


	public String getMemberName() {
		return memberName;
	}


	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}


	public String getMemberState() {
		return memberState;
	}


	public void setMemberState(String memberState) {
		this.memberState = memberState;
	}


	public LocalDate getJoinDate() {
		return joinDate;
	}


	public void setJoinDate(LocalDate joinDate) {
		this.joinDate = joinDate;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getAddressDetail() {
		return addressDetail;
	}


	public void setAddressDetail(String addressDetail) {
		this.addressDetail = addressDetail;
	}


	public String getAddressCode() {
		return addressCode;
	}


	public void setAddressCode(String addressCode) {
		this.addressCode = addressCode;
	}
	
	
	

}
