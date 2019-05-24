package com.problemsolving.practise.stack;

import java.util.Arrays;

public class StackUsingArray {
	int[] arr;
	int top;
	int size;

	public StackUsingArray(int maxelements) {
		arr = new int[maxelements];
		top = -1;
		size = maxelements;
	}

	// add element to stack as push implementation
	public boolean push(int n) {
		// check for overflow
		if (top >= size - 1) {
			System.out.println("overflow");
			return false;
		} else {
			arr[++top] = n;
			System.out.println("element added to stack " + n);
			return true;
		}
	}

	// remove element from stack as pop implementation
	public int pop() {
		// check for underflow
		if (isEmpty()) {
			System.out.println("underflow");
			return 0;
		} else {
			System.out.println("removing element "+arr[top]);
			return arr[top--];
		}
	}

	// checking is stack empty
	public boolean isEmpty() {
		return top < 0;
	}

	public static void main(String[] args) {
		StackUsingArray stack = new StackUsingArray(100);
		System.out.println(Arrays.toString(stack.arr));
		stack.push(1);
		stack.push(2);
		System.out.println(Arrays.toString(stack.arr));
		stack.pop();
		System.out.println(Arrays.toString(stack.arr));
		stack.push(4);
		System.out.println(Arrays.toString(stack.arr));
	}

}