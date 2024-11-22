package com.rajvardhan;

import java.util.Arrays;

public class Program {

	public static void selectionSort(int arr[], int length) {

		for (int selected = 0; selected < length-1; selected++) {
			System.out.println("==============PASS " + selected + "=================");
			for (int j = selected + 1; j < length; j++) {
				if (arr[selected] > arr[j]) {
					int temp = arr[selected];
					arr[selected] = arr[j];
					arr[j] = temp;
				}
				System.out.println("Array ::" + Arrays.toString(arr));
			}
		}
	}

	public static void main(String[] args) {

		int arr[] = {44,11,55,22,66,33};

		System.out.println("\t\tSELECTION SORT");

		System.out.println("Arrays Before Sort ::" + Arrays.toString(arr));

		selectionSort(arr, arr.length);

		System.out.println("Arrays After Sort ::" + Arrays.toString(arr));
	}
}
