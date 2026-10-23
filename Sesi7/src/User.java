
public class User {
	protected String username;
	protected String password;
	
	//2 constructor
	public User() {
		System.out.println("Constructor 1 superclass User");
	}	
	public User(String username, String password) {
		System.out.println("Constructor 2 superclass User");
		this.username = username;
		this.password = password;
	}
	public void login() {
		System.out.println("User login");
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
