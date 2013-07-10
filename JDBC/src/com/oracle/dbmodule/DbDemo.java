package com.oracle.dbmodule;

import java.io.DataInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import com.mysql.jdbc.PreparedStatement;

/**
 * @author Vijayraj Nathe. class design to demonstrate the use of JDBC with
 *         mysql as back-end.
 */
public class DbDemo {

	/**
	 * @param args
	 * @throws Exception
	 *             main method starting point for execution.
	 */
	public static void main(String[] args) throws Exception {
		Connection con = null;
		Statement state = null;
		ResultSet rs = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException ce) {
		}

		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost/dbemp",
					"root", "webonise6186");
			state = (Statement) con.createStatement();
			DataInputStream in = new DataInputStream(System.in);
			while (true) {
				System.out.println("1.Show Employee by Department Id");
				System.out.println("2.Show Employee by DOB (eg.1988/11/10)");
				System.out.println("3.Add Employee");
				System.out.println("4.Add Department");
				System.out.println("5.Show All Employee");
				System.out.println("6.Exit");
				System.out.println("Enter your Choice:=");
				int choice = Integer.parseInt(in.readLine());
				switch (choice) {

				case 1:
					String output = null;
					String query = "SELECT d.id,d.name,count(e.did) from department d left outer join employee e on e.did=d.id group by d.id";
					rs = state.executeQuery(query);
					output = "Dept-Id   Dept-Name        Count\n";
					while (rs.next()) {
						output += rs.getInt(1) + "             "
								+ rs.getString(2) + "          " + rs.getInt(3)
								+ "\n";
					}
					if (output.equals("Dept-Id   Dept-Name        Count\n"))
						output = "Result Not Found";
					JOptionPane.showMessageDialog(null, output);
					break;

				case 2:
					String dob = JOptionPane.showInputDialog(
							"Input DOB(yyyy-mm-dd)", "1988-11-10");
					query = "SELECT id,name,did,dob FROM employee WHERE dob='"
							+ dob + "'";
					rs = state.executeQuery(query);
					output = null;
					output = "Id       Emp-Name      D-Id      DOB\n";
					while (rs.next()) {
						output += rs.getInt(1) + "  " + rs.getString(2) + "   "
								+ rs.getInt(3) + "      " + rs.getDate(4)
								+ "\n";
					}
					if (output.equals("Id       Emp-Name      D-Id      DOB\n"))
						output = "Result not Found";
					JOptionPane.showMessageDialog(null, output);
					break;

				case 3:
					System.out.println("Enter Name:=");
					String name=in.readLine();
					System.out.println("Enter Department Id:=");
					int did=Integer.parseInt(in.readLine());
					System.out.println("Enter date of birth(yyyy-mm-dd)format:=");
					String dt=in.readLine();
                    query="INSERT INTO employee (name, did, dob) VALUES(?,?,?)";
                    PreparedStatement pstate=(PreparedStatement) con.prepareStatement(query);
                    pstate.setString(1, name);
                    pstate.setInt(2, did);
                    pstate.setString(3, dt);
                    pstate.executeUpdate();
                    rs=state.executeQuery("select max(id) from employee");
                    rs.next();
                    JOptionPane.showMessageDialog(null,"Employee ID:="+rs.getInt(1));
					break;
					
				case 4:
					System.out.println("Enter Department Name:=");
					name=in.readLine();
					query="INSERT INTO department (name) values ('"+name+"')";
					state.executeUpdate(query);
					rs=state.executeQuery("select max(id) from department");
                    rs.next();
                    JOptionPane.showMessageDialog(null,"Department ID:="+rs.getInt(1));
					break;
				
				case 5:
					query = "SELECT id,name,did,dob FROM employee";
					rs = state.executeQuery(query);
					output = null;
					output = "Id       Emp-Name      D-Id      DOB\n";
					while (rs.next()) {
						output += rs.getInt(1) + "  " + rs.getString(2) + "   "
								+ rs.getInt(3) + "      " + rs.getDate(4)
								+ "\n";
					}
					if (output.equals("Id       Emp-Name      D-Id      DOB\n"))
						output = "Result not Found";
					JOptionPane.showMessageDialog(null, output);
					break;
					
				case 6:
					System.exit(0);

				default:
					JOptionPane.showMessageDialog(null, "Invalid Choice",
							"Error", 0);
					break;
				}

			}

		} catch (SQLException se) {
			System.out.println(se);
		}

		finally {
			if (rs != null)
				rs.close();
			if (state != null)
				state.close();
			if (con != null)
				con.close();

		}
	}
}