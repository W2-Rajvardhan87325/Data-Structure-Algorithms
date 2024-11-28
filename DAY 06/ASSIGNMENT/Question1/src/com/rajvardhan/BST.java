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

    public void addNode(int value) {
        Node newNode = new Node(value);
        if (root == null) {
            root = newNode;
        } else {
            Node trav = root;
            while (true) {
                if (value < trav.data) {
                    if (trav.left == null) {
                        trav.left = newNode;
                        break;
                    } else {
                        trav = trav.left;
                    }
                } else {
                    if (trav.right == null) {
                        trav.right = newNode;
                        break;
                    } else {
                        trav = trav.right;
                    }
                }
            }
        }
    }

    private Node getSuccessor(Node node) {
        Node trav = node.right;
        while (trav != null && trav.left != null) {
            trav = trav.left;
        }
        return trav;
    }

    public void deleteNode(int key) {
        root = deleteNodeRecursive(root, key);
    }

    private Node deleteNodeRecursive(Node trav, int key) {
        if (trav == null) {
            return null;
        }

        if (key < trav.data) {
            trav.left = deleteNodeRecursive(trav.left, key);
        } else if (key > trav.data) {
            trav.right = deleteNodeRecursive(trav.right, key);
        } else {
            if (trav.left == null) {
                return trav.right;
            } else if (trav.right == null) {
                return trav.left;
            }

            Node successor = getSuccessor(trav);
            trav.data = successor.data;
            trav.right = deleteNodeRecursive(trav.right, successor.data);
        }

        return trav;
    }

    public void inOrderTraversal(Node trav) {
        if (trav != null) {
            inOrderTraversal(trav.left);
            System.out.print(trav.data + " ");
            inOrderTraversal(trav.right);
        }
    }

    public void inOrderTraversal() {
        inOrderTraversal(root);
    }
}
