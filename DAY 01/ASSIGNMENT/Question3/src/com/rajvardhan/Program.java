package com.rajvardhan;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import com.rajvardhan.entities.Employee;

public class Program {

	public static Employee searchEmployeeById(List<Employee> emplist, int id) {
		for (Employee emp : emplist) {
			if (emp.getEmpId() == id) {
				return emp;
			}
		}
		return null;
	}

	public static Employee searchEmployeeByName(List<Employee> emplist, String name) {
		for (Employee emp : emplist) {
			if (emp.getEmpName().equals(name)) {
				return emp;
			}
		}
		return null;
	}

	public static void main(String[] args) {
		List<Employee> list = new ArrayList<Employee>();
		int choice = 0;
		Employee emp = null;
		try (Scanner sc = new Scanner(System.in)) {

			list.add(new Employee(1, "Raj", "IT"));
			list.add(new Employee(2, "Ananya", "HR"));
			list.add(new Employee(3, "Vikram", "Finance"));
			list.add(new Employee(4, "Priya", "Marketing"));
			list.add(new Employee(5, "Amit", "Operations"));

			System.out.println("1. SEARCH BY ID");
			System.out.println("2. SEARCH BY NAME");
			System.out.print("ENTER YOUR CHOICE :: ");
			choice = sc.nextInt();
			sc.nextLine();

			switch (choice) {
			case 1:
				System.out.print("Enter the ID of Employee   :: ");
				int id = sc.nextInt();
				emp = searchEmployeeById(list, id);
				break;

			case 2:
				System.out.print("Enter the Name of Employee :: ");
				String name = sc.next();
				emp = searchEmployeeByName(list, name);
				break;

			default:
				System.out.println("Invalid Choice...!");
				break;
			}

			if (emp != null) {
				System.out.println("Employee found...!");
				System.out.println(emp.toString());
			} else {
				System.out.println("Employee not found..!");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
