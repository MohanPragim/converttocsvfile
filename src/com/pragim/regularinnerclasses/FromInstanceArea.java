package com.pragim.regularinnerclasses;

public class FromInstanceArea {

	int x = 10;

	class Inner {

		int x = 100;

		public void m1() {

			int x = 1000;

			System.out.println("Inside the inner class");

			System.out.println(x);
			System.out.println(this.x);
			System.out.println(FromInstanceArea.this.x);
		}

	}

	public void m2() {

		Inner inner = new Inner();
		inner.m1();
	}

	public static void main(String[] args) {

		FromInstanceArea fromInstanceArea = new FromInstanceArea();
		fromInstanceArea.m2();
	}
}
