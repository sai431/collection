package com.demo.iterators;
import java.util.Arrays;
import java.util.List;


//for userdefined clases
class Student implements Comparable<Student>{
	private int sno;
	private String sname;
	public Student(int sno, String sname){
		this.sno = sno;
		this.sname = sname;
	}

	@Override
	public int compareTo(Student s){
		/*if(this.sno<s.sno){
			return -1;
		}else if(this.sno>s.sno){
			return +1;
		}else{
			return 0;
		}*/
		
		/*Integer iRef1 = this.sno;
		Integer iRef2 = s.sno;
		return iRef1.compareTo(iRef2);*/
		
		
		//object is came into parameter method 
		//current class.property .compareTo  (method parameter which is passed as argument )
		
		return this.sname.compareTo(s.sname);//this method same as that
	}
	
	@Override
	public String toString(){
		return sno+" "+sname;
	}
}
public class SortDemo2 {
	public static void main(String[] args) {
		List<Student> students = Arrays.asList(new Student(2, "abc"), new Student(1, "xyz"), new Student(3, "pqr"));
		
		/*Collections.sort(students);
		students.forEach(student->System.out.print(student+" "));*/
		
		students.sort(null);
		students.forEach(student->System.out.print(student+" "));
	}
}
