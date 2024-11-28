package com.rajvardhan;
public class BST {
    static class Node {
        private int data;
        private Node left;
        private Node right;

        public Node(int value) {
            data = value;
            left = right = null;
        }
    }

    private Node root;

    public BST() {
        root = null;
    }

    public boolean isEmpty() {
        return root == null;
    }

    private Node addNodeRecursive(Node root, int value) {
        if (root == null) {
            return new Node(value);
        }
        if (value < root.data) {
            root.left = addNodeRecursive(root.left, value);
        } else {
            root.right = addNodeRecursive(root.right, value);
        }
        return root;
    }

    public void addNode(int value) {
        root = addNodeRecursive(root, value);
    }

    private void inOrder(Node trav) {
        if (trav == null) return;
        inOrder(trav.left);
        System.out.print(trav.data + " ");
        inOrder(trav.right);
    }

    public void inOrder() {
        System.out.print("Inorder Traversal: ");
        inOrder(root);
        System.out.println();
    }

    private void preOrder(Node trav) {
        if (trav == null) return;
        System.out.print(trav.data + " ");
        preOrder(trav.left);
        preOrder(trav.right);
    }

    public void preOrder() {
        System.out.print("Preorder Traversal: ");
        preOrder(root);
        System.out.println();
    }

    private void postOrder(Node trav) {
        if (trav == null) return;
        postOrder(trav.left);
        postOrder(trav.right);
        System.out.print(trav.data + " ");
    }

    public void postOrder() {
        System.out.print("Postorder Traversal: ");
        postOrder(root);
        System.out.println();
    }

    private boolean binarySearchRecursive(Node root, int key) {
        if (root == null) return false;
        if (key == root.data) return true;
        if (key < root.data) return binarySearchRecursive(root.left, key);
        return binarySearchRecursive(root.right, key);
    }

    public boolean binarySearch(int key) {
        return binarySearchRecursive(root, key);
    }
}

