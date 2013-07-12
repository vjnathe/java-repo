/**
 * 
 */
package com.webonise.enterprisemodule.model;
import java.io.Serializable;

/**
 * @author Vijayraj Nathe 
 * class is a set of employee details.
 */
public class Employee implements Serializable {
	
	private static final long serialVersionUID = 3436813059424263524L;
	private int id;
	private String name;
	private int did;
	private String date;
     
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDid() {
		return did;
	}

	public void setDid(int did) {
		this.did = did;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}
	@Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }

        Employee empl = (Employee) obj;
        return id == empl.id
             && (name == empl.name
                     || (name != null && name.equals(empl.getName()) ))
                     && (did==empl.getDid())
                     && (date.equals(empl.did));
    }
   
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result
                + ((name == null) ? 0 : name.hashCode());
        result = prime * result + id;
        result = prime * result + did;
        result = prime * result+((date==null)? 0 : date.hashCode());
        return result;
    }
	
}
