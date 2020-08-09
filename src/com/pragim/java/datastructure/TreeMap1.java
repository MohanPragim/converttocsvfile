package com.pragim.java.datastructure;

import java.util.TreeMap;

class Employee implements Comparable {

	int id;

	public Employee(int id) {

		this.id = id;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (id != other.id)
			return false;
		return true;
	}


	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

}

public class TreeMap1 {

	public static void main(String[] args) {

		Employee e1 = new Employee(10);
		Employee e2 = new Employee(20);

	}
}
