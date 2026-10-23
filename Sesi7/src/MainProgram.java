
public class MainProgram {

	public MainProgram() {
		Student s = new Student("Andi","123asd","123456");
//		s.setUsername("Andi");
//		s.setPassword("123asd");
//		s.setNIM("123456");
//		s.login();
		
		System.out.println("Username : " + s.getUsername());
		System.out.println("Password : " + s.getPassword());
		System.out.println("NIM      : " + s.getNIM());
	}

	public static void main(String[] args) {
		new MainProgram();
	}

}
