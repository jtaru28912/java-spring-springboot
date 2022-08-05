package com.product.entity;

public class Order {

	private int oId;
	private String oName;
	private String oAddress;
	private int pId;

	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Order(int oId, String oName, String oAddress, int pId) {
		super();
		this.oId = oId;
		this.oName = oName;
		this.oAddress = oAddress;
		this.pId = pId;
	}

	public int getoId() {
		return oId;
	}

	public void setoId(int oId) {
		this.oId = oId;
	}

	public String getoName() {
		return oName;
	}

	public void setoName(String oName) {
		this.oName = oName;
	}

	public String getoAddress() {
		return oAddress;
	}

	public void setoAddress(String oAddress) {
		this.oAddress = oAddress;
	}

	public int getpId() {
		return pId;
	}

	public void setpId(int pId) {
		this.pId = pId;
	}

	@Override
	public String toString() {
		return "Order [oId=" + oId + ", oName=" + oName + ", oAddress=" + oAddress + ", pId=" + pId + "]";
	}

}
