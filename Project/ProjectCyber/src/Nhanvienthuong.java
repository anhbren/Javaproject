
public class Nhanvienthuong extends Nhanvien {
	final int LUONG_GIO = 200;
	final int PHU_CAP_1 = 300;
	final int PHU_CAP_2 = 1000;
	final int GIO_TASK_VUOT = 35;

	@Override
	public void Xuat() {
		// TODO Auto-generated method stub
		super.Xuat();
	}

	private String poSiTion;

	public String getPoSiTion() {
		return poSiTion;
	}

	public void setPoSiTion(String poSiTion) {
		this.poSiTion = poSiTion;
	}

	public Nhanvienthuong(String maNV, String tenNV, int namSinh, String email, String soDT, String maPB,
			String string, float gioLam) {
		super(maNV, tenNV, namSinh, email, soDT, maPB);
		poSiTion = string;
		this.setGioLam(gioLam);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void tinhLuong() {
		float luong = this.getGioLam() * LUONG_GIO + PHU_CAP_1;
		if (this.getSoGioTask() > GIO_TASK_VUOT) {
			luong += PHU_CAP_2;
		}
		this.luong = luong;

	}

}
