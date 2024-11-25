package com.rajvardhan.enitites;

public class Queue {
	int arr[];
	private final int SIZE;
	private int rear;
	private int front;

	public Queue(int size) {
		this.SIZE = size;
		arr = new int[SIZE];
		this.rear = -1;
		this.front = -1;
	}

	public void pushElement(int value) {
		rear++;
		arr[rear] = value;
	}

	public int popElement() {
		front++;
		return arr[front];
	}

	public int peekElement() {
		return arr[front];
	}

	public boolean isFull() {
		return rear == SIZE - 1;
	}

	public boolean isEmpty() {
		return rear == front;
	}
}
