package com.rajvardhan;

import com.rajvardhan.templates.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int choice;
        int element;
        int postion;
        System.out.println("Implementation of Linked List ::");

        LinkedList list=new LinkedList();

        try(Scanner sc=new Scanner(System.in)){
            while (true){
                System.out.println("\n\t\tMENU");
                System.out.println("1.ADD FIRST\n2.ADD LAST\n3.REMOVE FIRST\n4.REMOVE LAST\n5.ADD ELEMENT AT POSITION\n6.REMOVE ELEMENT FROM POSITION\n7.DISPLAYING\n8.DISPLAYING REVERSE\n9.CALCULATE MID\n10.EXIT");
                System.out.print("Enter your choice :: ");
                choice=sc.nextInt();

                switch (choice){
                    case 1:
                        System.out.println("\t\tADD ELEMENT AT FIRST POSITION");
                        System.out.print("Enter the element :: ");
                        element=sc.nextInt();
                        list.addFirst(element);
                        break;

                    case 2:
                        System.out.println("\t\tADD ELEMENT AT LAST POSITION");
                        System.out.print("Enter the element :: ");
                        element=sc.nextInt();
                        list.addLast(element);
                        break;

                    case 3:
                        list.removeFirst();
                        System.out.println("Element removed successfully..!");
                        break;
                    case 4:
                        list.removeLast();
                        System.out.println("Element removed successfully..!");
                        break;

                    case 5:
                        System.out.println("\t\tADD ELEMENT AT SPECIFIED POSITION");
                        System.out.print("Enter the element    :: ");
                        element=sc.nextInt();
                        System.out.print("Enter the position ::");
                        postion=sc.nextInt();
                        list.addElementPos(postion,element);
                        break;

                    case 6:
                        System.out.print("Enter the element    :: ");
                        element=sc.nextInt();
                        System.out.print("Enter the position ::");
                        postion=sc.nextInt();
                        list.removeElementPos(postion,element);
                        System.out.println("Element removed successfully..!");
                        break;

                    case 7:
                        System.out.println("\t\tDISPLAYING");
                        list.displayList();
                        break;

                    case 8:
                        System.out.println("\t\tDISPLAYING IN REVERSE ORDER");
                        list.displayReverse();
                        break;

                    case 9:
                        System.out.println("\t\tDISPLAYING MID");
                        list.calculateMid();
                        break;

                    case 10:
                        System.out.println("Exiting code...!");
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Invalid Choice..!");
                        System.exit(0);
                }
            }
        }
        catch (Throwable e){
           e.printStackTrace();
        }
    }
}