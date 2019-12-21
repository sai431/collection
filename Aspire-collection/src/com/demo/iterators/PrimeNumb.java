package com.demo.iterators;

public class PrimeNumb {
	
	
	public static void main(String[] args) {
		int n=7,i,m=0;
		m=n/2;//1.5
		System.out.println(m);//1
		System.out.println(n%2);//1
		for(i=2;i<=m;i++){      
		    if(n%i==0){  
		    	System.out.println(n%i);//1
		    }
		     System.out.println(n+" is not prime number");      
		         
		     break;      
		    }  
		
	}

}
