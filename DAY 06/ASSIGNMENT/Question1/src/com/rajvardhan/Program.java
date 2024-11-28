package com.rajvardhan;

public class Program {
    public static void main(String[] args) {
        BST bst = new BST();

        // Adding nodes to the BST
        bst.addNode(50);
        bst.addNode(30);
        bst.addNode(70);
        bst.addNode(20);
        bst.addNode(40);
        bst.addNode(60);
        bst.addNode(80);

        System.out.println("In-order Traversal Before Deletion:");
        bst.inOrderTraversal();

        int keyToDelete = 50;
        bst.deleteNode(keyToDelete);

        System.out.println("\nIn-order Traversal After Deletion of Node " + keyToDelete + ":");
        bst.inOrderTraversal();
    }
}
