package com.java.singtel.app;

import com.java.singtel.model.Animal;
import com.java.singtel.model.Bird;
import com.java.singtel.model.Butterfly;
import com.java.singtel.model.Chicken;
import com.java.singtel.model.Clownfish;
import com.java.singtel.model.Dolphins;
import com.java.singtel.model.Duck;
import com.java.singtel.model.Parrot;
import com.java.singtel.model.Rooster;
import com.java.singtel.model.Shark;
import com.java.singtel.service.CountService;
import com.java.singtel.service.CountServiceImpl;

public class Solution {
	
	private static CountService countService = new CountServiceImpl();
	
	public static void main(String[] args) {

		Bird bird = new Bird();
		bird.walk();
		bird.fly();
		bird.sing();

		Animal[] animals = new Animal[] { new Bird(), new Duck(), new Chicken(), new Rooster(),
				new Parrot(new Rooster()), new Shark(), new Clownfish(), new Dolphins(new Shark()), new Butterfly() };

		System.out.println("Total count who can fly is " + countService.countAnimalWhoFly(animals));
		System.out.println("Total count who can sing is " + countService.countAnimalWhoSing(animals));
		System.out.println("Total count who can swim is " + countService.countAnimalWhoSwim(animals));
		System.out.println("Total count who can walk is " + countService.countAnimalWhoWalk(animals));
	}
}
