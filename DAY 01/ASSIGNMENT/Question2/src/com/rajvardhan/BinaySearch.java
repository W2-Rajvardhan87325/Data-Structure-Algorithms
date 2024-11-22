package com.rajvardhan;

import java.util.Scanner;

public class BinaySearch {

	public static int binarySearch(int arr[], int element) {
		int left = 0;
		int right = arr.length - 1;
		int mid;
		int count = 0;

		while (left <= right) {
			count++;
			mid = (left + right) / 2;

			if (arr[mid] == element) {
				System.out.println("Number of Comparisons :: " + count);
				return mid;
			}
			if (arr[mid] < element) {
				left = mid + 1;
			}
			if (arr[mid] > element) {
				right = mid - 1;
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

			int eleIndex = binarySearch(arr, element);

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
