package com.rajvardhan;


import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BST bst = new BST();
        int choice;

        do {
            System.out.println("\n--- Binary Search Tree Operations ---");
            System.out.println("1. Add Node");
            System.out.println("2. Inorder Traversal");
            System.out.println("3. Preorder Traversal");
            System.out.println("4. Postorder Traversal");
            System.out.println("5. Search Node");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the value to add: ");
                    int value = sc.nextInt();
                    bst.addNode(value);
                    System.out.println(value + " added to the BST.");
                    break;
                case 2:
                    bst.inOrder();
                    break;
                case 3:
                    bst.preOrder();
                    break;
                case 4:
                    bst.postOrder();
                    break;
                case 5:
                    System.out.print("Enter the value to search: ");
                    int key = sc.nextInt();
                    if (bst.binarySearch(key)) {
                        System.out.println("Value " + key + " found in the BST.");
                    } else {
                        System.out.println("Value " + key + " not found in the BST.");
                    }
                    break;
                case 6:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 6);

        sc.close();
    }
}

