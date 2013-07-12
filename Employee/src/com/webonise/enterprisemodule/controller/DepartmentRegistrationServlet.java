package com.webonise.enterprisemodule.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;

import com.webonise.enterprisemodule.model.Department;
import com.webonise.enterprisemodule.service.DepartmentService;
import com.webonise.enterprisemodule.service.DepartmentServiceImpl;

/**
 * @author Vijayraj Nathe DepartmentRegistrationServlet class extending
 *         HttpServlet class controller for employee registration.
 */
@WebServlet("/DepartmentRegistrationServlet")
public class DepartmentRegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public DepartmentRegistrationServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		Department newDepartment = new Department();
		DepartmentService service = new DepartmentServiceImpl();

		String department = request.getParameter("department");

		if (department.equals(""))
			out.println("Null Value for Department  !!!");
		else {
			newDepartment.setName(department);
			if (service.addDepartment(newDepartment)) {
				JOptionPane.showMessageDialog(null, "Department "
						+ newDepartment.getName() + " Registered with Id:="
						+ newDepartment.getId());
			} else
				JOptionPane.showMessageDialog(null, "Operation Failed");

		}
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
