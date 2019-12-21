package com.demo.iterators;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationDemo {
	public static void main(String[] args){
		Vector v= new Vector();
		for(int i=1; i<=10; i++){
		v.addElement(i);
		}
		System.out.println(v);
	Enumeration enm=	v.elements();// elements is method with return type enumeration
	while(enm.hasMoreElements()){
		int i=(Integer)enm.nextElement();
		if(i%2==0){ //print even numbers
		System.out.print(i+"\t");
		}
		}
	}
	
	//only 2 methods has more element and next elmnt

}
