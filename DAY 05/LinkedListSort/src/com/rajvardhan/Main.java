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
                System.out.println("1.ADD FIRST\n2.ADD LAST\n3.DISPLAYING\n4.SORT\n5.EXIT");
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
                        System.out.println("\t\tDISPLAYING");
                        list.displayList();
                        break;

                    case 4:
                        System.out.println("\t\tSORT");
                        list.LLSort();
                        break;

                    case 5:
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