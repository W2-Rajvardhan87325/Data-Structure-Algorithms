package com.rajvardhan;

public class StackImpl {
    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};
        System.out.println("Original Array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();


        Stack stack = new Stack(arr.length);

        for (int num : arr) {
            stack.push(num);
        }

        // Pop all elements from the stack back into the array (reversing it)
        for (int i = 0; i < arr.length; i++) {
            arr[i] = stack.pop();
        }

        // Display the reversed array
        System.out.println("Reversed Array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
