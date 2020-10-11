package test_equals;

public class Emp {
	private int id;
	private String name, deptId;
	private double salary;

	public Emp(int id, String name, String deptId, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.deptId = deptId;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + ", deptId=" + deptId + ", salary=" + salary + "]";
	}

	@Override
	// overriding from of equals : emp's id
	public boolean equals(Object o) {
		System.out.println("in emp equals ");
		if (o instanceof Emp)
			return this.id == ((Emp) o).id;
		return false;
	}
}
