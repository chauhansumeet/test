package com.java.singtel.model;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Duck extends Bird {
	
	@Override
	public int sing() {
		System.out.println("Quack, quack");
		return 0;
	}
	
	@Override
	public int swim() {
		System.out.println("I am swimming");
		return 0;
	}
	
	@Test
	public void testDuck() {
		Bird obj = new Duck();
		
		assertEquals(obj.sing(), 0);
		assertEquals(obj.swim(), 0);		
	}
}
