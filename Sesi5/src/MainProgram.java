import packageUser.User;

public class MainProgram {

	public MainProgram() { //deklarasi constructor
		Student mhs1 = new Student(); //code untuk membuat objek, class/templatenya di file Student.java
		mhs1.NIM = "2802512442";
		mhs1.Nama = "Catherine";
		System.out.println("NIM mhs1: " + mhs1.NIM);
		System.out.println("Nama mhs1: " + mhs1.Nama);
		
		User u = new User();
		System.out.println(u.Nama);
		System.out.println(User.Nama);
//		System.out.println(u.Email); error karena package/no access mod
		
		System.out.println("Nilai maksimum Integer: " + Integer.MAX_VALUE); //contoh static, karena tidak perlu bikin new Integer() untuk ambil MAX_VALUE
		
	}

	public static void main(String[] args) {
		new MainProgram(); //untuk panggil constructor

	}

}