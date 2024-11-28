package com.rajvardhan.templates;

public class LinkedList {
    static class Node{
        private int data;
        private Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head;

    public LinkedList(){
        head=null;
    }

    public boolean isEmpty(){
        return head==null;
    }
    public void deleteAll(){
        head=null;
    }

    public void addFirst(int value){
        Node newnode=new Node(value);
        newnode.next=head;
        head=newnode;
    }

    public void addLast(int value){
        Node newnode=new Node(value);
        if (head==null)
            head=newnode;
        else {
            Node trav=head;
            while (trav.next!=null){
                trav=trav.next;
            }
            trav.next=newnode;
        }
    }

    public void addElementPos(int position,int value){
        Node newnode=new Node(value);
        if (head==null)
            head=newnode;
        else if (position<=1) {
            addFirst(value);
        }
        else {
            Node trav = head;
            for(int i = 1 ; i < position - 1 && trav.next != null ; i++) {
                trav = trav.next;
            }
            newnode.next = trav.next;
            trav.next = newnode;
        }
    }

    public void removeElementPos(int position,int value){
        if (head==null)
            return;
        else if (position<=1) {
            removeFirst();
        }
        else {
            Node trav = head;
            for(int i = 1 ; i < position - 1 && trav.next.next != null ; i++) {
                trav = trav.next;
            }
            trav.next = trav.next.next;
        }
    }

    public void removeFirst(){
        if(head==null)
            return;
        head=head.next;
    }

    public void removeLast(){
        if(head==null)
            return;

        Node trav=head;
        while (trav.next.next!=null){
            trav=trav.next;
        }
        trav.next=null;
    }
    public void displayList(){
        Node trav =head;
        System.out.print("Elements :: ");
        while (trav!=null){
            System.out.print("\t"+trav.data);
            trav=trav.next;
        }
    }

    public void displayReverse(){
        Node node=head;
        reverse(node);
    }

    private void reverse(Node start){
        if (start==null)
            return;
        reverse(start.next);
        System.out.print("\t"+start.data);
    }

    public void calculateMid(){
        Node slow=head,fast=head;
        while (fast!=null&& fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        if (slow!=null){
            System.out.println("Mid :: "+slow.data);
        }
    }

}
