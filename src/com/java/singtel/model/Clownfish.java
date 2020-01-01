package com.java.singtel.model;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Clownfish extends Fish implements Animal {

	@Override
	public int size() {
		System.out.println("I am small");
		return 0;
	}

	@Override
	public int color() {
		System.out.println("I am orange");
		return 0;
	}

	@Override
	public int jokes() {
		System.out.println("I make jokes");
		return 0;
	}

	@Override
	public int eat() {
		System.out.println("I do not eat other fish");
		return -1;
	}

	@Test
	public void testClownfish() {
		Clownfish obj = new Clownfish();
		
		assertEquals(obj.size(), 0);
		assertEquals(obj.color(), 0);
		assertEquals(obj.jokes(), 0);
		assertEquals(obj.eat(), -1);
		
	}

}
