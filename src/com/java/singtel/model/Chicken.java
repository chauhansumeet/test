package com.java.singtel.model;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Chicken extends Bird {
	@Override
	public int sing() {
		System.out.println("Cluck, cluck");
		return 0;
	}

	@Override
	public int fly() {
		System.out.println("I can not flying");
		return -1;
	}

	@Test
	public void testChicken() {
		Bird obj = new Chicken();

		assertEquals(obj.sing(), 0);
		assertEquals(obj.fly(), -1);
	}
}
