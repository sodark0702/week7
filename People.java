package OOP;

public class People {
	private String name;
	private int birth;

	public People(String name, int birth) {
		super();
		this.name = name;
		this.birth = birth;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBirth() {
		return birth;
	}

	public void setBirth(int birth) {
		this.birth = birth;
	}

	public double isEmployee(People p) {
		double s = 0;
		if (p instanceof Employee) {
			s = ((Employee) p).getSalary();
		}
		return s;
	}
	public double isManageEmployee(People p) {
		double s = 0;
		if (p instanceof ManageEmployee) {
			s = ((ManageEmployee) p).getPhucapChucVu();
		}
		return s;
	}
	public double isTeacher(People p) {
		double s = 0;
		if (p instanceof Teacher) {
			s = ((Teacher) p).getThulaoGG();
		}
		return s;
	}

	@Override
	public String toString() {
		return name + "\t" + birth;
	}

}
