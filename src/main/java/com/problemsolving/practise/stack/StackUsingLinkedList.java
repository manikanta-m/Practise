package com.problemsolving.practise.stack;

public class StackUsingLinkedList {

	StackNode root;

	static class StackNode {
		int data;
		StackNode next;

		StackNode(int data) {
			this.data = data;
			next = null;
		}

	}

	// is empty
	public boolean isEmpty() {
		if (root == null)
			return true;
		else
			return false;
	}

	// push
	public void push(int data) {
		if (root == null) {
			root = new StackNode(data);
		} else {
			StackNode temp = root;
			root = new StackNode(data);
			root.next = temp;
		}
	}

	// pop
	public int pop() {
		int responseVal = Integer.MIN_VALUE;
		if (isEmpty()) {
			System.out.println("stack is empty");
		} else {
			System.out.println("removing element from stack " + root.data);
			responseVal = root.data;
			root = root.next;
		}
		return responseVal;
	}

	// peek
	public int peek() {
		int responseVal = Integer.MIN_VALUE;
		if (isEmpty()) {
			System.out.println("stack is empty");
		} else {
			System.out.println("retriving element from stack " + root.data);
			responseVal = root.data;
		}
		return responseVal;
	}

	public static void main(String[] args) {
		StackUsingLinkedList stack = new StackUsingLinkedList();

		stack.push(1);
		stack.push(3);
		stack.push(6);
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		stack.push(5);
		stack.pop();
		stack.push(7);
		stack.peek();
	}

}
