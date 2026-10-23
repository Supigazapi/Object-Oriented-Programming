import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
	ArrayList<Block> blocks = new ArrayList<>();
	Scanner sc = new Scanner(System.in);
	
	public void displayBlock() {
		for (Block block : blocks) {
			block.display();
		}
		
		System.out.println("");
		
		for(int i = 0; i < blocks.size(); i++) {
			System.out.printf(" %-2d", i);
		}
		System.out.println("");
	}
	
	public Main() {
		Random random = new Random();
		
		int index = random.nextInt(10);
		for(int i = 0; i < 10; i++) {
			if(i == index) {
				blocks.add(new ExplosionBlock());
			} else {
				blocks.add(new Block());
			}
		}
		
		int score = 0;
		for(int i = 0; i < 5; i++) {
			System.out.printf("Turn %d / 5\n", i + 1);
			System.out.println("Blocks");
			displayBlock();
			Block yourBlock = new Block();
			System.out.print("Your color: ");
			yourBlock.display();
			System.out.println("");
			
			System.out.print("Choose Index (0 - " + (blocks.size() - 1) + "): ");
			int playIndex = sc.nextInt();
			int destroyed = 0;
			if(blocks.get(playIndex).getColor().equals("E")) {
				if((playIndex + 2) < blocks.size()) {
					score += blocks.get(playIndex + 2).destroy();
					blocks.remove(playIndex + 2);
					destroyed++;
				}
				if((playIndex + 1) < blocks.size()) {
					score += blocks.get(playIndex + 1).destroy();
					blocks.remove(playIndex + 1);
					destroyed++;
				}
				
				score += blocks.get(playIndex).destroy();
				blocks.remove(playIndex);
				destroyed++;
				
				if((playIndex - 1) >= 0) {
					score += blocks.get(playIndex - 1).destroy();
					blocks.remove(playIndex - 1);
					destroyed++;
				}
				if((playIndex - 2) >= 0) {
					score += blocks.get(playIndex - 2).destroy();
					blocks.remove(playIndex - 2);
					destroyed++;
				}
				System.out.println("Special block, destroyed " + destroyed + " blocks! (+" + (destroyed * 10) + " pts)");
		 	} else {
				blocks.add(playIndex, yourBlock);
				
				int count = 1;
				
				for(int j = 1; j < blocks.size(); j++) {
					if(blocks.get(j).getColor().equals(blocks.get(j - 1).getColor())) {
						count++;
					} else {
						if(count >=3) {
							for(int k = j; k >= j - count + 1; k--) {
								score += blocks.get(k).destroy();
								blocks.remove(k);
								destroyed++;
							}
							System.out.println("Destroyed " + destroyed + " blocks! (+" + (destroyed * 10) + " pts)");
							break;
						}
						count = 1;
					}
				}
			}		
			
			System.out.println("Points: " + score);
			System.out.println("");
			
			if(blocks.size() < 0) break;
		}
		System.out.println("Game Over!");
		System.out.println("Total Points = " + score);
	}
	
	public static void main(String[] args) {
		new Main();
	}
}
