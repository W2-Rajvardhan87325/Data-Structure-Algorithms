package com.rajvardhan;

public class LinearSearch {

	public static int linearSearch(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			boolean isNonRepeating = true;
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] == arr[j] && i != j) {
					isNonRepeating = false;
					break;
				}
			}
			if (isNonRepeating) {
				return arr[i]; // Return the first non-repeating element
			}
		}
		return -1; // If no non-repeating element is found
	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, -1, 2, 1, 0, 4, -1, 7, 8 };

		System.out.println("\t\tLINEAR SEARCH");

		int result = linearSearch(arr);
		if (result == -1) {
			System.out.println("No non-repeating element found.");
		} else {
			System.out.println("First non-repeating element is: " + result);
		}
	}
}
