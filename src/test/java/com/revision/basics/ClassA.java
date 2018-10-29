package com.revision.basics;

import org.testng.annotations.Test;

public class ClassA {

	@Test
	public void init() {
		
		
		geturl();
	}
	
	
	
	public void geturl() {
		System.out.println("in Add method");
	}
	
	public void add(int a, int b) {
		System.out.println(a+b);
	}
	
}
