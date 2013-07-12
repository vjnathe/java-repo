package com.webonise.enterprisemodule.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.webonise.enterprisemodule.model.Department;
import com.webonise.enterprisemodule.service.DepartmentService;
import com.webonise.enterprisemodule.service.DepartmentServiceImpl;

/**
 * Servlet implementation class Serv1
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
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
         Department newDepartment=new Department();
         DepartmentService service=new DepartmentServiceImpl();
         
		 String department=request.getParameter("department");
		 newDepartment.setName(department);
		
		 service.addDepartment(newDepartment);
		 
		 response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
