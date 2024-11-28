package com.sunbeam;

public class LinkedList {
	static class Node{
		private int data;
		private Node next;
		public Node(int value) {
			data = value;
			next = null;
		}
	}
	
	private Node head, tail;
	private int size;
	
	public LinkedList() {
		head = tail = null;
		size = 0;
	}
	
	public boolean isEmpty() {	
		return head == null && tail == null;
	}
	
	public int size() {
		return size;
	}
	
	
	public void addFirst(int value) {
		//0. create a newnode
		Node newnode = new Node(value);
		//1. if list is empty
		if(head == null) {
			//a. add newnode into head and tail
			head = tail = newnode;
			//b. make list circular
			tail.next = head;
			
		}
		//2. if list is not empty
		else {
			//a. add first node into next of newnode
			newnode.next = head;
			//b. add newnode into next of last node
			tail.next = newnode;
			//c. move head on newnode
			head = newnode;
		}
		size++;
	}
	
	public void addLast(int value) {
		//0. create a newnode
		Node newnode = new Node(value);
		//1. if list is empty
		if(head == null) {
			//a. add newnode into head and tail
			head = tail = newnode;
			//b. make list circular
			tail.next = head;
			
		}
		//2. if list is not empty
		else {
			//a. add first node into next of newnode
			newnode.next = head;
			//b. add newnode into next of last node
			tail.next = newnode;
			//c. move tail on newnode
			tail = newnode;
		}
		size++;
	}
	
	public void addPosition(int value, int pos) {
		//1. validate the position
		if(pos < 1 || pos > size+1)
			return;
		//2. create a newnode
		Node newnode = new Node(value);		
		//2. if list is empty
		if(head == null) {
			//a. add newnode into head and tail
			head = tail = newnode;
			//b. make list circular
			tail.next = head;
		}
		//3. if pos is 1
		else if(pos == 1) {
			addFirst(value);
			return;
		}
		//4. if pos is size+1
		else if(pos == size+1) {
			addLast(value);
			return;
		}
		//5. if list is not empty 
		else {
			//a. traverse till pos - 1 node
			Node trav = head;
			for(int i = 1 ; i < pos - 1 ; i++)
				trav = trav.next;
			//b. add pos node into next of newnode
			newnode.next = trav.next;
			//c. add newnode into next of pos-1 node
			trav.next = newnode;
		}
		size++;
	}
	
	public void deleteFirst() {
		//1. if list is empty
		if(head == null)
			return;
		//2. if list has single node
		else if(head == tail)
			head = tail = null;
		//3. if list has multiple nodes
		else {
			//a. add second node into next of last node
			tail.next = head.next;
			//b. move head on second node
			head = head.next;
		}
		size--;
	}
	
	public void deleteLast() {
		//1. if list is empty
		if(head == null)
			return;
		//2. if list has single node
		else if(head == tail)
			head = tail = null;
		//3. if list has multiple nodes
		else {
			//a. traverse till second last node
			Node trav = head;
			while(trav.next.next != head)
				trav = trav.next;
			//b. add first node into next of second last node
			trav.next = head;
			//c. move tail on second last node
			tail = trav;
		}
		size--;
	}
	
	public void deletePosition(int pos) {
		//1. validate the position
		if(pos < 1 || pos > size)
			return;
		//2. if list is empty
		if(head == null)
			return;
		//3. if list has single node
		else if(head == tail)
			head = tail = null;
		//4. if list has multiple nodes
		else {
			// if pos = 1
			if(pos == 1) {
				deleteFirst();
				return;
			}
			// if pos = size
			else if(pos == size) {
				deleteLast();
				return;
			}
			else {
				//a. traverse till pos-1 node
				Node trav = head;
				for(int i = 1 ; i < pos-1 ; i++)
					trav = trav.next;
				//b. add pos+1 node into next of pos-1 node
				trav.next = trav.next.next;
			}
		}
		size--;
	}
	
	public void display() {
		//1. if list is empty
		if(head == null)
			return;
		System.out.print("List :: ");
		//2. create trav and start at first node
		Node trav = head;
		do {
			//3. print current node
			System.out.print(" " + trav.data);
			//4. go on next node
			trav = trav.next;
		}while(trav != head);// 5. repeat till last node
		System.out.println();
	}
	
	public void deleteAll() {
		head = tail = null;
		size = 0;
	}
	
	
	
	
	
}












