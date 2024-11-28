package com.rajvardhan;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        EmployeeLinkedList list = new EmployeeLinkedList();
        Scanner sc = new Scanner(System.in);

        int choice;
        do {
            System.out.println("\n--- Employee Management Menu ---");
            System.out.println("1. Add Employee");
            System.out.println("2. Display All Employees");
            System.out.println("3. Search Employee by Name");
            System.out.println("4. Delete Employee by EmpID");
            System.out.println("5. Update Employee Salary");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter EmpID: ");
                    int empId = sc.nextInt();
                    sc.nextLine(); // Consume newline
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Salary: ");
                    double salary = sc.nextDouble();
                    list.addEmployee(empId, name, salary);
                    break;
                case 2:
                    list.displayEmployees();
                    break;
                case 3:
                    System.out.print("Enter Name to search: ");
                    sc.nextLine(); // Consume newline
                    String searchName = sc.nextLine();
                    list.searchEmployeeByName(searchName);
                    break;
                case 4:
                    System.out.print("Enter EmpID to delete: ");
                    int deleteId = sc.nextInt();
                    list.deleteEmployeeById(deleteId);
                    break;
                case 5:
                    System.out.print("Enter EmpID to update salary: ");
                    int updateId = sc.nextInt();
                    System.out.print("Enter New Salary: ");
                    double newSalary = sc.nextDouble();
                    list.updateSalary(updateId, newSalary);
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
