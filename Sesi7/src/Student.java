
public class Student extends User{
	protected String NIM;
	// 2 constructor	
	public Student() {
		super(); // memanggil constructor parent tanpa parameter
		System.out.println("Constructor 1 subclass Student");
	}
	public Student(String username, String password, String NIM) {
		super(username, password); // memanggil constructor parent dg parameter
		this.NIM = NIM;
		System.out.println("Constructor 2 subclass Student");
		login();	
		super.login();
	}
	
	//override method
	public void login() {
		System.out.println("Student login");
	}

	public String getNIM() {
		return NIM;
	}
	public void setNIM(String nIM) {
		NIM = nIM;
	}
}
