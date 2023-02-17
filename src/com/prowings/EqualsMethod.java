package com.prowings;

import java.util.Objects;

public class EqualsMethod {

	int id;
	String name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public EqualsMethod(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "EqualsMethod [id=" + id + ", name=" + name + "]";
	}

	public int hashCode() {
		return Objects.hash(id, name);
	} 

	public boolean equals(Object obj) {
		if (obj == this)
			return true;
		if (obj == null)
			return false;
		if (obj instanceof EqualsMethod) {
			EqualsMethod m1 = (EqualsMethod) obj;
			if (id == m1.id && name.equals(m1.name)) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {

		EqualsMethod obj = new EqualsMethod(10, "Shree");
		EqualsMethod obj1 = new EqualsMethod(10, "Shree");

		System.out.println(obj.equals(obj1));
		System.out.println(obj.hashCode());
		System.out.println(obj1.hashCode());
	}

}
