
public abstract class Karyawan {
	protected String ID;
	protected String Nama;
	protected Integer Gaji;

	public abstract void hitungGaji();

	public Karyawan(String id, String nama) {
		ID = id;
		Nama = nama;
	}

	public String getID() {
		return ID;
	}

	public String getNama() {
		return Nama;
	}

	public Integer getGaji() {
		return Gaji;
	}
}
