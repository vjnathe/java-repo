package com.webonise.enterprisemodule.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.webonise.enterprisemodule.model.Employee;

/**
 * @author webonise
 * 
 */
public class EmployeeRegistrationDao {

	public void addEmployee(Employee e) {
			
			Connection con=null;
			try
			{
				Class.forName("com.mysql.jdbc.Driver");
			}
			catch(ClassNotFoundException ce)
			{System.out.println(ce);}
			
			try
			{
			  con=DriverManager.getConnection("jdbc:mysql://localhost/dbemp","root","webonise6186");	
			  PreparedStatement pstate=con.prepareStatement("INSERT INTO employee (name, did, dob) VALUES(?,?,?)");
			  pstate.setString(1,"Vijju");
			  pstate.setInt(2, 1);
			  pstate.setString(3, "1988/11/10");
			  if(pstate.executeUpdate()!=0)	  
				  return;
			      
			}
			catch(SQLException se)
			{System.out.println(se);}
			return;
		   }

}
