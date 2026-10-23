import java.util.Random;

public class Hero {
	private String heroName, heroType;
	int attack, magic, hp;
	
	Random random = new Random();
	public Hero(String heroType, String heroName) {
		this.heroType = heroType;
		this.heroName = heroName;
		if(heroType.equals("Warrior")) {
			this.hp = random.nextInt(150) + 50;
			this.attack = 50;
			this.magic = 40;
		} 
		else if(heroType.equals("Archer")) {
			this.hp = random.nextInt(100) + 50;
			this.attack = 30;
			this.magic = 60;
		}
	}
	public String getHeroName() {
		return heroName;
	}
	public void setHeroName(String heroName) {
		this.heroName = heroName;
	}
	public String getHeroType() {
		return heroType;
	}
	public void setHeroType(String heroType) {
		this.heroType = heroType;
	}
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	
	public void attack(Enemy enemy, int opt) {
		if(heroType.equals("Warrior")) {
			if(opt == 1) {
				System.out.println("Warrior attacks with Axe..");
				enemy.setHp(enemy.getHp() - attack);
			}
			else if(opt == 2) {
				System.out.println("Warrior uses Iron Fist..");
				enemy.setHp(enemy.getHp() - magic);
			}
		}
		else if(heroType.equals("Archer")) {
			if(opt == 1) {
				System.out.println("Archer uses Arrow..");
				enemy.setHp(enemy.getHp() - magic);
			}
			else if(opt == 2) {
				System.out.println("Archer uses Arrow Blast..");
				enemy.setHp(enemy.getHp() - magic);
			}
		}
		
		if(enemy.getHp() < 0) {
			enemy.setHp(0);
		}
	}
}
