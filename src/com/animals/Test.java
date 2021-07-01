package com.animals;

public class Test {

	public static void main(String[] args) {
		
	    Animal[] animals = listAnimals();
	    for(Animal a : animals) {
	        a.speak();
	        if (a.getClass().getName().contains("Cat"))
	        	System.out.println("I ll take you home");
	    }

	}
    static Animal[] listAnimals() {
        Animal[] animals = new Animal[3];
        animals[0] = new Dog();
        animals[1] = new Cat();
        animals[2] = new Duck();
        return animals;
    }

}
