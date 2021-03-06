package com.itc.iomodule;

/**
 * @author Vijayraj Nathe class design for the demonstrate to generate
 *         getter/setter methods.
 * 
 */

class InputOutputClass {
	String name;
	int age;

	/**
	 * @return String method used to access name;
	 */
	public String getName() {

		return name;
	}

	/**
	 * @return void method to set name
	 */
	public void setName(String name) {

		this.name = name;
	}

	/**
	 * @return long method used to access age;
	 */
	public long getAge() {

		return age;
	}

	/**
	 * @return void method to set name
	 */
	public void setAge(int age) {

		this.age = age;
	}

	/**
	 * @param args
	 *            method for main starting point for execution.
	 */
	public static void main(String[] args) {

		InputOutputClass obj = new InputOutputClass();
		obj.setName("Vijayraj");
		obj.setAge(24);
		System.out.println("Name:=" + obj.getName());
		System.out.println("Age:=" + obj.getAge());

	}
}
