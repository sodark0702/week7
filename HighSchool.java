package OOP;

import java.util.ArrayList;

public class HighSchool {
	private ArrayList<People> list;

	public HighSchool() {
		super();
		list = new ArrayList<People>();
	}

	public ArrayList<People> getList() {
		return list;
	}

	public void setList(ArrayList<People> list) {
		this.list = list;
	}

	public void addPeople(People p) {
		if (!list.contains(p)) {
			list.add(p);
		}
	}

	public void printStudent() {
		System.out.println("Ten" + "\t" + "Nam Sinh");
		for (People people : list) {
			if ((people != null) && (people instanceof Student)) {
				System.out.println(people.toString());
			}
		}
	}

	public void printEmployee() {
		System.out.println("Ten" + "\t" + "Nam Sinh");
		for (People people : list) {
			if ((people != null) && (people instanceof Employee)) {
				System.out.println(people.toString());
			}
		}
	}

	public void printEmployeeSalary() {
		System.out.println("Ten" + "\t" + "Nam Sinh" + "\t" + "Luong");
		for (People people : list) {
			if ((people != null) && (people instanceof Employee)) {
				System.out.println(people.getName() + "\t" + people.getBirth() + "\t\t" + people.isEmployee(people));
			}
		}
	}

	public void calculation() {
		System.out.println("Ten" + "\t" + "Nam Sinh" + "\t" + "Luong Thuc Lanh");
		for (People people : list) {
			if ((people != null) && (people instanceof Employee)) {
				if (people instanceof ManageEmployee) {
					System.out.println(people.getName() + "\t" + people.getBirth() + "\t\t"
							+ (people.isEmployee(people) + people.isManageEmployee(people)));
				} else {
					if (people instanceof Teacher) {
						System.out.println(people.getName() + "\t" + people.getBirth() + "\t\t"
								+ (people.isEmployee(people) + people.isTeacher(people)));
					}
				}
			}
		}
	}

	public void maxSalary() {
		String tempName = "";
		int tempBirth = 0;
		double maxSalary = 0.0;
		System.out.println("Ten" + "\t" + "Nam Sinh" + "\t" + "Luong");
		for (People people : list) {
			if ((people != null) && (people instanceof Employee)) {
				if (people.isEmployee(people) > maxSalary) {
					maxSalary = people.isEmployee(people);
					tempName = people.getName();
					tempBirth = people.getBirth();
				}
			}
		}
		System.out.println(tempName + "\t" + tempBirth + "\t\t" + maxSalary);
	}

	public void isStudent() {
		System.out.println("Ten" + "\t" + "Nam Sinh");
		for (People people : list) {
			if ((people != null) && (people instanceof Student)) {
				System.out.println(people.getName() + "\t" + people.getBirth() + "\tla sinh vien");
			} else {
				System.out.println(people.getName() + "\t" + people.getBirth() + "\tla cmm");
			}
		}
	}
	
	public void printAll() {
		System.out.println("Ten" + "\t" + "Nam Sinh");
		for (People people : list) {
			if (people != null) {
				System.out.println(people.toString());
			}
		}
	}

	public static void main(String[] args) {
		People p1 = new Student("An", 2005, 5.5f, 6.0f, 8.0f);
		People p2 = new Student("Mai", 2004, 8.8f, 9.0f, 8.0f);
		People p3 = new Student("Hoa", 2003, 7.5f, 6.0f, 10.0f);
		People p4 = new Employee("Anh", 1990, 60.5, new Date(4, 5, 2024), new PhongBan("001", "Ban CNTT"));
		People p5 = new HighEmployee("Linh", 1989, 70.0, new Date(12, 1, 2020), new PhongBan("002", "Ban Ke Toan"),
				"Thac Si", "Ke Toan", "DH Nong Lam");
		People p6 = new ManageEmployee("Binh", 1980, 66.8, new Date(2, 10, 2021), new PhongBan("003", "Ban CNTP"),
				"Tien Si", "CNTP", "DH Nong Lam", 25.0);
		People p7 = new Teacher("Phong", 1978, 45.8, new Date(2, 11, 2021), new PhongBan("004", "Ban Quan Li"),
				"Tien Si", "Quan Li", "DH Nong Lam", 25.0);
		HighSchool hg = new HighSchool();
		hg.addPeople(p1);
		hg.addPeople(p2);
		hg.addPeople(p3);
		hg.addPeople(p4);
		hg.addPeople(p5);
		hg.addPeople(p6);
		hg.addPeople(p7);
		System.out.println("===Danh Sach Cua Truong Dai Hoc===");
		hg.printAll();
		System.out.println("===Danh Sach Sinh Vien===");
		hg.printStudent();
		System.out.println("===Danh Sach Nhan Vien===");
		hg.printEmployee();
		System.out.println("===Danh Sach Luong Nhan Vien===");
		hg.printEmployeeSalary();
		System.out.println("===Danh Sach Luong Thuc Lanh Nhan Vien===");
		hg.calculation();
		System.out.println("===Nhan Vien Luong Cao Nhat===");
		hg.maxSalary();
		System.out.println("===Check Sinh Vien===");
		hg.isStudent();
	}

}
