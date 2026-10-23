import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	Scanner sc = new Scanner(System.in);
	ArrayList<Karyawan> listKaryawanTetap = new ArrayList<>();
	ArrayList<Karyawan> listKaryawanKontrak = new ArrayList<>();

	
	public void tambahKaryawanTetap() {
		System.out.print("Masukkan ID: ");
		String ID = sc.nextLine();
		System.out.print("Masukkan Nama: ");
		String Nama = sc.nextLine();
		System.out.print("Masukkan Jabatan [Staff | Supervisor | Manager]: ");
		String Jabatan = sc.nextLine();
		listKaryawanTetap.add(new KaryawanTetap(ID, Nama, Jabatan));
	}
	
	public void tambahKaryawanKontrak() {
		System.out.print("Masukkan ID: ");
		String ID = sc.nextLine();
		System.out.print("Masukkan Nama: ");
		String Nama = sc.nextLine();
		System.out.print("Masukkan Jumlah Jam: ");
		Integer Jam = sc.nextInt(); sc.nextLine();
		listKaryawanKontrak.add(new KaryawanKontrak(ID, Nama, Jam));
	}
	
	public void lihatData() {
		System.out.println();
		if(listKaryawanTetap.isEmpty()) {
			System.out.println("Tidak ada karyawan tetap.");
			System.out.println();
		} else {
			System.out.println("Karyawan Tetap");
			System.out.println("============================================");
			System.out.printf("|%-4s|%-10s|%-15s|%-10s|\n", "No", "ID", "Nama", "Gaji");
			int i = 1;
			for(Karyawan karyawan : listKaryawanTetap) {
				System.out.printf("|%-4s|%-10s|%-15s|%-10d|\n", i++, karyawan.getID(), karyawan.getNama(), karyawan.getGaji());
			}
			System.out.println("============================================");
		}
		
		System.out.println();
		if(listKaryawanKontrak.isEmpty()) {
			System.out.println("Tidak ada karyawan kontrak.");
			System.out.println();
		} else {
			System.out.println("Karyawan Kontrak");
			System.out.println("============================================");
			System.out.printf("|%-4s|%-10s|%-15s|%-10s|\n", "No", "ID", "Nama", "Gaji");
			int j = 1;
			for(Karyawan karyawan : listKaryawanKontrak) {
				System.out.printf("|%-4s|%-10s|%-15s|%-10d|\n", j++, karyawan.getID(), karyawan.getNama(), karyawan.getGaji());
			}
			System.out.println("============================================");
		}
	}
	
	public Main() {
		int choice = 0;
		do {
			System.out.println("Data Karyawan");
			System.out.println("=================");
			System.out.println("1. Tambah Karyawan Tetap");
			System.out.println("2. Tambah Karyawan Kontrak");
			System.out.println("3. Lihat Data");
			System.out.println("4. Exit");
			System.out.print("Choice [1-4]: ");
			choice = sc.nextInt(); sc.nextLine();
			
			switch(choice) {
				case 1: tambahKaryawanTetap(); break;
				case 2: tambahKaryawanKontrak(); break;
				case 3: lihatData(); break;
			}
			
			System.out.println("Press enter to continue..");
			sc.nextLine();
		} while(choice != 4);
	}

	public static void main(String[] args) {
		new Main();

	}
}
