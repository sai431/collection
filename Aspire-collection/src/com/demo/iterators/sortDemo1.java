package com.demo.iterators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Vector;

public class sortDemo1 {
	public static void main(String[] args) {
		List fruits = new Vector();
		fruits.add("Grapes");
		fruits.add("Banana");
		fruits.add("Papaya");
		fruits.add("Apple");
		System.out.println(fruits.toString());//[Grapes, Banana, Papaya, Apple];
		Collections.sort(fruits);
		System.out.println(fruits.toString());
		
		
		//since this is predefined class and we are going for natural sorting so we are using sort method of collections which inturn uses comparable interface
		//and has only one method like
		//public int compareTo(){
		
	
	//}
	}

}
