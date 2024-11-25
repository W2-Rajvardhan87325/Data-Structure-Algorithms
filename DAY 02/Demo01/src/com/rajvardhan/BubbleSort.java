package com.rajvardhan;

import java.util.Arrays;

public class BubbleSort {

	public static void bubbleSort(int arr[], int size) {
		boolean status=true;
		for (int i = 1; i < size; i++) {
			System.out.println("=========PASS " + i + "===========");
			for (int j = 0; j < size - i; j++) {

				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					status=false;
				}
				System.out.println("Array :: " + Arrays.toString(arr));
			}
			if(status)
				break;	
		}
	}

	public static void main(String[] args) {

		int arr[] = { 33, 22, 66, 55, 44, 11 };

		System.out.println("\t\tBUBBLE SORT");
		System.out.println("Array before sorting :: " + Arrays.toString(arr));
		bubbleSort(arr, arr.length);
		System.out.println("Array after sorting :: " + Arrays.toString(arr));
	}
}
