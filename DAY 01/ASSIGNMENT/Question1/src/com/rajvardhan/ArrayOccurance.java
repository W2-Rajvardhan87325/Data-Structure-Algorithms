/*
 * Author   :: Rajvardhan Patil
 * Question :: Write a linear search algorithm to return index of last occur of key
 * */

package com.rajvardhan;

import java.util.Scanner;

public class ArrayOccurance {

	public static int linearSearch(int arr[], int element) {
		int lastIndex=-1;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]==element) {
				lastIndex=i;
			}	
		}
		return lastIndex;
	}
	
	public static void main(String[] args) {
		int arr[] = { 10, 20, 30, 40, 50, 60, 20 };
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
