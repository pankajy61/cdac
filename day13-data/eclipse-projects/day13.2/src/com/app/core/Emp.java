package com.app.core;

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
	public boolean equals(Object o) {
		System.out.println("in emp equals");
		if (o instanceof Emp)
			return this.id == ((Emp) o).id;
		return false;
	}
	//override Object's hashCode as per contract : equal objs MUST produce SAME hash code.
	@Override
	public int hashCode()
	{
		System.out.println("in hashCode");
	//	return 10;
		return id;
		
	}

}
