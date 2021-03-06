package com.xcompany.hashmapmodule;

import java.util.*;

/**
 * @author Vijayraj Nathe class design to demonstarte the use of HashMap.
 */
class HashMapDemo {

	private long id, age;
	private String name, college;
	static private Map<Long, String> list;

	public HashMapDemo() {

		list = new HashMap<Long, String>();
	}

	/**
	 * @return long method for accessing ID.
	 */
	public long getId() {
		return id;
	}

	/**
	 * @return Map reference. method for accessing HashMap.
	 */
	public Map<Long, String> getHash() {

		return list;
	}

	/**
	 * @return void method for set ID.
	 */
	public void setId(long id) {
		this.id = id;
	}

	/**
	 * @return long method for accessing age.
	 */
	public long getAge() {
		return age;
	}

	/**
	 * @return void method for set age.
	 */
	public void setAge(long age) {
		this.age = age;
	}

	/**
	 * @return String method for accessing Name.
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return void method for set Name.
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return String method for accessing College Name.
	 */
	public String getCollege() {
		return college;
	}

	/**
	 * @return void method for set College Name.
	 */
	public void setCollege(String college) {
		this.college = college;
	}

	public void setHash() {

		list.put(new Long(this.getId()), this.getName());
	}

	/**
	 * @param args
	 *            main method for starting point for execution.
	 */
	public static void main(String[] args) {

		HashMapDemo persons[] = new HashMapDemo[5];

		for (int i = 0; i < persons.length; i++) {
			persons[i] = new HashMapDemo();
			persons[i].setId(i + 1);

		}
		persons[0].setName("Vijayraj");
		persons[0].setCollege("MIT");
		persons[0].setAge(24);
		persons[1].setName("Anvay");
		persons[1].setCollege("SCOE");
		persons[1].setAge(21);
		persons[2].setName("Rana");
		persons[2].setCollege("PBVBCET");
		persons[2].setAge(21);
		persons[3].setName("Swaroop");
		persons[3].setCollege("MITCOE");
		persons[3].setAge(21);
		persons[4].setName("Akash");
		persons[4].setCollege("MITCOE");
		persons[4].setAge(20);

		for (int i = 0; i < persons.length; i++) {
			persons[i].setHash();
		}
		// Input for Search Key..(1 to 5)
		Long key = new Long(1);

		System.out.println("Value Mapped to key " + key + " is:= "
				+ persons[0].getHash().get(key));
	}

}
