<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>



<!DOCTYPE html>
<html>
<head>
<title>Employee Management</title>
</head>
<%@ page import="java.io.*,java.util.*,java.sql.*;" %>
<body onload="">

	
	<form action="EmployeeRegistrationServlet" method="get">
		<table border="1">

			<tr>
				<td><label>Name</label></td>
				<td><input type="text" value="" name="name"></td>
			</tr>

			<tr>
				<td><label>Department</label></td>
				<td><select name="department">
				        <option>Select Department</option>
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