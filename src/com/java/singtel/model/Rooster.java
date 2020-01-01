package com.java.singtel.model;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Rooster extends Chicken {
	
	@Override
	public int sing() {
		System.out.println("“Cock-a-doodle-doo");
		return 0;
	}
	
	@Test
	public void testRooster() {
		Rooster obj = new Rooster();
		
		assertEquals(obj.sing(), 0);
	}
}
