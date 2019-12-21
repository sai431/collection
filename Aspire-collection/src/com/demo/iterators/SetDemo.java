package com.demo.iterators;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {
	public static void main(String[] args) {
		//Set<String> hs=new HashSet();
		//Set<String> hs=new LinkedHashSet<>();
		Set<String> hs=new TreeSet<>();//tree set not allows null--o/p is [A, B, C]
		hs.add("A");
		hs.add("B");
		hs.add("C");
		hs.add("C");
		//hs.add(null);
		//hs.add(null);
		//[null, A, B, C] hash set
		//[null, A, B, C] lhs
		
		//4
		System.out.println(hs.toString());
		System.out.println(hs.size());//4
	}//since string is an predefined class  there will equals and hashcode method  no need to over ride equals method
	
	//sorted set interface implements set interace
	//[101, 102, 103, 104, 105, 106, 107]
	//first() -------------------- 101
//	last() -------------------- 107
	//headSet(105) -------------------- [101, 102, 103, 104]
	//tailSet(105) -------------------- [105, 106, 107]
//	subSet(102, 106) -------------------- [102, 103, 104, 105]
	//comparator() -------------------- null

}
