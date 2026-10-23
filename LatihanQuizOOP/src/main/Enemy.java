package main;

import java.util.Random;

public class Enemy {
	
	int hp;
	Random rand = new Random();
	public Enemy() {
		// TODO Auto-generated constructor stub
		this.hp = rand.nextInt(150) + 50;
	}
	
	
	public int getHp() {
		return hp;
	}


	public void setHp(int hp) {
		this.hp = hp;
	}


	public void attack(Hero hero) {
		hero.setHp(hero.getHp() - rand.nextInt(60) + 10);
		
		if(hero.getHp() < 0) {
			hero.setHp(0);
		}
	}
}
