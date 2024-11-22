package com.Rajvardhan;

import java.util.Scanner;

public class DecimalToBinary {

	public static StringBuilder decToBinary(int num) {
		StringBuilder binary = new StringBuilder();
		while (num > 0) {
			binary = binary.append(num % 2 + " ");
			num = num / 2;
		}
		binary.reverse();
		return binary;
	}

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Enter the Number to convert ::");
			int number = sc.nextInt();
			System.out.println("Binary of " + number + " :: " + decToBinary(number));
		} catch (Exception e) {

		}
	}

}
