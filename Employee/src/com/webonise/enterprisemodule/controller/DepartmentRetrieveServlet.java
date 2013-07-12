package com.webonise.enterprisemodule.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.webonise.enterprisemodule.service.FetchDepartmentService;
import com.webonise.enterprisemodule.service.FetchDepartmentServiceImpl;

/**
 * @author Vijayraj Nathe
 * DepartmentRetrieveServlet class extending HttpServlet class for controller
 * for department fetching on load of jsp.
 */
@WebServlet("/DepartmentRetrieveServlet")
public class DepartmentRetrieveServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Connection con;
	Statement state;
	ResultSet rs;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public DepartmentRetrieveServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		FetchDepartmentService service = new FetchDepartmentServiceImpl();
		String deptList[] = service.fetchDepartments();
		request.setAttribute("departments", deptList);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
