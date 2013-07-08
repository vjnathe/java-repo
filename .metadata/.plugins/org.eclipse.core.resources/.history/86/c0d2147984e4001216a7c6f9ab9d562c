package com.xcompany.arraylistmodule;

import java.util.*;
import org.apache.commons.lang3.builder.HashCodeBuilder;


class ArrayListDemo {
	
	private long id,age;
	private String name,college;
	

	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public long getAge() {
		return age;
	}


	public void setAge(long age) {
		this.age = age;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getCollege() {
		return college;
	}


	public void setCollege(String college) {
		this.college = college;
	}
	
	@Override
	public int hashCode() {
	     
	     return new HashCodeBuilder(17, 37).
	  	   append(this.id).
	       append(this.name).
	       append(this.college).
	       append(this.age).
	       toHashCode();
	   }
	
	@Override
	public boolean equals(Object o)  {

	    if(o==this)
		return true;
	    return false;
	}
	 

    
	public static void main(String[] args) {
		
       ArrayListDemo persons[] =new ArrayListDemo[5];
       
       for (int i = 0; i < persons.length; i++) {
       persons[i]=new ArrayListDemo();
	   persons[i].setId(i+1);
		
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
       
       List<ArrayListDemo>list=new ArrayList<ArrayListDemo>();
       
       for (int i = 0; i < persons.length; i++) {
		list.add(persons[i]);
	   }
       
       for (Iterator<ArrayListDemo> iterator = list.iterator(); iterator.hasNext();) {
    	   
		ArrayListDemo arrayListDemo = (ArrayListDemo) iterator.next();
		System.out.println("Id:="+arrayListDemo.getId()+"  Name:="+arrayListDemo.getName()+"  College:="+arrayListDemo.getCollege()+"  Age:="+arrayListDemo.getAge());
		
	}
	}
}
