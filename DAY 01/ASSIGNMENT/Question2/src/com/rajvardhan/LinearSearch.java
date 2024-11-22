package com.rajvardhan;

import java.util.Scanner;

public class LinearSearch {

	public static int linearSearch(int arr[], int element) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			count++;
			if (arr[i] == element) {
				System.out.println("Number of Comparisons :: " + count);
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {

		int arr[] = { 10, 20, 30, 40, 50, 60, 70 };
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("\t\tLINEAR SEARCH");
			System.out.print("Enter the element to search :: ");
			int element = sc.nextInt();

			int eleIndex = linearSearch(arr, element);

			if (eleIndex == -1) {
				System.out.println("Given element does not exists..!");
			} else {
				System.out.print("Element is at index :: " + eleIndex);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
