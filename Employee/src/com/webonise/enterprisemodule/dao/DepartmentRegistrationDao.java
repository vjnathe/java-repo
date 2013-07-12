/**
 * 
 */
package com.webonise.enterprisemodule.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.webonise.enterprisemodule.model.Department;

/**
 * @author Vijayraj Nathe DepartmentRegistrationDao class acting as DAO for
 *         registration
 */
public class DepartmentRegistrationDao {

	/**
	 * @param Department
	 *            object
	 * @return boolean
	 */
	public boolean addDepartment(Department d) {
		Connection con = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException ce) {
			System.out.println(ce);
		}

		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost/dbemp",
					"root", "webonise6186");
			PreparedStatement pstate = con
					.prepareStatement("INSERT INTO department (name) VALUES(?)");
			pstate.setString(1, d.getName());
			if (pstate.executeUpdate() != 0) {
				Statement state = con.createStatement();
				ResultSet rs = state
						.executeQuery("SELECT max(id) FROM department");
				rs.next();
				d.setId(rs.getInt(1));
				return true;
			}

		} catch (SQLException se) {
			System.out.println(se);
		}
		return false;
	}

}
