package com.ebrainsql.Dto;

public class OrderItems {
	
	private String orderid;
	private String itemname;
	private String item_sku;
	private String itemrate;
	private String orderedqty;
	private String order_total;
	
	public String getOrderid() {
		return orderid;
	}
	public void setOrderid(String orderid) {
		this.orderid = orderid;
	}
	public String getItemname() {
		return itemname;
	}
	public void setItemname(String itemname) {
		this.itemname = itemname;
	}
	public String getItem_sku() {
		return item_sku;
	}
	public void setItem_sku(String item_sku) {
		this.item_sku = item_sku;
	}
	public String getItemrate() {
		return itemrate;
	}
	public void setItemrate(String itemrate) {
		this.itemrate = itemrate;
	}
	public String getOrderedqty() {
		return orderedqty;
	}
	public void setOrderedqty(String orderedqty) {
		this.orderedqty = orderedqty;
	}
	public String getOrder_total() {
		return order_total;
	}
	public void setOrder_total(String order_total) {
		this.order_total = order_total;
	}


}
