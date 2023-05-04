package com.ebrainsql.Dto;

import java.sql.Connection;

public class Customer {
	private String id;
	private String name;
	private String code;
	private String email;
	private String phone;
	private String contactpersonname;
	private String contactpersonphone;
	private String cusstatus;
	private String date;
	private String createdby;
	private String date2;
	private String modifiedby;

	

	public Customer() {
		// TODO Auto-generated constructor stub
	}

	public String getId() {
		return id;
	}

	public void setId(String id2) {
		this.id = id2;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
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

	public String getContactpersonname() {
		return contactpersonname;
	}

	public void setContactpersonname(String contactpersonname) {
		this.contactpersonname = contactpersonname;
	}

	public String getContactpersonphone() {
		return contactpersonphone;
	}

	public void setContactpersonphone(String contactpersonphone) {
		this.contactpersonphone = contactpersonphone;
	}

	public String getCusstatus() {
		return cusstatus;
	}

	public void setCusstatus(String cusstatus) {
		this.cusstatus = cusstatus;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getCreatedby() {
		return createdby;
	}

	public void setCreatedby(String createdby) {
		this.createdby = createdby;
	}

	public String getDate2() {
		return date2;
	}

	public void setDate2(String date2) {
		this.date2 = date2;
	}

	public String getModifiedby() {
		return modifiedby;
	}

	public void setModifiedby(String modifiedby) {
		this.modifiedby = modifiedby;
	}

	public Customer(String id, String name, String code, String email, String phone, String contactpersonname,
			String contactpersonphone, String cusstatus, String date, String createdby, String date2,
			String modifiedby) {
		super();
		this.id = id;
		this.name = name;
		this.code = code;
		this.email = email;
		this.phone = phone;
		this.contactpersonname = contactpersonname;
		this.contactpersonphone = contactpersonphone;
		this.cusstatus = cusstatus;
		this.date = date;
		this.createdby = createdby;
		this.date2 = date2;
		this.modifiedby = modifiedby;
	}

	public static Connection getConnection() {
		// TODO Auto-generated method stub
		return null;
	}
	

}