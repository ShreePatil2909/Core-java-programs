package com.prowings;

import java.util.ArrayList;
import java.util.TreeSet;

public class CustomSorting {

	public static void main(String[] args) {

		StudentCompar s1=new StudentCompar(10, "Shree");
		StudentCompar s2 = new StudentCompar(20, "Krishna");
		StudentCompar s3 = new StudentCompar(30, "Komal");
		StudentCompar s4 = new StudentCompar(40, "Sayali");
		StudentCompar s5 = new StudentCompar(50, "Zamdh");
		
		SortById id=new SortById();
		
		TreeSet ts=new TreeSet(id);
		ts.add(s3);
		ts.add(s1);
		ts.add(s4);
		ts.add(s5);
		ts.add(s2);
		
//		System.out.println(ts.higher(ts.first())); 
		
//		ArrayList al=new ArrayList();
//		al.addAll(ts);
//		System.out.println(al.get(al.size()-2));
		
		
	}

}
