package main;

import java.util.Random;

public class Hero {
	private String heroType, heroName;
	int attack, magic;
	int hp;
	Random rand = new Random();
	public Hero(String heroType, String heroName) {
		// TODO Auto-generated constructor stub
		this.heroType = heroType;
		this.heroName = heroName;
		
		if(heroType.equals("Warrior")) {
			this.attack = 50;
			this.magic = 40;
			this.hp = rand.nextInt(150) + 50;
		}
		else if(heroType.equals("Archer")) {
			this.attack = 30;
			this.magic = 60;
			this.hp = rand.nextInt(100) + 50;
		}
	}
	
	public String getHeroType() {
		return heroType;
	}

	public void setHeroType(String heroType) {
		this.heroType = heroType;
	}

	public String getHeroName() {
		return heroName;
	}

	public void setHeroName(String heroName) {
		this.heroName = heroName;
	}

	public int getAttack() {
		return attack;
	}

	public int getMagic() {
		return magic;
	}
	
	public int getHP() {
		return hp;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}
	
	// opt = 1 --> Attack
	// opt = 2 --> Magic
	public void attack(Enemy enemy, int opt) {
		
		if(opt == 1) {
			
			if(heroType.equals("Warrior")) {
				System.out.println("Warrior attack with Axe\n");
			}
			else {
				System.out.println("Archer attack with Bow\n");
			}
			
			enemy.setHp(getHP() - attack); 
		}
		else if(opt == 2) {
			
			if(heroType.equals("Warrior")) {
				System.out.println("Warrior use Iron Fist\n");
			}
			else {
				System.out.println("Archer use Arrow Blast\n");
			}
			
			enemy.setHp(getHP() - magic);
		}
		
		if(enemy.getHp() < 0) {
			enemy.setHp(0);
		}
	}
}
