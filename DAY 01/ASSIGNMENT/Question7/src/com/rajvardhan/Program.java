package com.rajvardhan;

import java.util.Arrays;
import java.util.Scanner;

public class Program {

	public static void linearSearch(int arr[], int size, int num) {
		int rank = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] <= num) {
				rank++;
			}
		}
		System.out.println("Rank ::" + rank);
	}

	public static void main(String[] args) {

		int arr[] = { 10, 20, 15, 3, 4, 4, 1 };

		System.out.println("Array :: " + Arrays.toString(arr));

		int number = 0;

		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Enter number to check the rank :: ");
			number = sc.nextInt();
			linearSearch(arr, arr.length, number);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
