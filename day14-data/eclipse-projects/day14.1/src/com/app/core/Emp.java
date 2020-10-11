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
	

	public Emp(int id, String deptId) {
		super();
		this.id = id;
		this.deptId = deptId;
	}


	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + ", deptId=" + deptId + ", salary=" + salary + "]";
	}

	@Override
	public int hashCode() {
		System.out.println("in hashCode");
		final int prime = 31;
		int result = 1;
		result = prime * result + ((deptId == null) ? 0 : deptId.hashCode());
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("in equals");
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Emp other = (Emp) obj;
		if (deptId == null) {
			if (other.deptId != null)
				return false;
		} else if (!deptId.equals(other.deptId))
			return false;
		if (id != other.id)
			return false;
		return true;
	}

	/*
	 * @Override public boolean equals(Object o) {
	 * System.out.println("in emp equals"); if (o instanceof Emp) { Emp e=(Emp)o;
	 * return this.id == e.id && this.deptId.equals(e.deptId); } return false; }
	 * //override Object's hashCode as per contract : equal objs MUST produce SAME
	 * hash code.
	 * 
	 * @Override public int hashCode() { System.out.println("in hashCode"); //
	 * return 10; return id * deptId.hashCode();
	 * 
	 * }
	 */
	

}
