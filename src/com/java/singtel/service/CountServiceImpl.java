package com.java.singtel.service;

import com.java.singtel.model.Animal;

public class CountServiceImpl implements CountService {

	@Override
	public int countAnimalWhoFly(Animal[] animals) {

		int count = 0;

		for (Animal obj : animals) {
			if (obj.fly() == 0)
				count++;
		}

		return count;
	}

	@Override
	public int countAnimalWhoWalk(Animal[] animals) {
		int count = 0;

		for (Animal obj : animals) {
			if (obj.walk() == 0)
				count++;
		}

		return count;
	}

	@Override
	public int countAnimalWhoSing(Animal[] animals) {
		int count = 0;

		for (Animal obj : animals) {
			if (obj.sing() == 0)
				count++;
		}

		return count;
	}

	@Override
	public int countAnimalWhoSwim(Animal[] animals) {
		int count = 0;

		for (Animal obj : animals) {
			if (obj.swim() == 0)
				count++;
		}

		return count;
	}

}
