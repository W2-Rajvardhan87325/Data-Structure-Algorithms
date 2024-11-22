package com.rajvardhan;

import java.util.Scanner;

public class LinearSearch {

	public static void linearSearch(int arr[], int element) {

		try (Scanner sc = new Scanner(System.in)) {
			int count = 0;
			int index[] = new int[arr.length];
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] == element) {
					count++;
					index[count] = i;
				}
			}
			System.out.println("Number of Occurances :: " + count);

			System.out.print("Enter Occurance :: ");
			int value = sc.nextInt();

			System.out.println("Index :: " + index[value]);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {

		int arr[] = { 10, 20, 10, 40, 50, 10, 70 };
		try (Scanner sc = new Scanner(System.in)) {

			System.out.println("\t\tLINEAR SEARCH");
			System.out.print("Enter the element to search :: ");
			int element = sc.nextInt();

			linearSearch(arr, element);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
