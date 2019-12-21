package com.demo.iterators;

import java.util.*;

public class IdentityHashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Map<Integer, String> m = new HashMap<Integer, String>();
		Map<Integer, String> m = new IdentityHashMap<Integer, String>();
		Map<String, String> m2 = new IdentityHashMap<String, String>();
		String s1="sai";
		String s2="sai";
		m2.put(s1, "asp");
		m2.put(s2, "tech");
		System.out.println(m2);
		Integer I1 = new Integer(10);
		Integer I2 = new Integer(10);
		m.put(I1, "aspire");
		m.put(I2, "technologies");
		System.out.println(m);
		System.out.println(I1.equals(I2));
		System.out.println(I1==(I2));
		
		System.out.println("---------------------------------------------------");
		
		HashMap mapping =new HashMap<Integer, String>();
		mapping.put(I1,"aspire");
		mapping.put(I2,"technologies");
		System.out.println(m);
		System.out.println(I1.equals(I2));
		System.out.println(I1==(I2));
		
		
		// here key value is same
		// output is {10=technologies} for hashmap always last value it takes so only one value is printed out
		//{10=technologies, 10=aspire} for ident hashmap it doesnot overdide equal method

	}

}
