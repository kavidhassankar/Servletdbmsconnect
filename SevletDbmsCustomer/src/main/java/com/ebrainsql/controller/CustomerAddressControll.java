package com.ebrainsql.controller;

import java.io.IOException;
import java.sql.SQLException;

import com.ebrainsql.Db.CustomerDb;
import com.ebrainsql.Dto.CustomerAddress;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class CustomerAddressControll
 */
@WebServlet("/CustomerAddressControll")
public class CustomerAddressControll extends HttpServlet {
	private static final long serialVersionUID = 1L;


    public CustomerAddressControll() {
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String id=request.getParameter("id");
		String addresstype=request.getParameter("address_type");
		String addressline1=request.getParameter("address_line1");
		String addressline2=request.getParameter("address_line2");
		String city =request.getParameter("city");
		String state =request.getParameter("state");
		String country=request.getParameter("country");
		String postal_code=request.getParameter("postal_code");
	
		
		CustomerAddress Ob=new CustomerAddress();
				
		Ob.setID(id);
		Ob.setAddress_type(addresstype);
		Ob.setAddressline1(addressline1);
		Ob.setAddressline2(addressline2);
		Ob.setCity(city);
		Ob.setState(state);
		Ob.setCountry(country);
		Ob.setPostal_code(postal_code);
		
		CustomerDb dd=new CustomerDb();
		
		try {
			dd.saveAddress(Ob);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
