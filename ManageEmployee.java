package OOP;

public class ManageEmployee extends HighEmployee {
	private double phucapChucVu;

	public ManageEmployee(String name, int birth, double salary, Date acceptDay, PhongBan ban, String level,
			String major, String noiDaoTao, double phucapChucVu) {
		super(name, birth, salary, acceptDay, ban, level, major, noiDaoTao);
		this.phucapChucVu = phucapChucVu;
	}

	public double getPhucapChucVu() {
		return phucapChucVu;
	}

	public void setPhucapChucVu(double phucapChucVu) {
		this.phucapChucVu = phucapChucVu;
	}

	@Override
	public String toString() {
		return super.toString() + ", " + phucapChucVu;
	}

}
