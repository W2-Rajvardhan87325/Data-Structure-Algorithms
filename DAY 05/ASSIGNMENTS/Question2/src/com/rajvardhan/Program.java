package com.rajvardhan;


public class Program {
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

    public Program() {
        root = null;
    }

    private Node addRecursive(Node root, int value) {
        if (root == null) {
            return new Node(value);
        }
        if (value < root.data) {
            root.left = addRecursive(root.left, value);
        } else if (value > root.data) {
            root.right = addRecursive(root.right, value);
        }
        return root;
    }

    public void addNode(int value) {
        root = addRecursive(root, value);
    }

    private boolean searchRecursive(Node root, int key) {
        if (root == null) return false;
        if (key == root.data) return true;
        if (key < root.data) return searchRecursive(root.left, key);
        return searchRecursive(root.right, key);
    }

    public boolean search(int key) {
        return searchRecursive(root, key);
    }

    public static void main(String[] args) {
        Program bst = new Program();
        bst.addNode(50);
        bst.addNode(30);
        bst.addNode(70);
        bst.addNode(20);
        bst.addNode(40);

        int key = 40;
        if (bst.search(key)) {
            System.out.println("Key " + key + " found in BST.");
        } else {
            System.out.println("Key " + key + " not found in BST.");
        }

        key = 25;
        if (bst.search(key)) {
            System.out.println("Key " + key + " found in BST.");
        } else {
            System.out.println("Key " + key + " not found in BST.");
        }
    }
}
