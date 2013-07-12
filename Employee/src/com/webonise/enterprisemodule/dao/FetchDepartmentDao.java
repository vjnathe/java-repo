/**
 * 
 */
package com.webonise.enterprisemodule.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author Vijayraj Nathe FetchDepartmentDao class acting as DAO for fetching
 *         departments.
 */
public class FetchDepartmentDao {
	/**
	 * @return String object Array.
	 */
	public String[] fetchDepartments() {
		Connection con = null;
		Statement state = null;
		ResultSet rs = null;
		List<String> list = new ArrayList<String>();

		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			con = DriverManager.getConnection("jdbc:mysql://localhost/dbemp",
					"root", "webonise6186");
			state = con.createStatement();
			rs = state.executeQuery("select name from department");
			while (rs.next()) {
				list.add(rs.getString(1));
			}

		} catch (Exception e) {
			System.out.println(e);
		}
		String deptList[] = new String[list.size()];
		int i = 0;
		for (Iterator<String> iterator = list.iterator(); iterator.hasNext(); i++) {
			String string = (String) iterator.next();
			deptList[i] = string;
		}
		return deptList;
	}

}
