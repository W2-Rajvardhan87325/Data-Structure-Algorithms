package com.rajvardhan;

import com.rajvardhan.templates.BinarySearchTree;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Binary Search Tree");
        int choice,element;
        int arrInputs[] = new int[5];
        BinarySearchTree tree = new BinarySearchTree();

        try (Scanner sc = new Scanner(System.in)) {
            while (true) {
                System.out.println("\n\t\tMENU");
                System.out.println("1.ADD NODES\n2.PRE ORDERS\n3.IN ORDER\n4.POST ORDER\n5.RECURSIVE SEARCH\n6.EXIT\n");
                System.out.print("Enter your choice :: ");
                choice = sc.nextInt();
                switch (choice) {
                    case 1:
                        System.out.println("Enter 5 Elements (Separated by Spaces):: ");
                        for (int i = 0; i < 5; i++) {
                            arrInputs[i] = sc.nextInt();
                        }
                        for (int elements : arrInputs) {
                            tree.addNode(elements);
                        }
                        System.out.println("Added Successfully...!");
                        break;

                    case 2:
                        tree.preOrder();
                        break;

                    case 3:
                        tree.inOrder();
                        break;

                    case 4:
                        tree.postOrder();
                        break;

                    case 5:
                        System.out.println("Enter the element to search :: ");
                        element=sc.nextInt();
                        tree.binarySearchRec(element);
                        break;

                    case 6:
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Invalid Choice..!");
                        System.exit(0);
                }
            }
        } catch (Exception exception) {
            exception.printStackTrace();
        }


    }
}