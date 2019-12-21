package com.demo.iterators;

import java.util.*;

class Temp {
	public String toString() {
		return "temp";
	}

	protected void finalize() {
		System.out.println("finalize method");
	}
}

public class WeakHashMap {
	public static void main(String[] args) throws InterruptedException {
		//Map<Temp, String> m=new HashMap<Temp, String>();
		Map<Temp, String> m = new java.util.WeakHashMap<Temp, String>();
		Temp t = new Temp();
		m.put(t, "aspire");//here we are putting an object class as a key ,this object contains finalize and to string method
		System.out.println(m);
		t = null;
		System.gc();
		Thread.sleep(5000);
		System.out.println(m);
		}

}
//weak hash map
//outputs
//{temp=aspire}
//finalize method
//{}

//hashmap
//{temp=aspire}
//{temp=aspire}