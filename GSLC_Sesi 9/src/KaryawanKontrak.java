
public class KaryawanKontrak extends Karyawan {
	private final int Rate = 15000;
	private int Jam;
	
	public KaryawanKontrak(String id, String nama, Integer jam) {
		super(id, nama);
		this.Jam = jam;
		hitungGaji();
	}

	@Override
	public void hitungGaji() {
		this.Gaji = Rate * Jam;
	}
}
