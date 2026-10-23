package packageUser;

public class Lecturer extends User { //kalo di inherit semua bisa diaccess dari parentnya, kecuali yang private
	public Lecturer() {
		System.out.println(Nama);
		System.out.println(phoneNumber);
//		System.out.println(Password);
	}
}