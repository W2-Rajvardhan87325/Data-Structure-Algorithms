package com.rajvardhan;

public class CircularLinkedList {
    static class Node {
        private int data;
        private Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node tail; // Only tail pointer is used
    private int size;

    public CircularLinkedList() {
        this.tail = null;
        this.size = 0;
    }

    public boolean isEmpty() {
        return tail == null;
    }

    public int size() {
        return size;
    }

    // Add node at the beginning
    public void addFirst(int value) {
        Node newNode = new Node(value);
        if (isEmpty()) {
            tail = newNode;
            tail.next = tail; // Circular reference
        } else {
            newNode.next = tail.next;
            tail.next = newNode;
        }
        size++;
    }

    // Add node at the end
    public void addLast(int value) {
        Node newNode = new Node(value);
        if (isEmpty()) {
            tail = newNode;
            tail.next = tail; // Circular reference
        } else {
            newNode.next = tail.next;
            tail.next = newNode;
            tail = newNode; // Update tail to the new node
        }
        size++;
    }

    // Add node at a specific position
    public void addAtPosition(int value, int position) {
        if (position < 1 || position > size + 1) {
            System.out.println("Invalid position");
            return;
        }
        if (position == 1) {
            addFirst(value);
        } else if (position == size + 1) {
            addLast(value);
        } else {
            Node newNode = new Node(value);
            Node current = tail.next; // Start at head
            for (int i = 1; i < position - 1; i++) {
                current = current.next;
            }
            newNode.next = current.next;
            current.next = newNode;
            size++;
        }
    }

    // Delete the first node
    public void deleteFirst() {
        if (isEmpty()) {
            System.out.println("List is empty");
            return;
        }
        if (tail.next == tail) { // Single node case
            tail = null;
        } else {
            tail.next = tail.next.next; // Skip the first node
        }
        size--;
    }

    // Delete the last node
    public void deleteLast() {
        if (isEmpty()) {
            System.out.println("List is empty");
            return;
        }
        if (tail.next == tail) { // Single node case
            tail = null;
        } else {
            Node current = tail.next; // Start at head
            while (current.next != tail) {
                current = current.next;
            }
            current.next = tail.next; // Skip the last node
            tail = current; // Update tail to the second-last node
        }
        size--;
    }

    // Delete a node at a specific position
    public void deleteAtPosition(int position) {
        if (position < 1 || position > size) {
            System.out.println("Invalid position");
            return;
        }
        if (position == 1) {
            deleteFirst();
        } else {
            Node current = tail.next; // Start at head
            for (int i = 1; i < position - 1; i++) {
                current = current.next;
            }
            current.next = current.next.next;
            if (position == size) { // If deleting the last node, update tail
                tail = current;
            }
            size--;
        }
    }

    // Display the list
    public void display() {
        if (isEmpty()) {
            System.out.println("List is empty");
            return;
        }
        Node current = tail.next; // Start at head
        System.out.print("List: ");
        do {
            System.out.print(current.data + " ");
            current = current.next;
        } while (current != tail.next);
        System.out.println();
    }

    public void deleteAll() {
        tail = null;
        size = 0;
    }
}
