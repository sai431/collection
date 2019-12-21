package com.demo.iterators;

import java.util.Iterator;
import java.util.Vector;

public class IteratorDemo {
	public static void main(String[] args) {
		
	
	Vector v=new Vector();
	for(int i=1;i<=10; i++){
	v.add(i);
	}
	System.out.println(v);//[1, 2, 3, 4, 5, 6, 7, 8,9, 10]
	Iterator itr=v.iterator();
	while(itr.hasNext()){
		Integer i=(Integer)itr.next();
		if(i%2 != 0){ //odd numbers
		itr.remove();
		}
		}
		System.out.println(v);//[2, 4, 6, 8, 10]
		}
//} both legacy and non legacy 
	//method names are improved and remove method is added
}