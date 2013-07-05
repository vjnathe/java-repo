package com.cisco.rmimodule;

import java.rmi.*;
import java.rmi.server.UnicastRemoteObject;
import java.util.Stack;

/**
 * @author Vijayraj Nathe class design to implement Remote object Interface
 */
public class ValidatorImpl extends UnicastRemoteObject implements Validator {

	private static final long serialVersionUID = 1L;

	protected ValidatorImpl() throws RemoteException {
		super();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.cisco.rmimodule.Validator#validate(java.lang.String) method to
	 * validate string(eg "{()()}" )
	 */
	public boolean validate(String s) throws RemoteException {
		Stack<Character> stack = new Stack<Character>();
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);

			if (c == '(' || c == '{')
				stack.push(new Character(c));

			if (c == ')' || c == '}') {
				if (stack.empty())
					return false;
				Character ch = stack.pop();
				if (!((ch.equals(new Character('{')) && c == '}') || (ch
						.equals(new Character('(')) && c == ')')))
					return false;
			}
		}
		if (stack.empty())
			return true;
		return false;
	}
}
