package com.cisco.rmimodule;

import java.rmi.*;

/**
 * @author vijayraj nathe
 *interface to design Remote.
 *declared one method to validate input parenthesis string.
 */
public interface Validator extends Remote {

	public boolean validate(String s) throws RemoteException;
}
