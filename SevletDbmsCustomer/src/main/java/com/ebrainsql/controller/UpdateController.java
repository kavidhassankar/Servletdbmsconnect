package com.ebrainsql.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.ebrainsql.Db.CustomerDb;
import com.ebrainsql.Dto.Customer;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class UpdateController
 */
@WebServlet("/UpdateController")
public class UpdateController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor.
	 */
	public UpdateController() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.getWriter().append("Served at: ").append(request.getContextPath());

		Connection connection = null;
		PreparedStatement pst = null;
		int numRowsUpdated = 0;

		try {
			connection = CustomerDb.getConnection();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		String sql = " UPDATE tb_kavidhass_customer c " + " SET c.cus_status='Active' "
				+ " WHERE c.cus_status ='Deleted' LIMIT 4 ";
		try {
			pst = connection.prepareStatement(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			numRowsUpdated = pst.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	List<Customer> user = null;

	try
	{
		user = CustomerDb.getAlluser();

	}catch(ClassNotFoundException|
	SQLException e)
	{
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	request.setAttribute("key",user);
	request.getRequestDispatcher("Update.jsp").forward(request,response);

}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
		
		

	}
}


