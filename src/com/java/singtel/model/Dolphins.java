package com.java.singtel.model;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Dolphins implements Animal {
	
	private Fish fish;
	
	public Dolphins(Fish fish) {
		this.fish = fish;
	}

	@Override
	public int fly() {
		return this.fish.fly();
	}

	@Override
	public int sing() {
		return this.fish.sing();
	}

	@Override
	public int swim() {
		return this.fish.swim();
	}
	
	@Test
	public void testDolphins() {
		Dolphins obj = new Dolphins(new Shark());
		
		assertEquals(obj.swim(), 0);

	}

}
