package com.pragim.java.datastructure;

class MyLinkedList {

	Node head;

	public void add(MyLinkedList list, int data) {

		Node node = new Node();

		node.data = data;
		node.next = null;

		if (list.head == null) {

			head = node;
		} else {

			Node last = list.head;
			while (last.next != null) {

				last = last.next;

			}

			last.next = node;
		}

	}

	public void display(MyLinkedList list) {

		if (list.head == null) {

			System.out.println("0");
		} else {

			Node last = list.head;
			while (last.next != null) {

				System.out.println(last.data);
				last = last.next;
			}

			System.out.println(last.data);
		}
	}
}

public class LinkedList {

	public static void main(String[] args) {

		MyLinkedList list = new MyLinkedList();

		list.add(list, 10);
		list.add(list, 20);
		list.add(list, 30);

		list.display(list);
	}
}
