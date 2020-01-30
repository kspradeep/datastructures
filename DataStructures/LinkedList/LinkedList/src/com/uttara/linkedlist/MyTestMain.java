package com.uttara.linkedlist;

public class MyTestMain {
	public static void main(String[] args) {
		
		LinkedList ls = new LinkedList();
		ls.insert(1);
		ls.insert(2);
		ls.insert(3);
		ls.insert(4);
		ls.insert(5);
		ls.insert(6);
		ls.traverse();
		System.out.println("middele "+ls.getMiddle().getData());
	}
}
