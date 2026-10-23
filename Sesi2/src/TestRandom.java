import java.util.Scanner;

public class TestRandom {

	public TestRandom() {
		// TODO Auto-generated constructor stub
		String nama;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Masukkan nama Anda: ");
		nama = sc.nextLine();
		
		if(nama == "Catherine") {
			System.out.println("Welkam Ketrin");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new TestRandom();
	}

}
