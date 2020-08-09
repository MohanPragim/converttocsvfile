package com.pragim.java.datastructure;

import java.util.Comparator;
import java.util.TreeSet;

public class MyComparator implements Comparator<Integer> {

	public static void main(String[] args) {

		TreeSet<Integer> t1 = new TreeSet<Integer>(new MyComparator());
		t1.add(20);
		t1.add(0);
		t1.add(15);
		t1.add(5);
		t1.add(10);
		
		System.out.println(t1);
	}

	@Override
	public int compare(Integer obj1, Integer obj2) {

		return 0;
	}
}
