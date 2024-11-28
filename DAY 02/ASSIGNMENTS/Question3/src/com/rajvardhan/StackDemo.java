/*
 * Author   :: Rajvardhan Patil
 * Question :: Write program to implement descending stack (start top at size)
 */

package com.rajvardhan;

public class StackDemo {
    public static void main(String[] args) {
        Stack stack = new Stack(5);

        stack.display();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.display();

        System.out.println("Popped element: " + stack.pop());
        stack.display();
        stack.push(40);
        stack.push(50);
        stack.push(60);
    }
}