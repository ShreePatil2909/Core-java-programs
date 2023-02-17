package com.prowings;

public class DeepCloning implements Cloneable {

	Student std;
	int id;
	String city;

	public DeepCloning(Student std, int id, String city) {
		super();
		this.std = std;
		this.id = id;
		this.city = city;
	}

	@Override
	public String toString() {
		return "DeepCloning [std=" + std + ", id=" + id + ", name=" + city + "]";
	}

	protected Object clone() {
		Student s1 = new Student(std.roll, std.name);
		DeepCloning dc = new DeepCloning(s1, id, city);
		return dc;
	}

	public static void main(String[] args) throws CloneNotSupportedException {

		Student s1 = new Student(10, "Shree");
		DeepCloning dc = new DeepCloning(s1, 1, "Pune");
		System.out.println("Before " + dc);
		DeepCloning dc1 = (DeepCloning) dc.clone();
		System.out.println("Clone " + dc1);
		dc1.std.roll = 105;
		System.out.println(dc);
		System.out.println(dc1);
	}

}
