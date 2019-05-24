package com.problemsolving.practise.queue;

import java.util.PriorityQueue;

public class PriorityQueueJava {

	public static void main(String[] args) {
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		
		pq.add(1);
		pq.add(10);
		pq.add(3);
		pq.add(8);
		pq.add(9);
		pq.add(2);
		
		
		System.out.println(pq.toString());
		System.out.println(pq.remove());
		System.out.println(pq.remove());
		System.out.println(pq.remove());
		
	}
}
