package com.pragim.java.datastructure;

class Display {

	public synchronized void wish(String name) {

		for (int i = 0; i < 10; i++) {

			System.out.println("Good Morning");
			try {

				Thread.sleep(1000);
			} catch (Exception e) {
				// TODO: handle exception
			}
			System.out.println(name);
		}
	}
}

class MyThread extends Thread {

	Display d;
	String name;

	public MyThread(Display d, String name) {

		this.d = d;
		this.name = name;
	}

	public void run() {

		d.wish(name);
	}
}

public class SynchronizedDemo {

	public static void main(String[] args) {

		Display d1 = new Display();
		Display d2 = new Display();

		MyThread m1 = new MyThread(d1, "Mohan");
		MyThread m2 = new MyThread(d2, "Dhoni");

		m1.start();
		m2.start();
	}
}
