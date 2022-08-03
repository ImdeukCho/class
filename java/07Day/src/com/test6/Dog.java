package com.test6;

public class Dog extends Pet{
	String species;

	public Dog(String name, int age, String gender, String species) {
		super(name, age, gender);
		this.species = species;
	}

	@Override
	public String getPet() {
		return super.getPet() + "\t" + species;
	}

	public String getSpecies() {
		return species;
	}

	public void setSpecies(String species) {
		this.species = species;
	}
	
	
	
	
}
