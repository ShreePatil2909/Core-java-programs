package com.prowings;

import java.util.Comparator;

public class SortById implements Comparator<StudentCompar> {

	@Override
	public int compare(StudentCompar o1, StudentCompar o2) {
		return o1.roll.compareTo(o2.roll);
	}

}
