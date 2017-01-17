package com.test.quiz3;

public class AnimalExam {
	public static void main(String[] arge) {
		
		Animal tiger = new Animal();
		Animal cow = new Animal();
		tiger.feed = 1;
		cow.feed = 2;
		
		System.out.println(tiger.eat(cow));
		System.out.println(cow.eat(tiger));
		
		Plant carret = new Plant();
		System.out.println(tiger.eat(carret));
		System.out.println(cow.eat(carret));
		
		////////////////////////////////////
		
		Animal dog = new Animal();
		dog.strength = dog.weight = 27;
		dog.skin = 1;
		dog.speed = 6;
		dog.life = 15; dog.age = 8;
		dog.feed = 3;
		
		tiger.strength = tiger.weight = 310;
		tiger.skin = 1;
		tiger.speed = 65;
		tiger.life = 26; tiger.age = 2;
		
		System.out.println(dog.attack(tiger));
		System.out.println(dog.strength);
		
		Animal bear = new Animal();
		bear.strength = bear.weight = 600;
		bear.skin = 1;
		bear.speed = 40;
		bear.life = 20; bear.age = 3;
		bear.feed = 3;
		
		System.out.println(tiger.attack(bear));
		System.out.println(tiger.strength);
		System.out.println(bear.attack(tiger));
		System.out.println(bear.strength);
		
	}
}
