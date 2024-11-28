/*
 * Author   :: Rajvardhan Patil
 * Question :: Write a function to sort employees by their salary
 */

package com.rajvardhan;

public class EmployeeSort {

    public static void sortEmployeesBySalary(Employee[] employees) {
        // Simple sorting logic using a basic loop (Bubble Sort here for simplicity)
        for (int i = 0; i < employees.length - 1; i++) {
            for (int j = 0; j < employees.length - i - 1; j++) {
                if (employees[j].salary > employees[j + 1].salary) {
                    // Swap employees[j] and employees[j + 1]
                    Employee temp = employees[j];
                    employees[j] = employees[j + 1];
                    employees[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        Employee[] employees = {
                new Employee("Raj", 50000),
                new Employee("Shreyash", 45000),
                new Employee("Shubham", 70000)
        };

        System.out.println("Before Sorting:");
        for (Employee e : employees) {
            System.out.println(e);
        }

        sortEmployeesBySalary(employees);

        System.out.println("\nAfter Sorting by Salary:");
        for (Employee e : employees) {
            System.out.println(e);
        }
    }
}