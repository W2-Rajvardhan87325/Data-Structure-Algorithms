package com.rajvardhan;

import java.util.Scanner;

public class LinkedListMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList list = new LinkedList();
        int choice;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Add First");
            System.out.println("2. Add Last");
            System.out.println("3. Insert After");
            System.out.println("4. Insert Before");
            System.out.println("5. Display");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value to add at the beginning: ");
                    int value1 = sc.nextInt();
                    list.addFirst(value1);
                    break;
                case 2:
                    System.out.print("Enter value to add at the end: ");
                    int value2 = sc.nextInt();
                    list.addLast(value2);
                    break;
                case 3:
                    System.out.print("Enter value to insert after: ");
                    int afterValue = sc.nextInt();
                    System.out.print("Enter new value to insert: ");
                    int newValueAfter = sc.nextInt();
                    list.insertAfter(afterValue, newValueAfter);
                    break;
                case 4:
                    System.out.print("Enter value to insert before: ");
                    int beforeValue = sc.nextInt();
                    System.out.print("Enter new value to insert: ");
                    int newValueBefore = sc.nextInt();
                    list.insertBefore(beforeValue, newValueBefore);
                    break;
                case 5:
                    list.display();
                    break;
                case 6:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 6);

        sc.close();
    }
}
