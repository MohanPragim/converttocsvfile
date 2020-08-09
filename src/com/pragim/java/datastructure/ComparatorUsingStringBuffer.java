package com.pragim.java.datastructure;

import java.util.TreeSet;

public class ComparatorUsingStringBuffer implements Comparable<>{

	public static void main(String[] args) {

		TreeSet<StringBuffer> t1 = new TreeSet<StringBuffer>();

		t1.add(new StringBuffer("z"));
		t1.add(new StringBuffer("A"));
		t1.add(new StringBuffer("k"));
		
		System.out.println(t1);

	}
}
