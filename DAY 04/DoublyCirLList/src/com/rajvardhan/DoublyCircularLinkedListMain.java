package com.sunbeam;

public class DoublyCircularLinkedListMain {

	public static void main(String[] args) {
		
		LinkedList l = new LinkedList();
		
		l.addFirst(40);
		l.addFirst(30);
		l.addFirst(20);
		l.addFirst(10);
		
		l.addLast(50);
		l.addLast(60);
		
		//l.deleteFirst();
		//l.deleteLast();
		
		//l.addPosition(100, 3);
		l.deletePosition(3);
		
		l.fDisplay();
		l.rDisplay();

	}

}
