package com.ebrainsql.controller;

import java.io.IOException;
import java.sql.SQLException;

import com.ebrainsql.Db.CustomerDb;
import com.ebrainsql.Dto.customerOrder;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CustomerOrder
 */
@WebServlet("/CustomerOrder")
public class CustomerOrderOrder extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public CustomerOrderOrder() {
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String order= request.getParameter("customer_id");
		String orderno = request.getParameter("order_no");
		String odate = request.getParameter("order_date");
		String nofitems = request.getParameter("no_of_items");
		String ordersubtotal = request.getParameter("order_sub_total");
		String orderdiscount = request.getParameter("order_discount");
		String paymenttype = request.getParameter("payment_type");
		String deliverydate = request.getParameter("delivery_date");
		String cusstatus = request.getParameter("cus_status");
		String created_date = request.getParameter("created_date");
		String created = request.getParameter("created_by");
		String modifieddate = request.getParameter("modified_date");
		String modifiedby = request.getParameter("modified_by");

		customerOrder ydy = new customerOrder();
		ydy.setCustomerid(order);
		ydy.setOrder_no(orderno);
		ydy.setOrder_date(odate);
		ydy.setNo_ofitems(nofitems);
		ydy.setOrder_sub_total(ordersubtotal);
		ydy.setOrder_discount(orderdiscount);
		ydy.setPayment_type(paymenttype);
		ydy.setDelivery_date(deliverydate);
		ydy.setCus_status(cusstatus);
		ydy.setCreated_date(created_date);
		ydy.setCreated_by(created);
		ydy.setModified_date(modifieddate);
		ydy.setModified_by(modifiedby);
		
		CustomerDb hh=new CustomerDb() ;
		
		try {
			hh.saveOrder(ydy);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		
		
	}
		
	}


