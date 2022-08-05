package com.product.entity;

import java.util.ArrayList;
import java.util.List;

public class Product {

	private int pId;
	private String pName;
	private String pDesc;

	List<Order> order = new ArrayList<>();

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Product(int pId, String pName, String pDesc, List<Order> order) {
		super();
		this.pId = pId;
		this.pName = pName;
		this.pDesc = pDesc;
		this.order = order;
	}

	public Product(int pId, String pName, String pDesc) {
		super();
		this.pId = pId;
		this.pName = pName;
		this.pDesc = pDesc;
	}

	public int getpId() {
		return pId;
	}

	public void setpId(int pId) {
		this.pId = pId;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public String getpDesc() {
		return pDesc;
	}

	public void setpDesc(String pDesc) {
		this.pDesc = pDesc;
	}

	public List<Order> getOrder() {
		return order;
	}

	public void setOrder(List<Order> order) {
		this.order = order;
	}

	@Override
	public String toString() {
		return "Product [pId=" + pId + ", pName=" + pName + ", pDesc=" + pDesc + ", order=" + order + "]";
	}

}
