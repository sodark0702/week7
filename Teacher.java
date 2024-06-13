package OOP;

public class Teacher extends HighEmployee{
	private double thulaoGG;
	public Teacher(String name, int birth, double salary, Date acceptDay, PhongBan ban, String level, String major,
			String noiDaoTao, double thulaoGG) {
		super(name, birth, salary, acceptDay, ban, level, major, noiDaoTao);
		this.thulaoGG = thulaoGG;
	}
	public double getThulaoGG() {
		return thulaoGG;
	}
	public void setThulaoGG(double thulaoGG) {
		this.thulaoGG = thulaoGG;
	}
	@Override
	public String toString() {
		return super.toString() + ", " + thulaoGG + "]";
	}
	

}
