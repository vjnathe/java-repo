package com.cisco.rmimodule;

import java.net.MalformedURLException;
import java.rmi.*;

/**
 * @author Vijayraj Nathe class design for server which register remote object
 *         to rmi registry
 */
public class Server {

	public Server() {
		try {
			Validator remObj = new ValidatorImpl();
			Naming.rebind("rmi://localhost:1099/ValidatorService", remObj);

		} catch (RemoteException e) {
			System.out.println(e);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	/**
	 * @param args
	 *            main method starting point for execution
	 */
	public static void main(String[] args) {
		new Server();
	}

}
