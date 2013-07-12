package com.webonise.enterprisemodule.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.webonise.enterprisemodule.model.Employee;

/**
 * @author Vijayraj Nathe EmployeeRegistrationDao class acting as DAO for
 *         Employee Registration.
 */
public class EmployeeRegistrationDao {

	/**
	 * @param Employee
	 *            object
	 * @return boolean
	 */
	public boolean addEmployee(Employee e) {

		Connection con = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException ce) {
			System.out.println(ce);
		}

		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost/dbemp",
					"root", "webonise6186");

			Statement state = con.createStatement();
			ResultSet rs = state
					.executeQuery("SELECT id FROM department where name='"
							+ e.getDepartment() + "'");
			rs.next();
			int departmentId = rs.getInt(1);

			PreparedStatement pstate = con
					.prepareStatement("INSERT INTO employee (name, did, dob) VALUES(?,?,?)");
			pstate.setString(1, e.getName());
			pstate.setInt(2, departmentId);
			pstate.setString(3, e.getDate());
			if (pstate.executeUpdate() != 0) {
				rs = state.executeQuery("SELECT max(id) FROM employee");
				rs.next();
				e.setId(rs.getInt(1));
				return true;
			}

		} catch (SQLException se) {
			System.out.println(se);
		}
		return false;
	}

}
