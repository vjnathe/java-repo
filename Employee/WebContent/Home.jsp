<%@page import="sun.reflect.ReflectionFactory.GetReflectionFactoryAction"%>
<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>



<!DOCTYPE html>
<html>
<head>
<title>Employee Management</title>
</head>
<%@ page import="java.io.*,java.util.*,java.sql.*;" %>

<body>
    
	<% 
	   RequestDispatcher dis=request.getRequestDispatcher("/DepartmentRetrieveServlet");
	   dis.include(request, response);
	   String list[]=(String[])request.getAttribute("departments");
	    %>
	  
	<form action="EmployeeRegistrationServlet" method="get">
    <table border="1">
			<tr>
				<td><label>Name</label></td>
				<td><input type="text" value="" name="name"></td>
			</tr>

			<tr>	 
				<td><label>Department</label></td>
				<td><select name="department">
				  <%for(int i=0;i<list.length;i++) {%>
				        <option><%=list[i] %></option>
				        <%} %>
				</select>
				</td>
			</tr>

			<tr>
				<td><label>Date of Birth</label></td>
				<td><input type="text" value="" name="dob"></td>
			</tr>
			<tr>
				<td colspan="2" align="center"><input type="submit"
					value="Regiser"></td>
			</tr>

		</table>
	</form>
	<br><br>
	<form action="DepartmentRegistrationServlet" method="get">
	<table border="1">
	<tr>
	<td><label>Department Name</label></td>
	<td><input type="text" name="department"></td>
	</tr>
	<tr>
	<td colspan="2" align="center"><input type="submit" value="Add Department"></td>
	</tr>
	</table>
	</form>
</body>
</html>