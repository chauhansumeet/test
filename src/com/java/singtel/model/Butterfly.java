package com.java.singtel.model;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Butterfly implements Animal {
	
	private Bird bird = null;
	
	private boolean isCaterpillar;
	
	public Butterfly() {
		this.bird = new Bird();
		this.isCaterpillar = true;
	}
	
	public Butterfly(boolean isCaterpillar) {
		this.bird = new Bird();
		this.isCaterpillar = isCaterpillar;
	}
	
	public void setIsCaterpillar(boolean isCaterpillar) {
		this.isCaterpillar = isCaterpillar;
	}
	
	@Override
	public int walk() {
		if(this.isCaterpillar)
			return Animal.super.walk();
		else
			return -1;
	}

	@Override
	public int fly() {
		if(this.isCaterpillar)
			return -1;
		else
			return this.bird.fly();
	}

	@Override
	public int sing() {
		return -1;
	}

	@Override
	public int swim() {
		return this.bird.swim();
	}
	
	@Test
	public void testButterfly() {
		Butterfly obj = new Butterfly();
		
		assertEquals(obj.walk(), 0);
		assertEquals(obj.fly(), -1);
		
		obj.setIsCaterpillar(false);
		
		assertEquals(obj.walk(), -1);
		assertEquals(obj.fly(), 0);
	}

	
}
