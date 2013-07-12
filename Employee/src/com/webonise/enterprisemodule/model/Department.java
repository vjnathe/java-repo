package com.webonise.enterprisemodule.model;

import java.io.Serializable;

/**
 * @author Vijayraj Nathe class is a set of department details.
 */
public class Department implements Serializable {

	private static final long serialVersionUID = 3905965921029366309L;
	private int id;
	private String name;

	/**
	 * @return int method returns department Id.
	 */
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return String method returns department name.
	 */
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == this) {
			return true;
		}
		if (obj == null || obj.getClass() != this.getClass()) {
			return false;
		}

		Department dept = (Department) obj;
		return id == dept.id
				&& (name == dept.name || (name != null && name.equals(dept
						.getName())));

	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + id;
		result = prime * result;
		return result;
	}
}
