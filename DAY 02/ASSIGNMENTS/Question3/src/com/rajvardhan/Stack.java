package com.rajvardhan;

class Stack {
    private final int[] stack;
    private int top;

    public Stack(int size) {
        stack = new int[size];
        top = size; // Start top at the maximum size
    }

    public void push(int value) {
        if (top == 0) {
            System.out.println("Stack Overflow! Cannot add more elements.");
            return;
        }
        top--; // Move top downwards
        stack[top] = value;
    }

    public int pop() {
        if (top == stack.length) {
            System.out.println("Stack Underflow! No elements to pop.");
            return -1;
        }
        int value = stack[top];
        top++; // Move top upwards
        return value;
    }

    public void display() {
        if (top == stack.length) {
            System.out.println("Stack is empty.");
            return;
        }
        System.out.print("Stack elements (top to bottom): ");
        for (int i = top; i < stack.length; i++) {
            System.out.print(stack[i] + " ");
        }
        System.out.println();
    }
}

