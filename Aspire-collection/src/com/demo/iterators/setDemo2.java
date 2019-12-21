package com.demo.iterators;

import java.util.*;

class Employees implements Comparable<Employees >{
int eno;
String ename;
int sal;
public Employees(int e, String name,int s ){
eno = e;
ename = name;
sal = s;
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((ename == null) ? 0 : ename.hashCode());
	result = prime * result + eno;
	result = prime * result + sal;
	return result;
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Employees other = (Employees) obj;
	if (ename == null) {
		if (other.ename != null)
			return false;
	} else if (!ename.equals(other.ename))
		return false;
	if (eno != other.eno)
		return false;
	if (sal != other.sal)
		return false;
	return true;
}
@Override
public String toString() {
	return "Employees [eno=" + eno + ", ename=" + ename + ", sal=" + sal + "]";
}
@Override
public int compareTo(Employees b){
	Integer iRef1 = this.sal;
	Integer iRef2 = b.sal;
	return iRef1.compareTo(iRef2);
}

}
public class setDemo2 {
public static void main(String[] args) {
	Employees e1 = new Employees(1,"abc", 1000);
	Employees e2 = new Employees(1,"abc", 1000);
	//Set employees = new HashSet();
	Set employees = new TreeSet<>();
	employees.add(e1);
	employees.add(e2);
	System.out.println(employees.toString()); //O/P: 1
}
}
//overid and equals-- [Employees [eno=1, ename=abc, sal=1000], Employees [eno=1, ename=abc, sal=1000]]
//with out over riding hasing and equals oput is-- [Employees [eno=1, ename=abc, sal=1000], Employees [eno=1, ename=abc, sal=1000]]