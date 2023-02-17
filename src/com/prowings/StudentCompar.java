package com.prowings;

import java.util.Objects;

public class StudentCompar implements Comparable<StudentCompar> {
	Integer roll;
	String name;

	public StudentCompar(int roll, String name) {
		super();
		this.roll = roll;
		this.name = name;
	}

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "StudentCompar [roll=" + roll + ", name=" + name + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, roll);
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (obj instanceof StudentCompar) {
			StudentCompar std = (StudentCompar) obj;
			if (roll == std.roll && name.equals(std.name)) {
				return true;
			}
		}
		return false;
	}

//	public int compareTo(StudentCompar o) {
//		if (this.roll == o.roll)
//			return 0;
//		else if (this.roll > o.roll)
//			return 1;
//		else
//			return -1;
//	}

	public int compareTo(StudentCompar obj) {
		
		return this.name.compareTo(obj.name);
	}

}
