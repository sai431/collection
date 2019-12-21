package com.demo.iterators;

import java.util.Stack;

public class StackDemo {
public static void main(String[] args) {
	Stack<String> stk =new Stack<>();
	stk.push("sai");
	stk.push("alex");
	stk.push("hhh");
	stk.push("push");
	stk.push("A");
	stk.push("B");
	stk.push("C");
	
		System.out.println("stk values"+stk.toString());
		stk.pop();
		System.out.println("stk values"+stk.toString());
		System.err.println("pop "+stk.pop());//removes top and return remaing part of stack
		System.err.println("peek "+stk.peek());// return top value of the stack  here oput is peek B and doesnot remove any thing
		System.out.println("stk values"+stk.toString());
		System.out.println(stk.search("A"));//1
		System.out.println(stk.search("Z"));//-1 bcz not there 
	//	stk values[sai, alex, hhh, push, A, B, C]
	//			stk values[sai, alex, hhh, push, A, B]
	//			stk values[sai, alex, hhh, push, A, B]
	
	System.out.println("------------");
}
}
