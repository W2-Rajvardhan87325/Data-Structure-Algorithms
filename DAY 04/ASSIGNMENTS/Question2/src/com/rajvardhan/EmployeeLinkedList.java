package com.rajvardhan;

public class EmployeeLinkedList {
    private Employee head;

    public EmployeeLinkedList() {
        head = null;
    }

    // Add employee to the end of the list
    public void addEmployee(int empId, String name, double salary) {
        Employee newEmployee = new Employee(empId, name, salary);
        if (head == null) {
            head = newEmployee;
        } else {
            Employee temp = head;
            while (temp.getNext() != null) {
                temp = temp.getNext();
            }
            temp.setNext(newEmployee);
        }
        System.out.println("Employee added successfully!");
    }

    // Display all employees
    public void displayEmployees() {
        if (head == null) {
            System.out.println("No employees in the list.");
            return;
        }
        System.out.println("Employee List:");
        Employee temp = head;
        while (temp != null) {
            System.out.println(temp);
            temp = temp.getNext();
        }
    }

    // Search employee by name
    public void searchEmployeeByName(String name) {
        Employee temp = head;
        boolean found = false;
        while (temp != null) {
            if (temp.getName().equalsIgnoreCase(name)) {
                System.out.println("Employee Found: " + temp);
                found = true;
            }
            temp = temp.getNext();
        }
        if (!found) {
            System.out.println("Employee with name '" + name + "' not found.");
        }
    }

    // Delete employee by empId
    public void deleteEmployeeById(int empId) {
        if (head == null) {
            System.out.println("No employees to delete.");
            return;
        }
        if (head.getEmpId() == empId) {
            head = head.getNext();
            System.out.println("Employee with EmpID " + empId + " deleted.");
            return;
        }
        Employee temp = head, prev = null;
        while (temp != null && temp.getEmpId() != empId) {
            prev = temp;
            temp = temp.getNext();
        }
        if (temp == null) {
            System.out.println("Employee with EmpID " + empId + " not found.");
        } else {
            prev.setNext(temp.getNext());
            System.out.println("Employee with EmpID " + empId + " deleted.");
        }
    }

    // Update salary of an employee by empId
    public void updateSalary(int empId, double newSalary) {
        Employee temp = head;
        while (temp != null) {
            if (temp.getEmpId() == empId) {
                temp.setSalary(newSalary);
                System.out.println("Salary updated successfully for EmpID " + empId);
                return;
            }
            temp = temp.getNext();
        }
        System.out.println("Employee with EmpID " + empId + " not found.");
    }
}

