package com.Rajvardhan;

public class ArraySum {

	public static int arrSum(int arr[]) {
		int result = 0;
		for (int i = 0; i < arr.length; i++) {
			result += arr[i];
		}
		return result;
	}

	public static void main(String[] args) {

		int array[] = { 10, 30, 40, 60, 80, 20 };

		System.out.println("Result :: " + arrSum(array));

	}

}
