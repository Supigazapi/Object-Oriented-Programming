
public class KaryawanTetap extends Karyawan {
	private String Jabatan;
	
	public KaryawanTetap(String id, String nama, String jabatan) {
		super(id, nama);
		this.Jabatan = jabatan;
		hitungGaji();
	}

	@Override
	public void hitungGaji() {
		switch(Jabatan.toLowerCase()) {
			case "staff": 
				this.Gaji = 3500000;
				break;
			case "supervisor":
				this.Gaji = 7000000;
				break;
			case "manager":
				this.Gaji = 15000000;
				break;
		}
	}
}
