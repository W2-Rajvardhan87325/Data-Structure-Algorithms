package com.sunbeam;

public class SinglyCircularLinkedListMain {

	public static void main(String[] args) {
		
		LinkedList l = new LinkedList();
		
		l.addFirst(40);
		l.addFirst(30);
		l.addFirst(20);
		l.addFirst(10);
		
		//l.addLast(50);
		//l.addLast(60);
		
		//l.addPosition(100, 1);
		//l.addPosition(100, 5);
		//l.addPosition(100, 3);
		//l.addPosition(100, -1);
		//l.addPosition(100, 100);
		
		//l.deleteFirst();
		//l.deleteLast();
		
		//l.deletePosition(3);
		//l.deletePosition(1);
		//l.deletePosition(4);
		//l.deletePosition(-1);
		l.deletePosition(10);
		
		l.display();
		System.out.println("List size : " + l.size());
		
		l.deleteAll();

	}

}










