import java.util.Random;

public class Enemy {
	int hp;
	Random random = new Random();
	
	public Enemy() {
		this.hp = random.nextInt(150) + 50;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}
	
	public void attack(Hero hero) {
		hero.setHp(hero.getHp() - (random.nextInt(60) + 10));
		
		if(hero.getHp() < 0) {
			hero.setHp(0);
		}
	}
}
