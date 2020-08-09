package com.pragim.regularinnerclasses;

public class Loop {

	public static void main(String[] args) {

		m1();
		m2();

	}

	public static void m1() {

		for (int i = 1; i <= 10; i++) {

			System.out.println(i);
			if (i == 3) {
				return;
			}
		}
	}

	public static void m2() {

		System.out.println("Hello");
	}
}
