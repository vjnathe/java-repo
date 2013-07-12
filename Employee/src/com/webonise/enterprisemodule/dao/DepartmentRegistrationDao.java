/**
 * 
 */
package com.webonise.enterprisemodule.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.webonise.enterprisemodule.model.Department;

/**
 * @author webonise
 *
 */
public class DepartmentRegistrationDao {
	
	public void addDepartment(Department d)  {
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
    	  PreparedStatement pstate=con.prepareStatement("INSERT INTO department (name) VALUES(?)");
    	  pstate.setString(1,"Poly-Tech");
    	  if(pstate.executeUpdate()!=0)	  
    		  return;
    	      
    	}
    	catch(SQLException se)
    	{System.out.println(se);}
    	return;
    }

}
