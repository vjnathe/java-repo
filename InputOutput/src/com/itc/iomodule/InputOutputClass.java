package com.itc.iomodule;

class InputOutputClass {
	String name;
	int age;
   
   public String getName() {
	    
	return name;
  }
  public void setName(String name) {
	  
	this.name = name;
  }
  public long getAge() {
	
	return age;
  }
  public void setAge(int age) {
	  
	this.age = age;
  }
  
  public static void main(String[] args) {
	  
	InputOutputClass obj=new InputOutputClass();
	obj.setName("Vijayraj");
	obj.setAge(24);
	System.out.println("Name:="+obj.getName());
	System.out.println("Age:="+obj.getAge());
	
  }
}