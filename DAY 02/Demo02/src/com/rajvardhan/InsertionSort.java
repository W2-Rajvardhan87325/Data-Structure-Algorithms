package com.rajvardhan;

import java.util.Arrays;

public class InsertionSort {

	public static void insertionSort(int arr[], int size) {
		for (int i = 1; i < size; i++) {
			System.out.println("===========PASS " + i + " ==============");
			int temp = arr[i];
			int j;
			for (j = i - 1; j >= 0; j--) {
				if (arr[j] > temp)
					arr[j + 1] = arr[j];
				else
					break;
				System.out.println("Arrays :: " + Arrays.toString(arr)+ "\tTEMP :: "+temp);
			}
			arr[j + 1] = temp;
		}
	}

	public static void main(String[] args) {

		int arr[] = { 33, 22, 66, 55, 44, 11 };

		System.out.println("\t\tINSERTION SORT");
		System.out.println("Array before sorting :: " + Arrays.toString(arr));
		insertionSort(arr, arr.length);
		System.out.println("Array after sorting :: " + Arrays.toString(arr));
	}
}
