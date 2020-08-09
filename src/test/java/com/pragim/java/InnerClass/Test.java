package com.pragim.java.InnerClass;

public class Test {

	public static void main(String[] args) {

		Employee employee = new Employee(1);

		System.out.println(employee.hashCode());

		Employee employee2 = new Employee(1);

		System.out.println(employee2.hashCode());
	}

}

class Employee {

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

}
