package com.java.singtel.model;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Parrot extends Bird {

	private Animal livingWith;
	
	public Parrot(Animal animal) {
		this.livingWith = animal;		
	}
	
	@Override
	public int sing() {
		return this.livingWith.sing();
	}
	
	@Test
	public void testParrot() {
		Parrot obj = new Parrot(new Rooster());
		
		assertEquals(obj.sing(), 0);
	}
}
