import java.util.Scanner;

public class TryWrapper {
	
	//constructor
	public TryWrapper() {
		//Primitive Data Types (tipe data primitif)
		int angka = 10;
		char grade = 'A';
		double ipk = 3.5;
		
		//Wrapper Class
		Integer num = 10;
		Character grade2 = 'B';
		Double ips = 3.9;
		
		//Typecasting
		//Dari numerik ke string
		int a = (int) ipk;
		String b = ips.toString(); //toString cmn bisa wrapper class, contoh yang gabisa:
		//String c = ipk.toString();
		String c = ipk + "";
		
		//Dari string ke numerik
		String e = "123";
		int f = Integer.parseInt(e);
		int g = Integer.valueOf(e);
		Integer h = new Integer(e); //Harus pakai wrapper class, karena disimpan di wrapper class juga, tp cara ini deprecated
		System.out.println(e + 4);
		System.out.println(f + 4);
		
		final int d = 10; //Untuk bikin constant (nilai tetap)
		//d = 15; //Error, karena d itu constant
		
		//Buat cari MAX or MIN value dari wrapper class
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Double.MAX_VALUE);
		System.out.println(Double.MIN_VALUE);
		
		//Comparing String
		String i = "hello";
		String j = "helo";
		System.out.println(i == j);
		System.out.println(i.equals(j));
		System.out.println(i.compareTo(j)); //Akan return perbedaan ASCII ketika ketemu huruf yang beda
		
		System.out.println(Math.PI);
		
		//Rounding Method
		System.out.println(Math.ceil(2.1)); //Round ke atas, datatype double
		System.out.println(Math.floor(2.1)); //Round ke bawah, datatype double
		System.out.println(Math.rint(2.5)); //Round ke nearest even integer, datatype integer, banker's method
		System.out.println(Math.rint(3.5));
		System.out.println(Math.round(2.5)); //Round ke nearest integer, datatype integer
		
		//Random Method
		double y = 9.0;
		double z = Math.random()*10;
		System.out.println(z);
		System.out.println(y + Math.random()*y);
		
		//Random 1-6
		for(int x=0 ; x<15 ; x++) {
			System.out.println((int)Math.ceil(Math.random()*6));
		}
		
		//Random 10-30
		for(int x=0 ; x<15 ; x++) {
			System.out.println((int)Math.round(Math.random()*20) + 10);
		}
		
		//Increment
		int l = 5;
		System.out.println(l++); //Postincrement, variablenya dipakai dulu baru ditambah 1
		System.out.println(++l); //Preincrement, variablenya ditambah 1 dulu baru digunakan
		
		//Exception Handling, Try and Catch
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		
		do {
			try {
				System.out.print("Masukkan angka: ");
				int m = sc.nextInt();
				sc.nextLine();
				flag = false;
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				//e1.printStackTrace();
				sc.nextLine();
				System.out.println("Input harus angka! Silakan masukkan kembali");
				flag = true;
			}
		} while (flag);
		
		
		System.out.print("Masukkan nama: ");
		String nama = sc.nextLine();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new TryWrapper(); //cmn panggil constructornya doang
		//TryWrapper t = new TryWrapper(); //cara lain buat panggil constructor, untuk manipulasi constructornya
		
	}

}
