package com.prowings;

final class ImmutableClass {

	private final int s;
	private final String city;
	private final Employee emp;

	public int getS() {
		return s;
	}

	public ImmutableClass(int s, String city, Employee emp) {
		super();
		this.s = s;
		this.city = city;
		Employee e1 = new Employee(emp.getId(), emp.getName());
		this.emp = e1;
	}

	public String getCity() {
		return city;
	}

	public Employee getEmp() {
		Employee e1 = new Employee(emp.getId(), emp.getName());
		return e1;
	}

	@Override
	public String toString() {
		return "ImmutableClass [s=" + s + ", city=" + city + ", emp=" + emp + "]";
	}

	public static void main(String[] args) {

		Employee e1 = new Employee(10, "Shree");
		ImmutableClass ic = new ImmutableClass(1, "Pune", e1);
		System.out.println("Before :" + ic);
		ic.getEmp().setId(20);
		ic.getEmp().setName("Ram");
		System.out.println("After :" + ic);

	}

}
