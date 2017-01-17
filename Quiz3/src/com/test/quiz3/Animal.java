package com.test.quiz3;

public class Animal {
	int length;		//¸ö±æÀÌ
	int weight;		//¹«°Ô
	int speed;		//¼Óµµ
	int age;		//³ªÀÌ
	int life;		//¼ö¸í
	int skin;		//Ç¥¸é (1=ÅĞ, 2=±êÅĞ, 3=µüµü, 4=¹Ì²ö¹Ì²ö)
	int legs;		//´Ù¸®°³¼ö
	int wings;		//³¯°³½Ö
	int feed;		//¸ÔÀÌ (1=µ¿¹°, 2=½Ä¹°, 3=Àâ½Ä)
	int breathe;	//¼û½¬´Â¹æ¹ı
	int habitat;	//»ç´Â°÷
	int horns;		//»Ô°³¼ö
	int strength;	//Ã¼·Â
	boolean alive;		
	
	public Animal() {
		length=0; weight=0; speed=0; age=0; life=0; skin=0; 
		legs=0; wings=0; feed=0; breathe=0; habitat=0; horns=0;
		strength = 0; alive = true;
	}
	
	boolean eat(Animal feed) {
		if (this.feed == 1 || this.feed == 3) {
			if (this.alive == true) {
				int satiety = feed.weight / 10;
				this.weight += satiety;
				this.strength += satiety * 2;
				return true;
			}
		}
		return false;
	}
	
	boolean eat(Plant feed) {
		if (this.feed == 2 || this.feed == 3) {
			return true;
		}
		return false;
	}
	boolean attack(Animal enemy) {
		if(this.alive == true && enemy.alive == true) {
			int defence = enemy.weight;
			defence = defence / (enemy.age*100/enemy.life);
			defence += enemy.speed * (Math.random()*10);
			if (enemy.skin == 3) defence += defence*0.2;
			else if (enemy.skin == 4) defence += defence*0.3;
			
			System.out.println("¹æ¾î·Â : " + defence); //debug ÄÚµå
			int attack = this.weight;
			if (this.feed == 1) attack += attack*0.3;
			attack += this.speed * (Math.random()*15);
			attack += this.horns * (Math.random()*5);
			if (this.wings > 0) attack *= 2;
			
			System.out.println("°ø°İ·Â : " + attack); //debug ÄÚµå
			int demage = attack - defence;
			if (demage > 0) {
				enemy.strength -= demage;
				if (enemy.strength < 0) enemy.alive = false;
				return true;
			}
			else if (demage < 0) 
				this.strength += demage;
				if (this.strength < 0) enemy.alive = false;
		}
		return false;
	}
}
