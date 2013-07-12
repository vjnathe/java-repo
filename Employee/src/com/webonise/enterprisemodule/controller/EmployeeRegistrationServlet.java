package com.webonise.enterprisemodule.controller;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.webonise.enterprisemodule.model.*;
import com.webonise.enterprisemodule.service.EmployeeService;
import com.webonise.enterprisemodule.service.EmployeeServiceImpl;


/**
 * Servlet implementation class Serv
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
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		Employee newEmployee=new Employee();
	    EmployeeService service=new EmployeeServiceImpl();
	    
		String name=request.getParameter("name");
		String dept=request.getParameter("department");
		String dob=request.getParameter("dob");
		int did=1;
		if(name!="" && dob!="")
		{
			newEmployee.setName(name);
			newEmployee.setDid(did);
			newEmployee.setDate(dob);
		}
		service.addEmployee(newEmployee);
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
