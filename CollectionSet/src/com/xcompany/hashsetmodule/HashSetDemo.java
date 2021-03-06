package com.xcompany.hashsetmodule;

import java.util.*;

/**
 * @author Vijayraj Nathe class design for demonstrate the use of HashSet
 */
class HashSetDemo {

	String s;
	Set<String> set;

	public HashSetDemo(String input) {
		s = input;
		set = new HashSet<String>();
	}

	/**
	 * @return void method to generate hash set.
	 */
	public void generateHastSet() {

		String arr[] = s.split(" ");
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (!set.add(arr[i]))
				count++;
		}
		System.out.println("Duplicates Excluded:=" + count);
	}

	/**
	 * @return void method to print hash set.
	 */
	public void printHashSet() {

		System.out.println("Output:=");
		for (Iterator<String> iterator = set.iterator(); iterator.hasNext();) {
			String type = (String) iterator.next();
			System.out.print(type + " ");
		}
	}

	/**
	 * @param args
	 *            main method is starting point for execution.
	 */
	public static void main(String[] args) {

		HashSetDemo hs = new HashSetDemo("I so much I Love I India");
		hs.generateHastSet();
		hs.printHashSet();
	}

}
