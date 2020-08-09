package com.pragim.java.datastructure;

import java.util.ArrayList;
import java.util.List;

class Student {

	int id;

	String name;

	public Student(int id, String name) {

		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}

}

public class Test {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<Integer>();
		
		list.add(10);
		list.add(20);
		list.add(30);
		
		System.out.println(list);
		
		Object[] array = list.toArray();
		
		for(Object i : array)
		System.out.println(i);
		
		List<String> l1 = new ArrayList<String>();
		l1.add("Mohan");
		l1.add("Sai");
		l1.add("Naidu");
		
		l1.add(2, "kumar");
		System.out.println(l1);
		l1.addAll(3, list);
		
		
	
	}

}
