package com.ebrainsql.controller;

import java.io.IOException;
import java.sql.SQLException;

import com.ebrainsql.Db.CustomerDb;
import com.ebrainsql.Dto.Customer;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/CustomerDetail")
public class CustomerController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public CustomerController() {
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String id =request.getParameter("id");
		String name = request.getParameter("name");
		String code = request.getParameter("code");
		String email = request.getParameter("email");
		String phone = request.getParameter("phone");
		String contact = request.getParameter("contactpersonname");
		String contactper = request.getParameter("contactpersonphone");
		String cusst = request.getParameter("cusstatus");
		String etu = request.getParameter("createddate");
		String creat = request.getParameter("createdby");
		String modifieddate = request.getParameter("modifieddate");
		String modifiedby = request.getParameter("modifiedby");

		Customer obj = new Customer();
		
		obj.setId(id);
		obj.setName(name);
		obj.setCode(code);
		obj.setEmail(email);
		obj.setPhone(phone);
		obj.setContactpersonname(contact);
		obj.setContactpersonphone(contactper);
		obj.setCusstatus(cusst);
		obj.setDate(etu);
		obj.setCreatedby(creat);
		obj.setDate2(modifieddate);
		obj.setModifiedby(modifiedby);

		CustomerDb sk = new CustomerDb();

		try {
			sk.saveCustomer(obj);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

    
