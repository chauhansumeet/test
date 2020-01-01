/**
 * 
 */
package com.java.singtel.model;

/**
 * @author sumeet
 *
 */
public interface Animal {
	
	default public int walk() {
		System.out.println("I am walking");
		return 0;
	}
	
	public int fly();
	public int sing();
	public int swim();
}
