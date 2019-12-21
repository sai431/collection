package com.demo.iterators;

import java.util.Vector;

public class Vectorite {
	public static void main(String[] args) {
		Vector v=new Vector();
		v.add("sai");
		v.addElement("dagg");
		// add and add element belonging to vector class 
		
		v.addElement(1); // auto boxing
		v.addElement(new Integer(5));
		v.add(new Integer(3));
		v.add(new Integer(3)); //allows duplicate element
		v.add(null); //allows null value
		v.add(null); //duplicate null value
		v.add(0, new Integer(4)); //adding element using index position
		v.add(1, "555");
		v.add("hello");
		System.out.println(v.toString()); 
		
	}

}
