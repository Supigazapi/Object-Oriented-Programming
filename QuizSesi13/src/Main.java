import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	Scanner sc = new Scanner(System.in);
	ArrayList<Hero> heroList = new ArrayList<Hero>();
	
	private void createNewHero() {
		String heroType, heroName;
		System.out.print("Choose hero type [Warrior/Archer]: ");
		heroType = sc.nextLine();
		while(!heroType.equals("Warrior") && !heroType.equals("Archer")) {
			System.out.print("Choose hero type [Warrior/Archer]: ");
			heroType = sc.nextLine();
		}
		
		System.out.print("Input hero name [5-30 characters]: ");
		heroName = sc.nextLine();
		while(heroName.length() < 5 || heroName.length() > 30) {
			System.out.print("Input hero name [5-30 characters]: ");
			heroName = sc.nextLine();
		}
		
		Hero newHero = new Hero(heroType, heroName);
		heroList.add(newHero);
		
		System.out.println("A new hero created successfully..");
	}
	
	private void viewHeroList() {
		if (heroList.isEmpty()) {
			System.out.println("There is no hero in Hero List..");
			return;
		}
		else {
			System.out.printf("%-4s | %-30s | %-10s | %-5s |\n", "No", "Name", "Type", "HP");
			int i = 1;
			for (Hero hero : heroList) {
				System.out.printf("%-4d | %-30s | %-10s | %-5d |\n", i++, hero.getHeroName(), hero.getHeroType(), hero.getHp());
			} 
		}
	}
	private void battleEnemy() {
		if (heroList.isEmpty()) {
			System.out.println("Please create new hero first..");
			return;
		}
		
		Hero mainHero = heroList.get(0); //getting the first hero to play
		Enemy enemy = new Enemy();
		int opt = 0;
		
		while(mainHero.getHp() > 0 && enemy.getHp() > 0) {
			System.out.printf("Your HP : %d\n", mainHero.getHp());
			System.out.printf("Enemy HP : %d\n\n", enemy.getHp());
			
			System.out.println("1. Attack");
			System.out.println("2. Magic");
			System.out.print("Choose [1-2]: ");
			
			opt = 0;
			while(opt != 1 && opt != 2) {
				try {
					opt = sc.nextInt(); sc.nextLine();
				} catch (Exception e) {
					sc.nextLine();
				}
			}
			
			System.out.println();
						
			mainHero.attack(enemy, opt);
			enemy.attack(mainHero);
			
			System.out.println();
			
			if(mainHero.getHp() >= 0 && enemy.getHp() <= 0) {
				System.out.println("\nYour HP: " + mainHero.getHp());
				System.out.println("Enemy HP: " + enemy.getHp());
				System.out.println("\nCongratulations. You Win!!\n");
			}
			
			if(enemy.getHp() >= 0 && mainHero.getHp() <= 0) {
				System.out.println("\nYour HP: " + mainHero.getHp());
				System.out.println("Enemy HP: " + enemy.getHp());
				System.out.println("\nSorry, You Lose..\n");
			}
			
			if(mainHero.getHp() <= 0) {
				System.out.println("Battle Report");
				System.out.println("-------------------");
				System.out.println("Your Hero is dead on the battle!");
				System.out.println("It will be removed from Hero List..");
				heroList.remove(0);
				break;
			}
		}
	}
	
	public Main() {
		int option = -1;
		while(true) {
			System.out.println();
			System.out.println("BINUS Battle Realms");
			System.out.println("----------------------");
			System.out.println("1. Create New Hero");
			System.out.println("2. View Hero List");
			System.out.println("3. Find Enemy and Battle");
			System.out.println("4. Exit");
			
			while (true) {
				try {
					System.out.print("Choose [1-4]: ");
					option = sc.nextInt(); sc.nextLine();
					System.out.println();
					
					switch (option) {
						case 1:
							createNewHero();
							break;
						case 2:
							viewHeroList();
							break;
						case 3:
							battleEnemy();
							break;
						case 4: System.exit(0);
						}
				}
			
				catch (Exception e) {
					sc.nextLine();
				}
				
				if(option >= 1 && option <= 4) break;
			}
		}
	}
	public static void main(String[] args) {
		new Main();
	}
}
