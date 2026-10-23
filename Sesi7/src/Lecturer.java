
public class Lecturer extends User{
	protected String KdDosen;
	
	public Lecturer() {
		System.out.println("Constructor subclass Lecturer");
	}
	
	public String getKdDosen() {
		return KdDosen;
	}
	public void setKdDosen(String kdDosen) {
		KdDosen = kdDosen;
	}
}
