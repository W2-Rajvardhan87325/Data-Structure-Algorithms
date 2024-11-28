package com.rajvardhan;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        CircularLinkedList list = new CircularLinkedList();
        Scanner sc = new Scanner(System.in);

        int choice, value, position;

        do {
            System.out.println("\n--- Singly Circular Linked List Menu ---");
            System.out.println("1. Add First");
            System.out.println("2. Add Last");
            System.out.println("3. Add at Position");
            System.out.println("4. Delete First");
            System.out.println("5. Delete Last");
            System.out.println("6. Delete at Position");
            System.out.println("7. Display List");
            System.out.println("8. Delete All");
            System.out.println("9. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value to add at the beginning: ");
                    value = sc.nextInt();
                    list.addFirst(value);
                    System.out.println("Value added at the beginning.");
                    break;
                case 2:
                    System.out.print("Enter value to add at the end: ");
                    value = sc.nextInt();
                    list.addLast(value);
                    System.out.println("Value added at the end.");
                    break;
                case 3:
                    System.out.print("Enter value to add: ");
                    value = sc.nextInt();
                    System.out.print("Enter position to add at (1-based): ");
                    position = sc.nextInt();
                    list.addAtPosition(value, position);
                    break;
                case 4:
                    list.deleteFirst();
                    System.out.println("First node deleted.");
                    break;
                case 5:
                    list.deleteLast();
                    System.out.println("Last node deleted.");
                    break;
                case 6:
                    System.out.print("Enter position to delete (1-based): ");
                    position = sc.nextInt();
                    list.deleteAtPosition(position);
                    break;
                case 7:
                    list.display();
                    break;
                case 8:
                    list.deleteAll();
                    System.out.println("All nodes deleted.");
                    break;
                case 9:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        } while (choice != 9);

        sc.close();
    }
}
