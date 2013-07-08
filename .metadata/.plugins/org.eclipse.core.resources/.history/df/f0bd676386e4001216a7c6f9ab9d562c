package com.xcompany.hashsetmodule;

import java.util.*;

class HashSetDemo {
	
	String s;
    Set<String>set;	
    
    public HashSetDemo(String input) {
	 	s=input;
	 	set=new HashSet<String>();
	}
    public void generateHastSet()  {
    
    	String arr[]=s.split(" ");
    	int count=0;
    	for (int i = 0; i < arr.length; i++) {
			if(!set.add(arr[i]))
			count++;
		}
    	System.out.println("Duplicates Excluded:="+count);
    }
    public void printHashSet()  {
    	
    System.out.println("Output:=");
    for (Iterator<String> iterator = set.iterator(); iterator.hasNext();) {
		String type = (String) iterator.next();
		System.out.print(type+" ");
	}
    }
    
    
	public static void main(String[] args) {
	
		HashSetDemo hs=new HashSetDemo("I so much I Love I India");
        hs.generateHastSet();
        hs.printHashSet();
	}

}
