package com.ebrainsql.Dto;

public class OrderHalf {

	private int id;
	private int orderid;
	private String itemname;
	private String noofitems;
	private String item_sku;
	private String itemrate;
	private String order_no;
	private String order_date;
	private String order_sub_total;
	private String order_discount;
	private String payment_type;
	private String deliverydate;

	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getOrderid() {
		return orderid;
	}

	public void setOrderid(int orderid) {
		this.orderid = orderid;
	}

	public String getDeliverydate() {
		return deliverydate;
	}

	public void setDeliverydate(String deliverydate) {
		this.deliverydate = deliverydate;
	}


	public String getItemname() {
		return itemname;
	}

	public void setItemname(String itemname) {
		this.itemname = itemname;
	}

	public String getNoofitems() {
		return noofitems;
	}

	public void setNoofitems(String noofitems) {
		this.noofitems = noofitems;
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

	
	public String getOrder_no() {
		return order_no;
	}

	public void setOrder_no(String order_no) {
		this.order_no = order_no;
	}

	public String getOrder_date() {
		return order_date;
	}

	public void setOrder_date(String order_date) {
		this.order_date = order_date;
	}



	public String getOrder_sub_total() {
		return order_sub_total;
	}

	public void setOrder_sub_total(String order_sub_total) {
		this.order_sub_total = order_sub_total;
	}

	public String getOrder_discount() {
		return order_discount;
	}

	public void setOrder_discount(String order_discount) {
		this.order_discount = order_discount;
	}

	public String getPayment_type() {
		return payment_type;
	}

	public void setPayment_type(String payment_type) {
		this.payment_type = payment_type;
	}


//	String order_id=resultSet.getString(2);
//	String item_name=resultSet.getString(3);
//	String item_sku=resultSet.getString(4);
//	String item_rate=resultSet.getString(5);
//	String ordered_qty=resultSet.getString(6);
//	String order_total=resultSet.getString(7);
//	String order_no=resultSet.getString(8);
//	String payment_type=resultSet.getString(9);
//	String order_date=resultSet.getString(10);
//	String delivery_date=resultSet.getString(11);
//	

}
