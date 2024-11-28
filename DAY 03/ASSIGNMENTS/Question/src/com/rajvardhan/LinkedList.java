package com.rajvardhan;
public class LinkedList {
    static class Node {
        private int data;
        private Node next;

        public Node(int value) {
            data = value;
            next = null;
        }
    }

    private Node head;
    private Node tail;

    public LinkedList() {
        head = null;
        tail = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(int value) {
        Node newnode = new Node(value);
        if (isEmpty()) {
            head = tail = newnode;
        } else {
            newnode.next = head;
            head = newnode;
        }
    }

    public void addLast(int value) {
        Node newnode = new Node(value);
        if (isEmpty()) {
            head = tail = newnode;
        } else {
            tail.next = newnode;
            tail = newnode;
        }
    }

    public void insertAfter(int afterValue, int newValue) {
        Node trav = head;
        while (trav != null && trav.data != afterValue) {
            trav = trav.next;
        }
        if (trav != null) {
            Node newnode = new Node(newValue);
            newnode.next = trav.next;
            trav.next = newnode;
            if (trav == tail) { // Update tail if added after the last element
                tail = newnode;
            }
        } else {
            System.out.println("Value " + afterValue + " not found in the list.");
        }
    }

    public void insertBefore(int beforeValue, int newValue) {
        if (isEmpty()) {
            System.out.println("List is empty!");
            return;
        }

        if (head.data == beforeValue) {
            addFirst(newValue);
            return;
        }

        Node trav = head;
        while (trav.next != null && trav.next.data != beforeValue) {
            trav = trav.next;
        }

        if (trav.next != null) {
            Node newnode = new Node(newValue);
            newnode.next = trav.next;
            trav.next = newnode;
        } else {
            System.out.println("Value " + beforeValue + " not found in the list.");
        }
    }

    public void display() {
        Node trav = head;
        System.out.print("List: ");
        while (trav != null) {
            System.out.print(trav.data + " ");
            trav = trav.next;
        }
        System.out.println();
    }
}
