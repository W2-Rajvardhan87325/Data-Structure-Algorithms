package com.rajvardhan.templates;

public class BinarySearchTree {
    static class Node{
        private int data;
        private Node left;
        private Node right;

        public Node(int value){
            this.data=value;
            this.left=null;
            this.right=null;
        }
    }

    Node root;

    public boolean isEmpty(){
        return root==null;
    }

    public void addNode(int value){
        Node newnode=new Node(value);

        if(root==null) {
            root = newnode;
        }
        else {
            Node trave=root;
            while (true) {
                if (value<trave.data){
                    if (trave.left==null){
                        trave.left=newnode;
                        break;
                    }
                    else{
                        trave=trave.left;
                    }
                }
                else {
                    if (trave.right==null){
                        trave.right=newnode;
                        break;
                    }
                    else {
                        trave=trave.right;
                    }
                }
            }
        }
    }

    public void addNodeRec(int value){
        Node newnode=new Node(value);
        addNodeRecImpl(value,newnode);
    }
    public void addNodeRecImpl(int value,Node trav){
        if(root==null)
            root=trav;
    }

    public void binarySearchRec(int value){
        Node node=binarySearchRecImpl(value,root);
        if (node!=null)
            System.out.println("Element found successfully");
        else
            System.out.println("Element not found");
    }

    private Node binarySearchRecImpl(int value,Node trav){
        if(trav==null)
            return null;
        if(trav.data==value)
            return trav;
        if(trav.data<value){
            return binarySearchRecImpl(value,trav.left);
        }
        else{
            return binarySearchRecImpl(value,trav.right);
        }
    }

    public void preOrder(){
        System.out.print("PreOrder Traversal :: ");
        preOrderImpl(root);
    }
    private void preOrderImpl(Node trave){
        if(trave==null){
            return;
        }
        System.out.print("\t"+trave.data);
        preOrderImpl(trave.left);
        preOrderImpl(trave.right);
    }

    public void inOrder(){
        System.out.print("InOrder Traversal :: ");
        inOrderImpl(root);
    }
    private void inOrderImpl(Node trave){
        if(trave==null){
            return;
        }
        inOrderImpl(trave.left);
        System.out.print("\t"+trave.data);
        inOrderImpl(trave.right);
    }

    public void postOrder(){
        System.out.print("PostOrder Traversal :: ");
        postOrderImpl(root);
    }
    private void postOrderImpl(Node trave){
        if(trave==null){
            return;
        }
        postOrderImpl(trave.left);
        postOrderImpl(trave.right);
        System.out.print("\t"+trave.data);
    }



}
