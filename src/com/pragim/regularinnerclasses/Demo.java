package com.pragim.regularinnerclasses;

public class Demo {

	class Inner {

		public void m1() {

			System.out.println("Inside the inner class!!!");
		}

	}

	public static void main(String[] args) {

		Demo demo = new Demo();

		Inner inner = demo.new Inner();

		inner.m1();
	}
}
