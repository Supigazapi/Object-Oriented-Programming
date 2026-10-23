
class User{
	String username = "Default";
	
	public void login() {
		System.out.println("User Login");
	}
	
	public void cetak() {
		System.out.println("Username: " + username);
	}
	
	// Overloading
	public void cetak(int a) {
		for(int i=0; i<a; i++) {
			System.out.print("_");
		}
		System.out.println();
	}
}

class Mhs extends User{
	// Overriding
	public void login() {
		System.out.println("Mahasiswa Login");
	}
	
	public void cetak(int a, int b) {
		System.out.println("Result of sum = " + (a+b));
	}
}

class Dosen extends User{
	// Overriding
	public void login() {
		System.out.println("Dosen Login");
	}
}

class Staff extends User{
	
}

public class Main {

	public Main() {
		Mhs m = new Mhs();
		m.login();
		m.username = "Marchello";
		m.cetak();
		m.cetak(30);
		m.cetak(50, 30);
		
		Dosen d = new Dosen();
		d.login();
		
		// Dynamic Binding -> Runtime karena dilihat dulu yang dipanggil login line berapa
		User u;
		u = new Mhs();
		u.login();
		
		u = new Dosen();
		u.login();
		
		u = new Staff();
		u.login();
		
		Persegi p = new Persegi();
		p.sisi = 5;
		System.out.println("Luas persegi = " + p.hitungLuas());
		System.out.println("Keliling persegi = " + p.hitungKeliling());
	}

	public static void main(String[] args) {
		new Main();
	}
}

abstract class BangunDatar{
	// Variable
	double x;
	
	// Constant
	final double pi = 3.14;
	
	// Abstract method
	public abstract double hitungLuas();
	public abstract double hitungKeliling();
	
	// Non abstract method
	public void print() {
		System.out.println("************");
	}
}

class Persegi extends BangunDatar{
	double sisi;
	
	// Overriding method
	public double hitungLuas() {
		return sisi + sisi;
	}
	
	public double hitungKeliling() {
		return 4 * sisi;
	}
}

class Lingkaran extends BangunDatar{
	double radius;
	
	public double hitungLuas() {
		return Math.PI * radius * radius;
	}
	
	public double hitungKeliling() {
		return Math.PI * 2 * radius;
	}
}

// Interface -> Only allows constants and abstract methods
interface BangunRuang{
	// Abstract method
	public abstract double hitungLuas();
	public abstract double hitungKeliling();	
}

class Silinder implements BangunRuang{
	public double hitungLuas() {
		return 0;
	}

	public double hitungKeliling() {
		return 0;
	}	
}