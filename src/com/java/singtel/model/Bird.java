package com.java.singtel.model;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Bird implements Animal {
	
	public int fly() {
		System.out.println("I am flying");
		return 0;
	}
	
	public int sing() {
		System.out.println("I am Singing");
		return 0;
	}
	
	public int swim() {
		System.out.println("I am not swiming");
		return -1;
	}
	
	@Test
	public void testBird() {
		Bird obj = new Bird();
		
		assertEquals(obj.walk(), 0);
		assertEquals(obj.fly(), 0);
		assertEquals(obj.sing(), 0);
		assertEquals(obj.swim(), -1);
	}
}
