package com.cisco.chatmodule;

import java.io.*;
import java.net.*;

/**
 * @author Vijayraj Nathe class design as a tcp client
 */
class Client extends Thread {
	Socket connected;
	PrintWriter out;
	BufferedReader in;
	BufferedReader stdin;
	Thread read, write;

	public Client() throws Exception {
		connected = new Socket("localhost", 6001);

		out = new PrintWriter(connected.getOutputStream(), true);
		in = new BufferedReader(new InputStreamReader(
				connected.getInputStream()));
		stdin = new BufferedReader(new InputStreamReader(System.in));

		read = new Thread(this, "Reading");
		write = new Thread(this, "Writing");
		read.start();
		write.start();
		System.out.println("Q or q to Quite !!!");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Thread#run() run method for simultaneous read write
	 * operation
	 */
	public void run() {
		try {
			while (true) {
				if (Thread.currentThread() == read) {
					String input = in.readLine();
					if (input.equals("Q") || input.equals("q"))
						System.exit(0);
					System.out.println("Server:=" + input);
				}
				if (Thread.currentThread() == write) {
					String input = stdin.readLine();
					if (input.equals("Q") || input.equals("q")) {
						out.println("Q");
						System.exit(0);
					}
					out.println(input);
				}
			}
		} catch (Exception e) {
		}

	}

	/**
	 * @param args
	 * @throws Exception
	 *             main method starting point for execution.
	 */
	public static void main(String args[]) throws Exception {

		new Client();
	}
}
