package com.java.singtel.service;

import com.java.singtel.model.Animal;

public interface CountService {

	public int countAnimalWhoFly(Animal[] animals);

	public int countAnimalWhoWalk(Animal[] animals);

	public int countAnimalWhoSing(Animal[] animals);

	public int countAnimalWhoSwim(Animal[] animals);
}
