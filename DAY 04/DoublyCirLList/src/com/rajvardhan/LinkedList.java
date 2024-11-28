package com.sunbeam;

import com.sunbeam.LinkedList.Node;

public class LinkedList {
	static class Node{
		private int data;
		private Node next, prev;
		public Node(int value) {
			data = value;
			next = prev = null;
		}
	}

	private Node head;
	private int size;
	
	public LinkedList() {
		head = null;
		size = 0;
	}
	
	public boolean isEmpty() {
		return head == null;
	}
	
	public int size() {
		return size;
	}
	
	public void addFirst(int value) {
		//1. create node
		Node nn = new Node(value);
		//2. if list is empty
		if(head == null) {
			//a. add newnode into head
			head = nn;
			//b. make list circular
			nn.next = nn.prev = nn;
		}
		//3. if list is not empty
		else {
			//a. add first node into next of newnode
			nn.next = head;
			//b. add last node into prev of newnode
			nn.prev = head.prev;
			//c. add newnode into next of last node
			head.prev.next = nn;
			//d. add newnode into prev of first node
			head.prev = nn;
			//e. move head on newnode
			head = nn;
		}
		size++;
	}
	
	public void addLast(int value) {
		//1. create node
		Node nn = new Node(value);
		//2. if list is empty
		if(head == null) {
			//a. add newnode into head
			head = nn;
			//b. make list circular
			nn.next = nn.prev = nn;
		}
		//3. if list is not empty
		else {
			//a. add first node into next of newnode
			nn.next = head;
			//b. add last node into prev of newnode
			nn.prev = head.prev;
			//c. add newnode into next of last node
			head.prev.next = nn;
			//d. add newnode into prev of first node
			head.prev = nn;
		}
		size++;
	}
	
	public void addPosition(int value, int pos) {
		// special case 
			// TO DO
		//1. create node
		Node newnode = new Node(value);
		//2. if list is empty
		if(head == null) {
			head = newnode;
			newnode.next = newnode.prev = newnode;
		}
		//3. if list is not empty
		else {
			//a.traverse till pos -1 node
			Node trav = head;
			for(int i = 1 ; i < pos-1 ; i++)
				trav = trav.next;
			//b. add pos node into next of newnode
			newnode.next = trav.next;
			//c. add pos-1 node into prev of newnode
			newnode.prev = trav;
			//d. add newnode into prev of pos node
			trav.next.prev = newnode;
			//e. add newnode into next of pos-1 node
			trav.next = newnode;
		}
		size++;
	}
	
	public void deleteFirst() {
		//1. if list is empty
		if(head == null)
			return;
		//2. if list has single node
		else if(head.next == head)
			head = null;
		//3. if  list has multiple nodes
		else {
			//a. add second node into next of last node
			head.prev.next = head.next;
			//b. add last node into prev of second node
			head.next.prev = head.prev;
			//c. move head on second node
			head = head.next;
		}
		size--;
	}
	
	public void deleteLast() {
		//1. if list is empty
		if(head == null)
			return;
		//2. if list has single node
		else if(head.next == head)
			head = null;
		//3. if  list has multiple nodes
		else {
			//a. add second last node into prev of first node
			head.prev = head.prev.prev;
			//b. add first node into next of second last node
			head.prev.next = head;
		}
		size--;
	}
	
	public void deletePosition(int pos) {
		// special case
			// TO DO
		//1. if list is empty
		if(head == null)
			return;
		//2. if list has single node
		else if(head.next == head)
			head = null;
		//3. if list has multiple nodes
		else {
			//a. traverse till pos node
			Node trav = head;
			for(int i = 1 ; i < pos ; i++)
				trav = trav.next;
			//b. add pos + 1 node into next of pos - 1 node
			trav.prev.next = trav.next;
			//c. add pos - 1 node into prev of pos + 1 node
			trav.next.prev = trav.prev;
		}
		size--;
	}
	
	public void fDisplay() {
		//0. if list is empty
		if(head == null)
			return;
		System.out.print("Forward List : ");
		//1. create trav and start at first node
		Node trav = head;
		do {
			//2. print current node
			System.out.print(" " + trav.data);
			//3. go on next node
			trav = trav.next;
		}while(trav != head);	// 4. repeat step 2 and 3 till last node
		System.out.println();
	}
	
	public void rDisplay() {
		//0. if list is empty
		if(head == null)
			return;
		System.out.print("Backward List : ");
		//1. create trav and start at last node
		Node trav = head.prev;
		do {
			//2. print current node
			System.out.print(" " + trav.data);
			//3. go on prev node
			trav = trav.prev;
		}while(trav != head.prev);	// 4. repeat step 2 and 3 till first node node
		System.out.println();
	}
	
	public void deleteAll() {
		head = null;
		size = 0;
	}
}














