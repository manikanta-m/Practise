package com.problemsolving.practise.queue;

public class Queue {

	int[] arr;

	int front, rear, size;

	// constructor
	Queue(int size) {
		arr = new int[size];
		this.size = size;
		this.front = this.rear = 0;
	}

	// add
	public void add(int n) {
		
	}

	// remove
	public int remove() {

		return 1;
	}

	// peek
	public int get() {
		return 1;
	}

	public static void main(String[] args) {
		Queue queue = new Queue(100);

	}
}
