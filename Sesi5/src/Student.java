
public class Student {
	//3 atribut di dalam class Student
	public String NIM;
//	public final String NIM;//kalau pakai final berarti tidak bisa diubah lagi valuenya
	public String Nama;
	private String Pass = "Secret";
	
	//constructor = method yang dijalankan pertama kali setiap object dibuat
	//kalau kita ga buat constructor, java bakal automatically bikin, jadi ketika dipakai ga error
	// constructor v
	public Student() {
		System.out.println("Constructor Student dijalankan");
	}
	
	//3 method
	public void takeAttendance() {
		System.out.println("Student take attendance");
	}
	public void postForum() {
		System.out.println("Student post forum");
	}
	public void aksesMateri() {
		System.out.println("Student akses materi");
	}
}