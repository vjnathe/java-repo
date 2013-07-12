package com.webonise.enterprisemodule.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Serv2
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
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Connection con=null;
		Statement state=null;
		ResultSet rs=null;
		try
		{
			Class.forName("com.mysql.jdbc.Driver").newInstance();
		    con=DriverManager.getConnection("jdbc:mysql://localhost/dbemp","root","webonise6186");
		    state=con.createStatement();
		    rs=state.executeQuery("select name from department");
		    rs.next();
		    rs.getString(1);
		}catch(Exception e){System.out.println(e);}
		 finally
		 {
		   //if(rs!=null)rs.close();
		    //if(state!=null) state.close();
		    // if(con!=null) con.close();
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
