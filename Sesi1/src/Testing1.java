import java.util.Scanner;

public class Testing1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int umur;
		String nama = "";
		String alamat = "";
		
		System.out.println("Hello World!");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Masukkan nama Anda: ");
		nama = sc.nextLine();
		System.out.println("Welcome, " + nama);
		
		System.out.print("Masukkan umur Anda: ");
		umur = sc.nextInt(); sc.nextLine();
		System.out.println("Umur Anda " + umur);
		
		System.out.print("Masukkan alamat Anda: ");
		alamat = sc.nextLine();
		System.out.println("Anda tinggal di " + alamat);
	}
}