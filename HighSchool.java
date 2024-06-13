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
	public void printAll() {
		for (People people : list) {
			if (people != null) {
				System.out.println(people.toString());
			}
		}
	}
	public static void main(String[] args) {
		People p1 = new Student("An", 2005, 5.5f, 6.0f, 8.0f);
		People p2 = new Employee("Anh", 1990, 60.5, new Date(4, 5, 2024), new PhongBan("001", "Ban CNTT"));
		People p3 = new HighEmployee("Linh", 1989, 70.0, new Date(12, 1, 2020), new PhongBan("002", "Ban Ke Toan"), "Thac Si", "Ke Toan", "DH Nong Lam");
		People p4 = new ManageEmployee("Binh", 1980, 66.8, new Date(2, 10, 2021), new PhongBan("003", "Ban CNTP"), "Tien Si", "CNTP", "DH Nong Lam", 25.0);
		People p5 = new Teacher("Phong", 1978, 45.8, new Date(2, 11, 2021), new PhongBan("004", "Ban Quan Li"), "Tien Si", "Quan Li", "DH Nong Lam", 25.0);
		HighSchool hg = new HighSchool();
		hg.addPeople(p1);
		hg.addPeople(p2);
		hg.addPeople(p3);
		hg.addPeople(p4);
		hg.addPeople(p5);
		hg.printAll();
	}

}
