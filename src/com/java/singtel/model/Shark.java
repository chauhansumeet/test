package com.java.singtel.model;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Shark extends Fish implements Animal {

	@Override
	public int size() {
		System.out.println("I am large");
		return 0;
	}

	@Override
	public int color() {
		System.out.println("I am grey");
		return 0;
	}

	@Override
	public int jokes() {
		System.out.println("Do not make jokes");
		return -1;
	}

	@Override
	public int eat() {
		System.out.println("I do eat other fish");
		return 0;
	}

	@Test
	public void testShark() {
		Shark obj = new Shark();
		
		assertEquals(obj.size(), 0);
		assertEquals(obj.color(), 0);
		assertEquals(obj.jokes(), -1);
		assertEquals(obj.eat(), 0);
		
	}
	
}
