package com.ebrainsql.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ebrainsql.Db.CustomerDb;
import com.ebrainsql.Dto.Customer;
import com.ebrainsql.Dto.OrderItems;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/OrderItem")
public class OrderItem extends HttpServlet {
	private static final long serialVersionUID = 1L;


    public OrderItem() {
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		List<Customer> user =null;
		try {
			user=CustomerDb.getAlluser();
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			request.setAttribute("key", user);
			request.getRequestDispatcher("ViewFile.jsp").forward(request, response);

		}

/*
	List<Customer> ob = new ArrayList<Customer>();

	try {
			CustomerDb.getAlluser();
		} catch (ClassNotFoundException | SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	request.setAttribute("key", ob);
	request.getRequestDispatcher("ViewFile.jsp").forward(request, response);

	}
	*/
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String orderid= request.getParameter("order_id");
		String itemname = request.getParameter("item_name");
		String itemsku = request.getParameter("item_sku");
		String itemrate = request.getParameter("item_rate");
		String orderedqty = request.getParameter("ordered_qty");	
		String ordertotal = request.getParameter("order_total");
		
		OrderItems ug= new OrderItems();
		
		ug.setOrderid(orderid);
		ug.setItemname(itemname);
		ug.setItem_sku(itemsku);
		ug.setItemrate(itemrate);
		ug.setOrderedqty(orderedqty);
		ug.setOrder_total(ordertotal);
		
		
		CustomerDb kt=new CustomerDb();
		
		try {
			kt.saveOderItem(ug);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		doGet (request, response);
		
	}

}
