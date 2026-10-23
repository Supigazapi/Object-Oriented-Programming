import java.util.Random;

public class Block {
	protected String color;
	static String[] colorList = {"Red", "Green", "Blue", "Yellow", "Purple"};
	static Random random = new Random();
	
	public Block() {
		color = colorList[random.nextInt(5)];
	}

	public String getColor() {
		return color;
	}

	public void display() {
		if(color.equals("Red")) {
			System.out.print("[R]");
		} else if(color.equals("Green")) {
			System.out.print("[G]");
		} else if(color.equals("Blue")) {
			System.out.print("[B]");
		} else if(color.equals("Yellow")) {
			System.out.print("[Y]");
		} else if(color.equals("Purple")){
			System.out.print("[P]");
		}
	}
	
	public int destroy() {
		int point = 10;
		
		return point;
	}
}
