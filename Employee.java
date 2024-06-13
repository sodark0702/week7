package OOP;

public class Employee extends People {
	private double salary;
	private Date acceptDay;
	private PhongBan ban;

	public Employee(String name, int birth, double salary, Date acceptDay, PhongBan ban) {
		super(name, birth);
		this.salary = salary;
		this.acceptDay = acceptDay;
		this.ban = ban;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Date getAcceptDay() {
		return acceptDay;
	}

	public void setAcceptDay(Date acceptDay) {
		this.acceptDay = acceptDay;
	}

	public PhongBan getBan() {
		return ban;
	}

	public void setBan(PhongBan ban) {
		this.ban = ban;
	}

	@Override
	public String toString() {
		return super.toString() + " " + salary + ", " + acceptDay.toString() + ", " + ban.toString();
	}

}
