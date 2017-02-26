package com;

public class B extends A {

	int b=10;
	String b1="core";
	
	public static void main(String[] args) throws InterruptedException {
		
		
		A a=new B();
		System.out.println("Program started");
		
		Thread.sleep(100000);
	
		System.out.println("Program end");
	}
}
