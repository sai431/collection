package com.demo.iterators;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Vector;

//Multiple sorting techniques at a time
class Employee {
	private int eno;
	private String ename;

	Employee(int no, String name) {
		this.eno = no;
		this.ename = name;
	}

	public Integer getEno() {
		return this.eno;
	}

	public String getEname() {
		return this.ename;
	}

	@Override
	public String toString() {
		return eno + " " + ename + ", ";
	}
}
//sort based on employee number
class EnoSort implements Comparator{
@Override
public int compare(Object o1, Object o2){
Employee e1 = (Employee)o1;
Employee e2 = (Employee)o2;
Integer iRef1 = e1.getEno();
Integer iRef2 = e2.getEno();
return iRef1.compareTo(iRef2);
}
}
//sorting based on employee name
class EnameSort implements Comparator{
@Override
public int compare(Object o1, Object o2){
Employee e1 = (Employee)o1;
Employee e2 = (Employee)o2;
String str1 = e1.getEname();
String str2 = e2.getEname();
return str1.compareTo(str2);
}
}


//EQUALS METHOD OVER RIDING IS OPTIONAL SINCE ITS ALREADY AVAILABLE IN OBJECT CLASS

public class SortDemo3 {
	
		public static void main(String[] args) {
			List emps = new Vector();
			Employee e1 = new Employee(2, "xyz");
			Employee e2 = new Employee(1, "abc");
			Employee e3 = new Employee(3, "pqr");
			emps.add(e1);
			emps.add(e2);
			emps.add(e3);
			Collections.sort(emps, new EnoSort()); //Customized sorting order based on eno
			System.out.println(emps.toString());
			Collections.sort(emps, new EnameSort()); //Customized sorting order based on ename
			System.out.println(emps.toString());}
}