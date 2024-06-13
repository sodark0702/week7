package OOP;

public class HighEmployee extends Employee {
	private String level, major, noiDaoTao;

	public HighEmployee(String name, int birth, double salary, Date acceptDay, PhongBan ban, String level, String major,
			String noiDaoTao) {
		super(name, birth, salary, acceptDay, ban);
		this.level = level;
		this.major = major;
		this.noiDaoTao = noiDaoTao;
	}

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public String getNoiDaoTao() {
		return noiDaoTao;
	}

	public void setNoiDaoTao(String noiDaoTao) {
		this.noiDaoTao = noiDaoTao;
	}

	@Override
	public String toString() {
		return super.toString() + " " + level + ", " + major + ", " + noiDaoTao;
	}

}
