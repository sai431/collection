package com.demo.iterators;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Vector;

class Mycomparator implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		String str1 = o1.toString();
		String str2 = o2.toString();
		return str1.compareTo(str2);
	}}

public class ComparatorDemo1sbuff {
	public static void main(String[] args) {
		StringBuffer sb1 = new StringBuffer("A");
		StringBuffer sb2 = new StringBuffer("C");
		StringBuffer sb3 = new StringBuffer("B");
		//these sbufer objects are adding to  list
		List v = new Vector();
		v.add(sb1);
		v.add(sb2);
		v.add(sb3);
	//	Collections.sort(v);  Exception in thread "main" java.lang.ClassCastException: java.lang.StringBuffer cannot be cast to java.lang.Comparable
		Collections.sort(v, new Mycomparator());
		System.out.println("After sorting....");
		System.out.println(v.toString()); //[A, B, C]
	}

}
