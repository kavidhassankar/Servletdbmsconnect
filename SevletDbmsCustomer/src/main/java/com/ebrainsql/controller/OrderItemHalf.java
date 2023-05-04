package com.ebrainsql.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ebrainsql.Db.CustomerDb;
import com.ebrainsql.Dto.CusHomeActive;
import com.ebrainsql.Dto.OrderHalf;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**

 */
@WebServlet("/OrderHalf")
public class OrderItemHalf extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public OrderItemHalf() {
		// TODO Auto-generated constructor stub
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		

		List<OrderHalf> user = new ArrayList<OrderHalf>();

		
			try {
				user = CustomerDb.getItemOrder();
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 
		request.setAttribute("key", user);
		request.getRequestDispatcher("OrderSelectjsp.jsp").forward(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
