package com.prowings;

import java.util.TreeSet;

public class TestComparable {

	public static void main(String[] args) {

		StudentCompar s1 = new StudentCompar(10, "Shree");
		StudentCompar s2 = new StudentCompar(20, "Krishna");
		StudentCompar s3 = new StudentCompar(30, "Komal");
		StudentCompar s4 = new StudentCompar(40, "Sayali");
		StudentCompar s5 = new StudentCompar(50, "Zamdh");
		
		TreeSet ts=new TreeSet();
		ts.add(s3);
		ts.add(s2);
		ts.add(s4);
		ts.add(s5);
		ts.add(s1);

		System.out.println(ts);
	}

}
