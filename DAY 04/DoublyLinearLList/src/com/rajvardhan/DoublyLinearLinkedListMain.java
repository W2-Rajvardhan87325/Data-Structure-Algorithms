package com.sunbeam;

public class DoublyLinearLinkedListMain {

	public static void main(String[] args) {
		
		LinkedList l1 = new LinkedList();
		
		l1.addFirst(40);
		l1.addFirst(30);
		l1.addFirst(20);
		
		l1.addLast(50);
		
		//l1.addPosition(100, 3);
		
		//l1.deleteFirst();
		//l1.deleteLast();
		
		l1.deletePosition(3);
		
		l1.forwardDisplay();
		l1.backwardDisplay();

	}

}
