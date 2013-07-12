package com.webonise.enterprisemodule.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;

import com.webonise.enterprisemodule.model.*;
import com.webonise.enterprisemodule.service.EmployeeService;
import com.webonise.enterprisemodule.service.EmployeeServiceImpl;

/**
 * @author Vijayraj Nathe EmployeeRegistrationServlet class extending
 *         HttpServlet class acting as a controller for employee registration
 *         event.
 */
@WebServlet("/EmployeeRegistrationServlet")
public class EmployeeRegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public EmployeeRegistrationServlet() {
		super();

	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		Employee newEmployee = new Employee();
		EmployeeService service = new EmployeeServiceImpl();

		String name = request.getParameter("name");
		String dept = request.getParameter("department");
		String dob = request.getParameter("dob");
		if (name != "" && dob != "" && dept != "Department") {
			newEmployee.setName(name);
			newEmployee.setDepartment(dept);
			newEmployee.setDate(dob);
			if (service.addEmployee(newEmployee))
				JOptionPane
						.showMessageDialog(
								null,
								"Employee " + newEmployee.getName()
										+ " Registered with Id:="
										+ newEmployee.getId());
			else
				JOptionPane.showMessageDialog(null,
						"Employee Registration Failed !!!");

		} else
			out.println("Field(s) Required !!!");
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
