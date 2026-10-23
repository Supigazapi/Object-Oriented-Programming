package main;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	Scanner sc = new Scanner(System.in);
	ArrayList<Hero> heroList = new ArrayList<Hero>();
	public Main() {
		// TODO Auto-generated constructor stub
		while(true) {
			clearScreen(40);
			System.out.println("BINUS Battle Realms");
			System.out.println("---------------------");
			System.out.println("1. Create New Hero");
			System.out.println("2. View Hero List");
			System.out.println("3. Find Enemy and Battle");
			System.out.println("4. Exit");
			int option = -1;
			while(true) {
				try {
					System.out.print("Choose [1-4]: ");
					option = sc.nextInt();
					sc.nextLine();
					
					switch(option) {
					case 1:
						createNewHero();
						break;
					case 2:
						viewHero();
						break;
					case 3:
						findEnemyToBattle();
						break;
					case 4:
						System.exit(0);
					}
					
				} catch (Exception e) {
					// TODO Auto-generated catch block
					sc.nextLine();
				}
				if(option > 0 && option < 5) {
					break;
				}
			}
		}
	}
	
	private void createNewHero() {
		clearScreen(1);
		// TODO Auto-generated method stub
		String heroType, heroName;
		
		// validate heroType
		System.out.print("Choose hero type [Warrior/Archer]: ");
		heroType = sc.nextLine();
		while(!heroType.equals("Warrior") && !heroType.equals("Archer")) {
			System.out.print("Chooooose hero type [Warrior/Archer]: ");
			heroType = sc.nextLine();
		}
		
		//validate heroname
		System.out.println("Input hero name [5-30 characters]: ");
		heroName = sc.nextLine();
				
		while(heroName.length() < 5 || heroName.length() > 30) {
			System.out.println("Input hero name [5-30 characters]: ");
			heroName = sc.nextLine();
		}
		
		// add new hero
		Hero newHero = new Hero(heroType, heroName);
		heroList.add(newHero);
		System.out.println("Success create new hero!");
		
		sc.nextLine();
	}



	private void viewHero() {
		// TODO Auto-generated method stub
		for (Hero hero : heroList) {
			System.out.printf("Name: %s, Type: %s, HP: %d\n", hero.getHeroName(), hero.getHeroType(), hero.getHP());
		}
		
		sc.nextLine();
	}



	private void findEnemyToBattle() {
		clearScreen(40);
		// TODO Auto-generated method stub
		if(heroList.isEmpty()) {
			System.out.println("Please create new hero first...");
			sc.nextLine();
			return;
		}
		
		Hero mainHero = heroList.get(0);
		Enemy enemy = new Enemy();
		int opt;
		while(mainHero.getHP() > 0) {
			System.out.println("Your HP: " + mainHero.getHp());
			System.out.println("Enemy HP: " + enemy.getHp());
			System.out.println("\n1. Attack");
			System.out.println("2. Magic");
			opt = 0;
			while(opt != 1 && opt != 2) {
				System.out.println("Choose [1-2]: ");
				try {
					opt = sc.nextInt();
					sc.nextLine();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					sc.nextLine();
				}
			}
			
			mainHero.attack(enemy, opt);
			enemy.attack(mainHero);
			
			if(enemy.getHp() <= 0 && mainHero.getHP() >= 0) {
				System.out.println("Your HP: " + mainHero.getHp());
				System.out.println("Enemy HP: " + enemy.getHp());
				System.out.println("Congratulation, You Win");
				
				if(mainHero.getHp() > 0) {
					break;
				}
			}
			else if(enemy.getHp() > 0 && mainHero.getHp() <= 0) {
				System.out.println("Your HP: " + mainHero.getHp());
				System.out.println("Enemy HP: " + enemy.getHp());
				System.out.println("Sorry. You Lose!!!");
			}
			
			
			if(mainHero.getHp() <= 0) {
				System.out.println("Battle Report");
				System.out.println("------------------");
				System.out.println("Your Hero is dead on the battle!");
				System.out.println("It will be removed from Hero List");
				heroList.remove(0);
				break;
			}
			
		}
		sc.nextLine();
	}

	public void clearScreen(int n) {
		for (int i = 0; i < n; i++) {
			System.out.println();
		}
	}

	public static void main(String[] args) {
		new Main();
	}
}
