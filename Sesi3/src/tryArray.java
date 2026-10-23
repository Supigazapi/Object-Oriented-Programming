import java.util.ArrayList;
import java.util.Vector;

public class tryArray {

	public tryArray() {
		// cara deklarasi array
		//int[] nilai = new int[5];
		int[] nilai = {90, 85, 60, 100, 75};
		String[] nama = {"Andi", "Budi", "Cecep", "Dedi", "Eko"};
		int total = 0;
		
		nilai[0] = 95;
		
		System.out.println("Nama     | Nilai");
		for(int i=0; i<nilai.length; i++) {
			System.out.printf("%-8s | %5d\n", nama[i], nilai[i]);
		}	
		
		for(int i=0; i<nilai.length; i++) {
			total += nilai[i];
		}
		System.out.print("\nRata-rata Nilai kelas = " + (total / nilai.length));
		
		// duplikasi array by reference (pointer)
		int[] nilai2 = nilai;
		
		// cara buktiin
		nilai2[0] = 100;
		
		System.out.print("\nIsi dari array nilai = ");
		for(int i=0; i<nilai.length; i++) {
			System.out.print(nilai[i] + " ");
		}
		
		System.out.print("\nIsi dari array nilai2 = ");
		for(int i=0; i<nilai2.length; i++) {
			System.out.print(nilai2[i] + " ");
		}
		
		// duplikasi array by value
		String[] nama2 = new String[5];
		
		//cara 1: by looping
//		for(int i=0; i<nama.length; i++) {
//			nama2[i] = nama[i];
//		}
		
		//cara 2: method arraycopy
//		System.arraycopy(nama, 0, nama2, 0, 5);
		
		//cara 3: method clone
		nama2 = nama.clone();
		
		// pembuktian
		nama2[0] = "Anda";
		System.out.print("\nIsi dari array nama = ");
		for(int i=0; i<nama.length; i++) {
			System.out.print(nama[i] + " ");
		}
		
		System.out.print("\nIsi dari array nama2 = ");
		for(int i=0; i<nama2.length; i++) {
			System.out.print(nama2[i] + " ");
		}
		
		//Array 2 dimensi
		// int[][] matrix = new int[3][4]; // [baris][kolom]
		int[][] matrix = {{1, 2,  3,  4}, 
				          {5, 6,  7,  8}, 
				          {9, 10, 11, 12}};
		
		System.out.println("\n\n" + matrix[1][2]);
		System.out.println(matrix[2][1]);
//		System.out.println(matrix[3][4]); // runtime error : Index out of bounds
		
		//foreach loop
		System.out.println("Isi dari array nilai = ");
		for(int n : nilai) {
			System.out.print(n + " ");
		}
		
		swap(nilai, 0, 1);
		
		System.out.println("\nIsi dari array nilai setelah di-swap = ");
		for(int n : nilai) {
			System.out.print(n + " ");
		}	
		
		// ArrayList
		ArrayList<String> arrNama = new ArrayList<String>();
		
		arrNama.add("Fifi"); // index 0
		arrNama.add("Gani"); // index 1
		arrNama.add("Hanung"); // index 2
//		arrNama.add(100);
//		arrNama.add(5.5);
		
//		arrNama.remove(1);
//		arrNama.set(1, "Hanny");
		
		System.out.println("\n\nIsi dari arrNama = ");
		for(int i=0; i<arrNama.size(); i++) {
			System.out.print(arrNama.get(i) + " ");
		}
		
		//Vector
		Vector<Integer> vecNilai = new Vector<Integer>();
		
		vecNilai.add(100);
		vecNilai.add(90);
		vecNilai.add(80);
		
		vecNilai.remove(1);
		vecNilai.set(1, 70);
		
		System.out.println("\n\nIsi dari vecNilai = ");
		for(int i=0; i<vecNilai.size(); i++) {
			System.out.print(vecNilai.get(i) + " ");
		}
	}
	
	//passing arrays selalu by reference
	public void swap(int[] n, int x, int y) {
		int kulkas = n[x];
		n[x] = n[y];
		n[y] = kulkas;
	}

	public static void main(String[] args) {
		new tryArray();
	}

}