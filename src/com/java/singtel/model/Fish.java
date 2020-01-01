package com.java.singtel.model;

public abstract class Fish implements Animal{

	public abstract int size();
	public abstract int color();
	public abstract int jokes();
	public abstract int eat();
	
	@Override
	public int fly() {
		System.out.println("Cannot fly");
		return -1;
	}

	@Override
	public int sing() {
		System.out.println("Cannot sing");
		return -1;
	}

	@Override
	public int swim() {
		System.out.println("I am swimming");
		return 0;
	}
	
	@Override
	public int walk() {
		System.out.println("Cannot walk");
		return -1;
	}

}
