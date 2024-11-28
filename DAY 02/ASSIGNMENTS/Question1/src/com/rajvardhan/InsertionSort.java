/*
 * Author   :: Rajvardhan Patil
 * Question :: Modify the insertion sort algorithm to sort the array in descending order
 */

package com.rajvardhan;

import java.util.Arrays;

public class InsertionSort {

    public static void insertionSortDescending(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;

            // Compare and shift elements to sort in descending order
            while (j >= 0 && arr[j] < key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        int arr[] = { 10, 20, 30, 40, 50, 60, 20 };

        System.out.println("Original Array: " + Arrays.toString(arr));

        insertionSortDescending(arr);

        System.out.println("Sorted Array in Descending Order: " + Arrays.toString(arr));
    }
}
