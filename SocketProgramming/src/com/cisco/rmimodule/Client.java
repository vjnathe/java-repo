package com.cisco.rmimodule;

import java.rmi.*;

/**
 * @author Vijayraj Nathe class design for client which give call to remote
 *         method
 */
public class Client {
	/**
	 * @param args
	 *            main method starting point for execution
	 */
	public static void main(String[] args) {

		try {
			Validator remObj = (Validator) Naming
					.lookup("rmi://localhost:1099/ValidatorService");

			System.out.println(remObj.validate("(())()") ? "Valid" : "Invalid");

		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
